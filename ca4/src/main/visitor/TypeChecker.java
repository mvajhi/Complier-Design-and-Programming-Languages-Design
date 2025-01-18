package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.BoolValue;
import main.ast.nodes.expression.value.IntValue;
import main.ast.nodes.expression.value.StringValue;
import main.ast.nodes.statements.*;
import main.ast.nodes.type.*;
import main.compileError.CompileError;
import main.compileError.type.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.items.*;
import main.ast.nodes.expression.operator.*;

import java.util.*;

public class TypeChecker extends Visitor<Type>{
    private SymbolTable currentSymbolTable;
    private Expression currentCaller;
    public ArrayList<CompileError> typeErrors = new ArrayList<>();

    public ActorDecItem currentVisitingActor = null;

    private void visitRecords(ArrayList<RecordNode> records){
        for (RecordNode recordNode : records) {
            RecordNodeItem recordNodeItem = new RecordNodeItem(recordNode);
            try {
                SymbolTable.root.put(recordNodeItem);
            } catch (ItemAlreadyExists ignored) {}
        }

        for (RecordNode recordNode : records)
            recordNode.accept(this);
    }

    private void visitActors(ArrayList<ActorDec> actors){
        for (ActorDec actorDec : actors) {
            ActorDecItem actorDecItem = new ActorDecItem(actorDec);
            try {
                SymbolTable.root.put(actorDecItem);
            } catch (ItemAlreadyExists ignored) {}
        }

        for (ActorDec actorDec : actors)
            actorDec.accept(this);
    }

    private ActorDecItem findActorDecItem(ActorDec actorDec) throws ItemNotFound {
        return (ActorDecItem) SymbolTable.root.getItem(ActorDecItem.START_KEY + actorDec.getName().getName());
    }

    private RecordNodeItem findRecordItem(RecordNode recordNode) throws ItemNotFound {
        return (RecordNodeItem) SymbolTable.root.getItem(RecordNodeItem.START_KEY + recordNode.getId().getName());
    }

    @Override
    public Type visit(Soact soact) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        soact.setSymbolTable(SymbolTable.top);

        visitRecords(soact.getRecords());
        visitActors(soact.getActorDecs());

        if (soact.getMain() != null) {
            soact.getMain().accept(this);
        }

        for (CompileError compileError : this.typeErrors) {
            System.out.println(compileError.getErrorMessage());
        }

        return null;
    }

    @Override
    public Type visit(RecordNode recordNode) {
        SymbolTable.push(new SymbolTable());
        try {
            RecordNodeItem recordNodeItem = findRecordItem(recordNode);
            for (VarDeclaration varDeclaration : recordNode.getVars()) {
                varDeclaration.accept(this);
                recordNodeItem.addField(varDeclaration);
            }
        } catch (ItemNotFound ignored) {}

        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(ActorDec actorDec) {
        currentSymbolTable = actorDec.getSymbolTable();

        try {
            ActorDecItem actorDecItem = findActorDecItem(actorDec);
            currentVisitingActor = actorDecItem;

            for (CustomPrimitiveDeclaration customPrimitiveDeclaration : actorDec.getCustomPrimitiveDeclarations()) {
                try {
                    SymbolTable.root.put(new CustomPrimitiveDeclarationItem(customPrimitiveDeclaration));
                }catch (ItemAlreadyExists ignored){}
                customPrimitiveDeclaration.accept(this);
            }

            for (VarDeclaration varDeclaration : actorDec.getActorVars())
                varDeclaration.accept(this);

            for (Handler handler : actorDec.getMsgHandlers()){
                handler.accept(this);
                try {
                    if (handler instanceof ServiceHandler serviceHandler)
                        actorDecItem.addServiceHandler(serviceHandler);
                    else if (handler instanceof  ObserveHandler observeHandler)
                        actorDecItem.addObservationHandler(observeHandler);
                }catch (ItemAlreadyExists ex){
                    typeErrors.add(new HandlerRedefenition(handler.getName().getName(), handler.getLine()));//TODO: sample error
                }
            }

            if (actorDec.isHasConstructor()) {
                for (VarDeclaration arg : actorDec.getConstructorArgs())
                    actorDecItem.addConstructorArgType(arg.getType());
                //TODO : should add constructor to actorDec
            }
            currentVisitingActor = null;
        } catch (ItemNotFound ignored) {}

        return null;
    }

    @Override
    public Type visit(ServiceHandler serviceHandler) {
        currentSymbolTable = serviceHandler.getSymbolTable();

        for (VarDeclaration arg : serviceHandler.getArgs())
            arg.accept(this);
        for (Statement statement : serviceHandler.getBody())
            statement.accept(this);

        // Error 8
        boolean isAllSet = true;
        Expression problematicExp = null;
        for (Expression expression : serviceHandler.getAuthorizationExpressions()) {
            Type temp = expression.accept(this);
            if (!(temp instanceof SetType)) {
                isAllSet = false;
                if (problematicExp == null)
                    problematicExp = expression;
            }
        }
        if (!isAllSet)
            typeErrors.add(new NunSetAccessLevel(serviceHandler.getLine()));
        // Error 8

        return null;
    }

    @Override
    public Type visit(ObserveHandler observeHandler) {
        currentSymbolTable = observeHandler.getSymbolTable();

        for (VarDeclaration arg : observeHandler.getArgs())
            arg.accept(this);
        for (Statement statement : observeHandler.getBody())
            statement.accept(this);
        for (Expression expression : observeHandler.getAuthorizationExpressions())
            expression.accept(this);

        return null;
    }

    @Override
    public Type visit(Main main) {
        currentSymbolTable = main.getSymbolTable();
        for(Statement statement : main.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public Type visit(CustomPrimitiveDeclaration customPrimitiveDeclaration) {
        return null;
    }

    public Type visit(IfStatement ifStatement) {
        SymbolTable.push(SymbolTable.top.copy());

        boolean isAllBool = true;

        if (ifStatement.getIfConds() instanceof ExpressionList)
            for (Expression expr : ((ExpressionList) ifStatement.getIfConds()).getExpressionList()) {
                Type exprType = expr.accept(this);
                if (!(exprType instanceof BooleanType)) {
                    isAllBool = false;
                }
            }
        else {
            Type exprType = ifStatement.getIfConds().accept(this);
            if (!(exprType instanceof BooleanType)) {
                isAllBool = false;
            }
        }

        if (ifStatement.getElseIfBlocksConds() != null) {
            for (Expression exprs : ifStatement.getElseIfBlocksConds()) {
                if (exprs instanceof ExpressionList)
                    for (Expression expr : ((ExpressionList) exprs).getExpressionList()) {
                        Type exprType = expr.accept(this);
                        if (!(exprType instanceof BooleanType)) {
                            isAllBool = false;
                        }
                    }
                else {
                    Type exprType = exprs.accept(this);
                    if (!(exprType instanceof BooleanType)) {
                        isAllBool = false;
                    }
                }
            }
        }

        if(!isAllBool)
            typeErrors.add(new ConditionIsNotBool(ifStatement.getLine()));

        for (Statement stmt : ifStatement.getIfBody())
            stmt.accept(this);

        if (ifStatement.getElseIfBlocksBody() != null) {
            for (ArrayList<Statement> stmts : ifStatement.getElseIfBlocksBody()) {
                for (Statement stmt : stmts)
                    stmt.accept(this);
            }
        }

        if (ifStatement.getElseBody() != null) {
            for (Statement stmt : ifStatement.getElseBody()) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(ForStatement forStatement) {
        // Error 7
        currentSymbolTable = forStatement.getSymbolTable();
        ArrayList<Expression> expressions = forStatement.getConditions();
        if (expressions.size() == 1) {
            Type containerType = expressions.getFirst().accept(this);
            if (!containerType.hasSameType(new ArrayType())) {
                typeErrors.add(new IsNotIterable(forStatement.getLine()));
                return null;
            }
        }

        for (Statement statement : forStatement.getBody()) {
            statement.accept(this);
        }
        // Error 7

        return null;
    }

    @Override
    public Type visit(JoinStatement joinStatement) {
        SymbolTable.push(SymbolTable.top.copy());
        for (Statement statement : joinStatement.getBody())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(PipeStatement pipeStatement) {
        Expression assigneeExpr = pipeStatement.getAssignee();
        Expression assignedExpr = pipeStatement.getAssigned();
        Expression pipeExprs = pipeStatement.getPipeExpressions();

        Type assigneeType = assigneeExpr.accept(this);
        Type assignedType = assignedExpr.accept(this);

        if(!assigneeType.hasSameType(assignedType)) {
            //typeErrors.add(new NonSameOperands(pipeStatement.getLine(), ));
            //TODO: may need to add new error class!
        }

        if (pipeExprs instanceof ExpressionList) {
            for (Expression expr : ((ExpressionList) pipeExprs).getExpressionList()) {
                expr.accept(this);
            }
        } else {
            pipeExprs.accept(this);
        }

        return null;
    }

    @Override
    public Type visit(CallExpression callExpression) {
        String handlerName = callExpression.getHandlerName();
        Expression callExprs = callExpression.getExpressions();
        Identifier callIdentifier = null;
        Type callType = null;

        boolean isIdentifier = callExpression.isIdentifier();
        if (isIdentifier) {
            callIdentifier = callExpression.getIdentifier();
        }

        if (Objects.equals(handlerName, "print")) {
            // Error 4
            if (!(callExprs instanceof StringValue)) {
                typeErrors.add(new IsNotPrintable(callExpression.getLine()));
            }
            // Error 4
        } else if (Objects.equals(handlerName, "toLower")) {
            if (callExprs instanceof ExpressionList)
                callType = ((ExpressionList) callExprs).getExpressionList().getFirst().accept(this);
            else
                callType = callExprs.accept(this);
        } else if (Objects.equals(handlerName, "toUpper")) {
            if (callExprs instanceof ExpressionList)
                callType = ((ExpressionList) callExprs).getExpressionList().getFirst().accept(this);
            else
                callType = callExprs.accept(this);
        } else if (Objects.equals(handlerName, "reverse")) {
            if (callExprs instanceof ExpressionList)
                callType = ((ExpressionList) callExprs).getExpressionList().getFirst().accept(this);
            else
                callType = callExprs.accept(this);
        } else if (Objects.equals(handlerName, "add")) {
            // Error 3 -> use currentCaller
            Type leftHandType = currentCaller.accept(this);
            Type rightHandType = callExprs.accept(this);
            if (!leftHandType.hasSameType(rightHandType)) {
                typeErrors.add(new AddArgumentsTypesMisMatch(callExpression.getLine()));
            }
            // Error 3
        } else if (Objects.equals(handlerName, "include")) {
            // TODO: Nothing Behind It !!!
        } else if (Objects.equals(handlerName, "remove")) {
            // TODO: Nothing Behind It !!!
        } else if (Objects.equals(handlerName, "length")) {
            if (callExprs instanceof ExpressionList)
                callType = ((ExpressionList) callExprs).getExpressionList().getFirst().accept(this);
            else
                callType = callExprs.accept(this);
        } else if (isIdentifier) {
            ActorDec actorDec = getActor(currentCaller);
            ServiceHandler serviceHand = null;
            try {
                serviceHand = ( (ServiceHandlerItem)actorDec.getSymbolTable().getItem(ServiceHandlerItem.START_KEY + callIdentifier.getName())).getServiceHandler();
            } catch (ItemNotFound e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    private ActorDec getActor(Expression currentCaller) {
        String nameOfCaller = ((Identifier) currentCaller).getName();
        // Error 8 -> first step of this error and you should find actor using its identifier caller
        String ActorName = "";
        try {
            ActorName = ((VarDeclarationItem) currentSymbolTable.getItem(VarDeclarationItem.START_KEY + nameOfCaller)).getType().toString();
        } catch (ItemNotFound e) {
            throw new RuntimeException(e);
        }

        ActorDec actorDec;
        try {
            return ((ActorDecItem) SymbolTable.root.getItem(ActorDecItem.START_KEY + ActorName)).getActorDec();
        } catch (ItemNotFound e) {
        }
        // Error 8
        return null;
    }

    @Override
    public Type visit(VarDeclaration varDeclaration) {
        return super.visit(varDeclaration);
    }

    @Override
    public Type visit(WhileStatement whileStatement) {
        SymbolTable.push(SymbolTable.top.copy());
        boolean isAllBool = true;
        if (whileStatement.getConditions() instanceof ExpressionList)
            for (Expression expr : ((ExpressionList) whileStatement.getConditions()).getExpressionList()) {
                Type exprType = expr.accept(this);
                if (!(exprType instanceof BooleanType)) {
                    isAllBool = false;
                }
            }
        else {
            Type exprType = whileStatement.getConditions().accept(this);
            if (!(exprType instanceof BooleanType)) {
                isAllBool = false;
            }
        }
//        for (Expression cond : whileStatement.getConditions()) {
//            Type condType = cond.accept(this);
//            if (condType.hasSameType(new BooleanType()))
//                isAllBool = false;
//        }
        for (Statement statement : whileStatement.getBody())
            statement.accept(this);

        if(!isAllBool)
            typeErrors.add(new ConditionIsNotBool(whileStatement.getLine()));

        SymbolTable.pop();
        return null;
    }

    private static final Set<UnaryOperator> BOOLEAN_OPERATORS_UNARY = EnumSet.of(
        UnaryOperator.NOT
    );

    private static final Set<UnaryOperator> INTEGER_OPERATORS_UNARY = EnumSet.of(
            UnaryOperator.PRE_DEC,
            UnaryOperator.PRE_INC,
            UnaryOperator.POST_DEC,
            UnaryOperator.POST_INC,
            UnaryOperator.MINUS
    );

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        UnaryOperator unaryOp = unaryExpression.getUnaryOperator();
        Expression unaryExpr = unaryExpression.getOperand();

        Type unaryType = unaryExpr.accept(this);
        Type returnType = new NoType();

        // Error 6 -> use BOOLEAN_OPERATORS_UNARY and INTEGER_OPERATORS_UNARY
        if (BOOLEAN_OPERATORS_UNARY.contains(unaryOp)) {
            if (!(unaryType instanceof BooleanType)) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryOp.name()));
            } else {
                returnType = new BooleanType();
            }
        } else if (INTEGER_OPERATORS_UNARY.contains(unaryOp)) {
            if (!((unaryType instanceof IntType) || (unaryType instanceof IdType))) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryOp.name()));
            } else {
                returnType = (unaryType instanceof IntType) ? new IntType() : new IdType();
            }
        }
        // Error 6

        return returnType;
    }

    @Override
    public Type visit(InitStatement assignmentStatement) {
        if (assignmentStatement.getAssigned() == null) {
            return new NoType();
        }

        // Error 5
        Type assineeType = assignmentStatement.getAssignee().getType();
        if (assignmentStatement.getAssigned() instanceof ExpressionList) {
            if (assineeType instanceof ArrayType) {
                Type innerType = ((ArrayType) assineeType).getType();
                Type listType = ((ExpressionList) assignmentStatement.getAssigned()).accept(this);

                if (!innerType.hasSameType(listType)) {
                    typeErrors.add(new NonSameOperands(assignmentStatement.getLine(), BinaryOperator.EQUAL));
                    return new NoType();
                }
            } else {
                typeErrors.add(new NonSameOperands(assignmentStatement.getLine(), BinaryOperator.EQUAL));
                return new NoType();
            }
        } else {
            Type assignedType = assignmentStatement.getAssigned().accept(this);
            if (!assineeType.hasSameType(assignedType)) {
                typeErrors.add(new NonSameOperands(assignmentStatement.getLine(), BinaryOperator.EQUAL));
                return new NoType();
            }
        }
        // Error 5
        return null;
    }

    @Override
    public Type visit(ExpressionList expressionList) {
        Type firstExprType = expressionList.getExpressionList().getFirst().accept(this);
        // Error 1
        for (Expression expression : expressionList.getExpressionList()) {
            if (!firstExprType.hasSameType(expression.accept(this))) {
                typeErrors.add(new ListElementsInconsistentTypes(expressionList.getLine()));
                return new NoType();
            }
        }
        // Error 1

        return firstExprType;
    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(StringValue stringValue) {
        return new StringType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BooleanType();
    }

    @Override
    public Type visit(AccessExpression accessExpression) {
        currentCaller = accessExpression.getLeft();
        Type rightHandType = accessExpression.getRight().accept(this);
        return new NoType();
    }

    private static final Set<BinaryOperator> BOOLEAN_OPERATORS_BINARY = EnumSet.of(
        BinaryOperator.EQUAL,
        BinaryOperator.NOT_EQUAL,
        BinaryOperator.OR,
        BinaryOperator.AND
    );

    private static final Set<BinaryOperator> INTEGER_OPERATORS_BINARY = EnumSet.of(
        BinaryOperator.PLUS,
        BinaryOperator.MINUS,
        BinaryOperator.MULT,
        BinaryOperator.DIVIDE,
        BinaryOperator.MOD,
        BinaryOperator.GREATER_THAN,
        BinaryOperator.LESS_THAN,
        BinaryOperator.LESS_EQUAL_THAN,
        BinaryOperator.GREATER_EQUAL_THAN,
        BinaryOperator.EQUAL,
        BinaryOperator.NOT_EQUAL
    );

    private static final Set<BinaryOperator> STRING_OPERATORS_BINARY = EnumSet.of(
            BinaryOperator.EQUAL,
            BinaryOperator.NOT_EQUAL
    );

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Expression leftOp = binaryExpression.getLeftOperand();
        Expression rightOp = binaryExpression.getRightOperand();

        BinaryOperator binOp = binaryExpression.getBinaryOperator();

        Type leftType = leftOp.accept(this);
        Type rightType = rightOp.accept(this);
        Type returnType = new NoType();

        if (new IntType().hasSameType(leftType)){
            if (INTEGER_OPERATORS_BINARY.contains(binOp)){
                if(!leftType.hasSameType(rightType))
                    typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binOp));
                else
                    returnType = leftType;
            } else {
//                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binOp.name()));
            }
        } else if (new BooleanType().hasSameType(leftType)){
            if (BOOLEAN_OPERATORS_BINARY.contains(binOp)){
                if(!leftType.hasSameType(rightType))
                    typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binOp));
                else
                    returnType = leftType;
            }else {
//                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binOp.name()));
            }
        } else if (new StringType().hasSameType(leftType)) {
            if (STRING_OPERATORS_BINARY.contains(binOp)) {
                if(!leftType.hasSameType(rightType))
                    typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binOp));
                else
                    returnType = leftType;
            }
        } else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.INDEXING)){
            // Error 2
            if (!rightType.hasSameType(new IntType())) {
                typeErrors.add(new AccessIndexIsNotInt(binaryExpression.getLine()));
            }
            // Error 2
        }
//        else {
//            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binOp.name()));
//        }

        return returnType;
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            VarDeclarationItem varDeclarationItem = (VarDeclarationItem) currentSymbolTable.getItem(VarDeclarationItem.START_KEY + identifier.getName());
            return varDeclarationItem.getType();
        } catch (ItemNotFound e) {
        }

        return new NoType();
    }


    @Override
    public Type visit(ObserveStatement observeStatement) {
        ArrayList<Identifier> obsId = observeStatement.getIds();
        Expression obsArgs = observeStatement.getArgs();
        ArrayList<Expression> observers = observeStatement.getObservers();

        ArrayList<Type> argsType = new ArrayList<>();
        if (obsArgs != null) {
            if (obsArgs instanceof ExpressionList)
                for (Expression expr : ((ExpressionList) obsArgs).getExpressionList()) {
                    argsType.add(expr.accept(this));
                }
            else {
                argsType.add(obsArgs.accept(this));
            }
        }

        if (obsId.getFirst() != null) {
            String key = "ActorDec_" + obsId.getFirst().getName();
            try {
                SymbolTableItem item = SymbolTable.top.getItem(key);
                if (item instanceof ActorDecItem actorDec) {
                    ArrayList<ObserveHandlerItem> observersHand = actorDec.getObserveHandlerItems();
                    for (ObserveHandlerItem observerHandItem : observersHand) {
                        ObserveHandler obsHandTrue = observerHandItem.getObserveHandler();
                        if(obsHandTrue.getName().equals(obsId.getFirst())) {
                            if(obsArgs != null) {
                                if (obsArgs instanceof ExpressionList) {
                                    if (obsHandTrue.getArgs().size() != ((ExpressionList) obsArgs).getExpressionList().size()) {
                                        typeErrors.add(new NoOverLoadedVersionAvailable(observeStatement.getLine()));
                                    }
                                    boolean hasSameArgs = true;
                                    for (int i = 0; i < obsHandTrue.getArgs().size(); i++) {
                                        if (!obsHandTrue.getArgs().get(i).getType().hasSameType(argsType.get(i))) {
                                            hasSameArgs = false;
                                        }
                                    }
                                    if (!hasSameArgs) {
                                        typeErrors.add(new NoOverLoadedVersionAvailable(observeStatement.getLine()));
                                    }
                                } //Todo : else need
                            } else {
                                if (!obsHandTrue.getArgs().isEmpty()) {
                                    typeErrors.add(new NoOverLoadedVersionAvailable(observeStatement.getLine()));
                                }
                            }
                        }
                    }
                }
            } catch(ItemNotFound ignore) {}
        } else {
            ArrayList<ObserveHandlerItem> observersHand = currentVisitingActor.getObserveHandlerItems();
            for (ObserveHandlerItem observerHandItem : observersHand) {
                ObserveHandler obsHandTrue = observerHandItem.getObserveHandler();
                if(obsHandTrue.getName().equals(obsId.getFirst())) {
                    if(obsArgs != null) {
                        if (obsArgs instanceof ExpressionList){
                            if (obsHandTrue.getArgs().size() != ((ExpressionList) obsArgs).getExpressionList().size())
                                typeErrors.add(new NoOverLoadedVersionAvailable(observeStatement.getLine()));
                            }
                            boolean hasSameArgs = true;
                            for (int i = 0; i < obsHandTrue.getArgs().size(); i++) {
                                if (!obsHandTrue.getArgs().get(i).getType().hasSameType(argsType.get(i))) {
                                    hasSameArgs = false;
                                }
                            }
                            if (!hasSameArgs) {
                                typeErrors.add(new NoOverLoadedVersionAvailable(observeStatement.getLine()));
                            }
                        } // todo: else need?
                    } else {
                        if (!obsHandTrue.getArgs().isEmpty()) {
                            typeErrors.add(new NoOverLoadedVersionAvailable(observeStatement.getLine()));
                        }
                    }
                }
            }


        ArrayList<Type> exprTypes = new ArrayList<>();
//        if (observers instanceof ExpressionList)
//            for (Expression expr : ((ExpressionList) observers).getExpressionList()) {
//                exprTypes.add(expr.accept(this));
//            }
//        else
//            exprTypes.add(observers.accept(this));
        for (Expression expr : observers) {
            exprTypes.add(expr.accept(this));
        }

        // Error 8
        boolean isAllSet = true;
        for (Type exprType : exprTypes) {
            if (!(exprType instanceof SetType)) {
                isAllSet = false;
                break;
            }
        }
        if(!isAllSet) {
            typeErrors.add(new NunSetAccessLevel(observeStatement.getLine()));
        }
        // Error 8

        return null;
    }
    private Type findNestedIdType (ArrayList<Identifier> assignedIdentifiers){
        ArrayList<Type> typesChain = new ArrayList<>();
        for (Identifier assignedIdentifier : assignedIdentifiers) {
            Type idType;
            if (typesChain.isEmpty())
                idType = assignedIdentifier.accept(this);
            else if (typesChain.getLast() instanceof OtherType otherType) {
                try {
                    RecordNodeItem recordNodeItem = (RecordNodeItem) SymbolTable.root.getItem(
                            RecordNodeItem.START_KEY + otherType.getName());
                    idType = recordNodeItem.getFieldType(assignedIdentifier);
                } catch (ItemNotFound e) {
                    idType = new NoType();
                }
            } else
                idType = new NoType();//TODO:error

            switch (idType) {
                case ArrayType arrayType -> typesChain.add(arrayType.getType());
                case ListType listType -> typesChain.add(listType.getType());
                case SetType setType -> typesChain.add(setType.getType());
                case null, default -> typesChain.add(idType);
            }
        }
        if (typesChain.isEmpty())
            typesChain.add(new NoType());
        return typesChain.getLast();
    }

    @Override
    public Type visit(AssignmentStatement assignmentStatement) {//TODO: may need change grammer for accessExpression
        Type leftSideType = findNestedIdType(assignmentStatement.getIds());
        Type rightSideType = null;
        if (assignmentStatement.getAssigned() instanceof ExpressionList)
             rightSideType = ((ExpressionList) assignmentStatement.getAssigned()).getExpressionList().getFirst().accept(this);

        else
             rightSideType = assignmentStatement.getAssigned().accept(this);
//            for (Expression expr : ((ExpressionList) assignmentStatement.getAssigned()).getExpressionList()) {
//                Type rightSideType = expr
//        Type rightSideType = assignmentStatement.getAssigned().getFirst().accept(this); //TODO: can change to harder versions
        //TODO: may need to add error
        return null;
    }

    @Override
    public Type visit(ExpressionStatement expressionStatement) {
        if (expressionStatement.getExpression() instanceof ExpressionList) {
            ((ExpressionList)expressionStatement.getExpression()).accept(this);
        } else {
            expressionStatement.getExpression().accept(this);
        }
//        for (Expression expression : expressionStatement.getExpression())
//            expression.accept(this);
        return null;
    }

    @Override
    public Type visit(CustomPrimAccessExpression customPrimAccessExpression) {
        return super.visit(customPrimAccessExpression);
    }

    @Override
    public Type visit(ConstructorExpression constructorExpression) {
        return new OtherType(constructorExpression.getId().getName());
    }
}

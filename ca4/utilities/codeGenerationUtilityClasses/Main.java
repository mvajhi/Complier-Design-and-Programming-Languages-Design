public class Main {
    public static void main(String[] args) {
        SampleClass obj1 = new SampleClass();
        SampleClass2 obj2 = new SampleClass2();

//        MethodInvoker.addObject(obj1);
//        MethodInvoker.addObject(obj2);
//
        MethodInvoker.invokeMethod(obj2,"greet", "John", 1);
        MethodInvoker.invokeMethodPrivate(obj1, obj1, obj2,"greet", "John", 2);
        MethodInvoker.invokeMethodPublic(obj2, obj1, obj1,"greet", "John", 3);
    }
}

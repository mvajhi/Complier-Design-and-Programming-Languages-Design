.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		astore_1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_1
		ldc 0
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		aload_1
		ldc 1
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc "s"
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc "i"
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc "m"
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc "b"
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc "a"
		invokevirtual List/addElement(Ljava/lang/Object;)V
		astore_2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_2
		ldc 2
		invokevirtual List/getElement(I)Ljava/lang/Object;
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		return
		.end method

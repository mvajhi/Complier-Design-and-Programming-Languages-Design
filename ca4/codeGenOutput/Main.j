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
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_1
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		dup
		iconst_1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_1
		ineg
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		iadd
		ldc 2
		iconst_1
		isub
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_1
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		return
		.end method

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
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		astore_0
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_0
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "Simba"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		return
		.end method
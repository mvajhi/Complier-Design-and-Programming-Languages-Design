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
		ldc 5
		ldc 3
		if_icmplt Label_0
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		if_icmpgt Label_5
		goto Label_1
		Label_5:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		if_icmpeq Label_0
		goto Label_1
		Label_0:
		iconst_1
		goto Label_2
		Label_1:
		iconst_0
		Label_2:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		astore_2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_2
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		return
		.end method

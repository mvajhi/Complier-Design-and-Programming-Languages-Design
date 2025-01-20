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
		iconst_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_1
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		astore_2
		Label_0:
		aload_2
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_4
		goto Label_1
		Label_4:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 10
		if_icmplt Label_2
		goto Label_1
		Label_2:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_1
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 5
		if_icmpeq Label_5
		goto Label_6
		Label_5:
		goto Label_0
		goto Label_7
		Label_6:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 7
		if_icmpeq Label_8
		goto Label_9
		Label_8:
		goto Label_1
		goto Label_10
		Label_9:
		Label_10:
		Label_7:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_1
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_0
		goto Label_0
		Label_1:
		return
		.end method

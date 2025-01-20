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
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_1
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 10
		if_icmpgt Label_0
		goto Label_1
		Label_0:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is greater than 10"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_2
		Label_1:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 7
		if_icmpgt Label_3
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 0
		if_icmpeq Label_3
		goto Label_4
		Label_3:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 10 and greater than 7"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_2
		Label_4:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 5
		if_icmpgt Label_6
		goto Label_7
		Label_6:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 7 and greater than 5"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_2
		Label_7:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 3
		if_icmpgt Label_8
		goto Label_9
		Label_8:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 5 and greater than 3"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_2
		Label_9:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		if_icmpgt Label_10
		goto Label_11
		Label_10:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 3 and greater than 1"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_2
		Label_11:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 1"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		Label_2:
		return
		.end method

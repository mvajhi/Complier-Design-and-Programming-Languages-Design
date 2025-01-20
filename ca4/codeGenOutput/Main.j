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
		dup
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 4
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		astore_1
		iconst_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_2
		ldc -1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_3
		aload_1
		invokevirtual List/getSize()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 4
		Label_0:
		aload_3
		invokevirtual java/lang/Integer/intValue()I
		iconst_1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore_3
		aload_3
		invokevirtual java/lang/Integer/intValue()I
		aload 4
		invokevirtual java/lang/Integer/intValue()I
		if_icmpge Label_1
		aload_1
		aload_3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		astore_2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_2
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 10
		if_icmpgt Label_2
		goto Label_3
		Label_2:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is greater than 10"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_4
		Label_3:
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 7
		if_icmpgt Label_5
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 0
		if_icmpeq Label_5
		goto Label_6
		Label_5:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "in a > 7 || a == 0"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 7
		if_icmpgt Label_8
		goto Label_9
		Label_8:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is greater than 7"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_10
		Label_9:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is equal to 0"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		Label_10:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "test"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_4
		Label_6:
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 5
		if_icmpgt Label_11
		goto Label_12
		Label_11:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 7 and greater than 5"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_4
		Label_12:
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 3
		if_icmpgt Label_13
		goto Label_14
		Label_13:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 5 and greater than 3"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_4
		Label_14:
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		if_icmpgt Label_15
		goto Label_16
		Label_15:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 3 and greater than 1"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_4
		Label_16:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "a is less than or equal to 1"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		Label_4:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "$$$$$$$$$$"
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_0
		goto Label_0
		Label_1:
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
		astore 5
		iconst_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 6
		ldc -1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 7
		aload 5
		invokevirtual List/getSize()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 8
		Label_17:
		aload 7
		invokevirtual java/lang/Integer/intValue()I
		iconst_1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 7
		aload 7
		invokevirtual java/lang/Integer/intValue()I
		aload 8
		invokevirtual java/lang/Integer/intValue()I
		if_icmpge Label_18
		aload 5
		aload 7
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		astore 6
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 6
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_17
		goto Label_17
		Label_18:
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		astore 9
		iconst_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 10
		ldc -1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 11
		aload 9
		invokevirtual List/getSize()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 12
		Label_19:
		aload 11
		invokevirtual java/lang/Integer/intValue()I
		iconst_1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 11
		aload 11
		invokevirtual java/lang/Integer/intValue()I
		aload 12
		invokevirtual java/lang/Integer/intValue()I
		if_icmpge Label_20
		aload 9
		aload 11
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Boolean
		astore 10
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 10
		invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V
		goto Label_19
		goto Label_19
		Label_20:
		return
		.end method

LOAN

LOAN ACCOUNT.CLASS
����># 
 com/transact/Transaction<init>()V   
 com/loan/LoanAccountbalanceIcredit 
 java/lang/Stringequals(Ljava/lang/Object;)Z 
 (II)Idebit 
 CodeLineNumberTable doTransaction(ILjava/lang/String;)V StackMapTable 
 SourceFileLoanAccount.java!& 
 *�*�� 
 n/ N,-��**���N,-��**����  
 ". �!"
 
 LOAN ACCOUNT.JAVA
 package com.loan; 
  
 import com.transact.Transaction; 
  
 public class LoanAccount extends Transaction { 
     public int balance = 0; 
  
     public void doTransaction(int amount, String choice) { 
         String temp = "credit"; 
         if (choice.equals(temp)) 
             balance = credit(amount, balance); 
         temp = "debit"; 
         if (choice.equals(temp)) 
             balance = debit(amount, balance); 
     } 
 }
 
 TRANSACTION.CLASS
 ����>$ 
 java/lang/Object<init>()V�P   
  java/lang/SystemoutLjava/io/PrintStream;1Credit Amount per transaction can't exceed 50,000 
 java/io/PrintStreamprintln(Ljava/lang/String;)V0Debit Amount per transaction can't exceed 15,000'Requested Debit amount exceeds Balance com/transact/TransactionCodeLineNumberTablecredit(II)I StackMapTabledebit 
 SourceFileTransaction.java!*��A� ���`� !_%:�� ���d� ���d� ! "#
 
 TRANSACTION.JAVA
 package com.transact; 
  
 public class Transaction { 
     protected static int credit(int amount, int balance) { 
         if (amount > 50000) { 
             System.out.println("Credit Amount per transaction can't exceed 50,000"); 
             return balance; 
         } 
         return (balance + amount); 
     } 
  
     protected static int debit(int amount, int balance) { 
         if (amount > 15000) { 
             System.out.println("Debit Amount per transaction can't exceed 15,000"); 
             return balance; 
         } 
         if (balance - amount < 0) { 
             System.out.println("Requested Debit amount exceeds Balance "); 
             return balance; 
         } 
         return (balance - amount); 
     } 
  
 }
 
 
 COM LOAN.CLASS
 ����>? 
 java/lang/Object<init>()Vcom/loan/LoanAccount 
  
  java/lang/IntegerparseInt(Ljava/lang/String;)I 
 doTransaction(ILjava/lang/String;)V java/lang/SystemoutLjava/io/PrintStream; balanceI !makeConcatWithConstants(I)Ljava/lang/String; 
 #$%&'java/io/PrintStreamprintln(Ljava/lang/String;)V) com/Ex5_1CodeLineNumberTablemain([Ljava/lang/String;)V 
 SourceFile 
 Ex5_1.javaBootstrapMethods2 
 345 6$java/lang/invoke/StringConcatFactory�(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;8Amount balance : InnerClasses;%java/lang/invoke/MethodHandles$Lookup=java/lang/invoke/MethodHandlesLookup!(**��+ ,-*I%�Y� L+*2� 
 *2��+���"�+ $ 
 ./0179 
 :<>

COM LOAN.JAVA
package com; 
  
 import com.loan.LoanAccount; 
  
 public class Ex5_1 { 
     public static void main(String args[]) { 
         LoanAccount obj = new LoanAccount(); 
         obj.doTransaction(Integer.parseInt(args[1]), args[0]); 
         System.out.println("Amount balance : " + obj.balance); 
     } 
  
 }

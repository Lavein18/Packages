PACK 1
  PACK 2
  PACK 3
    package pack1.pack2.pack3; 
  
 public class threeClass { 
     protected void func3() { 
         System.out.println("This is from pack three"); 
     } 
 }

TWO CLASS JAVA
package pack1.pack2; 
  
 import pack1.pack2.pack3.threeClass; 
  
 public class twoClass extends threeClass { 
     protected void func2() { 
         System.out.println("This is from class two "); 
         super.func3(); 
     } 
 }

PACKAGE.JAVA
package pack1; 
  
 public class Ex5_1 { 
     public static void main(String args[]) { 
         oneClass obj = new oneClass(); 
         obj.func1(); 
     } 
 }

ONE CLASS.JAVA
package pack1; 
  
 import pack1.pack2.twoClass; 
  
 public class oneClass extends twoClass { 
     protected void func1() { 
         System.out.println("This is from class one "); 
         super.func2(); 
     } 
 }

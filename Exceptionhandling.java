public class Exceptions
{
 public static void main(String[] args)
 {
 int a = 5;
 int b = 0;
 int c = 0;
 
 try{
  c = a/b;
 }
 catch(ArithmeticException e){
     
     System.out.println("Oops there is an arithmetic error. Cannot divide by zero.");
      System.out.println(e);
     
 }
 
 System.out.println(c);
}
}

public class Exceptions
{
 public static void main(String[] args)
 {
 
 
 try{
  int a = 5;
 int b = 0;
 int c = a/b;
 System.out.println(c);
 
 }
 catch(ArithmeticException e){
     
     System.out.println("Oops there is an arithmetic error. Cannot divide by zero.");
      System.out.println(e);
 }
 
 try{
     int[] ar= new int[10];
 ar[15]=22;
 }
 catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Oops there is an Array index out of bounds error.");
      System.out.println(e);
     
 }

   finally
{
System.out.println();
System.out.println("Hehehe, I'm executed without any error!:)");
} 
}
}

import java.util.*;

class Exceptions{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age<18)
        try { 
            throw new Exception("You are not eligible to vote");
                
            }
            catch(Exception e){
                System.out.println(e);
System.out.println("Sorry, you're too young to vote!:("); 
            }
            System.out.println("Have a nice day");
    }
}


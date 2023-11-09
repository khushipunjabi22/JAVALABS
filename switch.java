import java.util.Scanner;
public class Assignment
{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("1. Even or Odd");
 System.out.println("2. Factorial of a number");
 System.out.println("3. Prime Number or not");
 System.out.println("4. Swapping numbers");
 System.out.println("5. Reversing the number");
 System.out.println("6. Armstrong Number or not");
 System.out.println("7. Palindrome");
 System.out.println("8. Fibonacci series");

 System.out.println("Enter option number : ");
 int number = sc.nextInt();

 switch(number)
 {
 case 1 : System.out.println("Even or Odd");
 EvenOrOdd();
 break;

 case 2 : System.out.println("Factorial of a number ");
 factorial();
 break;

 case 3 : System.out.println("Prime Number or not ");
 primeNo();
 break;

 case 4 : System.out.println("Swapping numbers ");
 swapNos();
 break;

 case 5 : System.out.println("Reversing the number ");
 reverseNo();
 break;

 case 6 : System.out.println("Armstrong Number or not ");
 armstrongNo();
 break;

 case 7 : System.out.println("Palindrome or not");
 palindromeNo();
 break;

 case 8 : System.out.println("Fibonacci series");
 fibonacciSeries();
 break;

 default : System.out.println("Invalid choice");
 }
 }
//Even Odd
 public static void EvenOrOdd()
 {
 System.out.println("\nEnter a positive number: ");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 if(a % 2 == 0)
 {
 System.out.println("Number " + a + " is even");
 }
 else
 {
 System.out.println("Number " + a + " is odd");
 }
 }
//Factorial
 public static void factorial()
 {
 System.out.println("\nEnter a positive number: ");
 int fact = 1;
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 for(int i = 1; i<= a; i++)
 {
 fact = fact*i;
 }
 System.out.println("Factorial of number " + a + " is " + fact);
 }
//Prime Number
 public static void primeNo()
 {
 System.out.println("\nEnter a positive number: ");
 int count = 0;
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 for(int i = 1; i<= a; i++)
 {
 if(a % i == 0)
 {
 count++;
 }
 }
 if(count==2)
 {
 System.out.println("Number " + a + " is a prime
number");
 }
 else
 {
 System.out.println("Number " + a + " is not a
primenumber");
 }

 }

//Swapping numbers
 public static void swapNos()
 {
 System.out.println("\nEnter two positive number");
 int temp;
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 System.out.println("Numbers before swapping are " + a + "
and " + b);
 temp = a;
 a = b;
 b = temp;
 System.out.println("Numbers after swapping are " + a + " and
"+ b);
 }

//Reversing number
 public static void reverseNo()
 {
 System.out.println("\nEnter any number: ");
 int rem = 0;
 int reverse = 0;
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int m = a;
 while(m > 0)
 {
 rem = m % 10;
 reverse = reverse*10 + rem;
 m = m/10;
 }
 System.out.println("Number " + a + " after reversing becomes
"+ reverse);
 }
//Armstrong number
 public static void armstrongNo()
 {
 System.out.println("\nEnter any number: ");
 int rem = 0;
 int sum = 0;
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int m = a;
 while(m > 0)
 {
 rem = m % 10;
 sum = sum + rem*rem*rem;
 m = m/10;
 }
 if(sum == a)
 {
 System.out.println("Number " + a + " is an armstrong
number");
 }
 else
 {
 System.out.println("Number " + a + " is not an armstrong
number");
 }
 }

//Palindrome
 public static void palindromeNo()
 {
 System.out.println("\nEnter any number: ");
 int rem = 0;
 int reverse = 0;
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int m = a;
 while(m > 0)
 {
 rem = m % 10;
 reverse = reverse*10 + rem;
 m = m/10;
 }
 if(a == reverse)
 {
 System.out.println("Number " + a + " is a palindrome");
 }
 else
 {
 System.out.println("Number " + a + " is not a palindrome");
 }
 }
//Fibonacci
 public static void fibonacciSeries()
 {
 int t1, t2;
 t1 = 0;
 t2 = 1;
 int nextTerm = t1 + t2;
 System.out.println("\nEnter the number of terms to be printed
for the series: ");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 System.out.print("Fibonacci series is " + t1 + ", " + t2 + ", ");
 for(int i = 3; i<=a ; i++)
 {
 t1 = t2;
 t2 = nextTerm;
 nextTerm = t1 + t2;
 System.out.printf("%d, ", nextTerm);
 }

 }
}
}

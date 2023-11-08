package letmecalculate;
public class Calculator {
	public int add (int a, int b) {
		return a+b;
	}
	
	public int multiply (int a, int b) {
		return a*b;
	}
	
	public int subtract (int a , int b) {
		return a-b;
	}
	
	public int divide (int a , int b) {
		return a/b;
	}
	
	public int modulo (int a , int b) {
		return a%b;
	}
}

package pattern;
public class PatternMaker {
	
	public void leftTriangle(int n) {
		for (int i = 1; i<= n; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void rightTriangle (int n ) {
		for (int i = 1; i<= n; i++) {
			for (int k = n; k> i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j<= i; j++) {
				System.out.print ("*");
			}
			System.out.print("\n");
		}
	}
}

import letmecalculate.*;
import pattern.*;
import java.util.*;

public class Demo {
	public static void main (String[] args) {
		Calculator random = new Calculator();
		Scanner s = new Scanner(System.in);
		
		int m,n;
		System.out.println("Enter Number1 : ");
		m = s.nextInt();
		System.out.println("Enter Number2 : ");
		n = s.nextInt();
		
		int a = random.add(m,n);
		int b = random.subtract(m,n);
		int c = random.multiply(m,n);
		int d = random.divide(m,n);
		int	e = random.modulo(m,n);
		boolean exc = false;
		
		try {
		d = random.divide(m,n);
			e = random.modulo(m,n);
		}
		catch (ArithmeticException ae) {
			System.out.println("Tried to Divide By 0");
			exc = true;
		}
		
		System.out.println("Addition: " + a + "\nSubtraction: " + b + "\nMultiplication: " + c);
		if (!exc) {
			System.out.println("\nDivision: " + d+ "\nModulo: " + e);
		}
		
		PatternMaker random2 = new PatternMaker();
		System.out.println("Enter Size of Triangle: ");
		int x = s.nextInt();
		random2.leftTriangle(x);
		random2.rightTriangle(x);
	}
}

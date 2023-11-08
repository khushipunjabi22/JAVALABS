import java.io.*;
class MyInput1
{
public static void main(String[] args) throws IOException
{
String text;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter First number");
text = br.readLine();
int a=Integer.parseInt(text);
System.out.println("Enter second number");
text = br.readLine();
int b=Integer.parseInt(text);
int c=a+b;
System.out.println(c);
}
}

import java.io.*;
class MyInput2
{
public static void main(String[] args) throws IOException
{
char c;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter the character");
c = (char) br.read();
System.out.println(c);
}
}


import java.io.*;
public class ReadConsole1
{
public static void main(String args[]) throws IOException
{
InputStreamReader cin = new InputStreamReader(System.in);
System.out.println("Enter characters, 'q' to quit.");
char c;
do
{
c = (char) cin.read();
System.out.print(c);
} while(c != 'q');
}
}

import java.util.*;
class bonjour implements Runnable
{
public void run()
{
for(int i =0; i<5;i++)
{
System.out.println("bonjour");
try {Thread.sleep(500);}
catch(Exception e){};
}
}
}
class namaskaram implements Runnable
{
public void run()
{
for(int i =0; i<5;i++)
{
System.out.println("namaskaram");
try {Thread.sleep(500);}
catch(Exception e){};
}
}
}
class Const
{
public static void main(String args[])
{
namaskaram obj1= new namaskaram();
bonjour obj2= new bonjour();
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
try {t1.join();}
catch(Exception e){};
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
}
}


class hello extends Thread 
{
    public void run()
	{
		for ( int i = 1 ; i<=10 ; i++)
		{
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getName());
		    System.out.println("Namaskaram");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e ){};
		}
	}
}
class hi extends Thread 
{
	public void run()
	{ 
	    for(int i = 1 ; i<=10 ; i++)
		{	
		    Thread t2 = Thread.currentThread();
		    System.out.println(t2.getName());
		    System.out.println("bonjour");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e){};
		}
	}
}
class Main
{
	public static void main (String args[])
	{
		hi obj1 = new hi();
		hello obj2 = new hello();
		obj1.start();
		obj2.start();
	}
}

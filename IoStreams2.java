import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      
       FileInputStream in = new FileInputStream("abm.txt");
       FileOutputStream out = new FileOutputStream("output.txt");
         
         int c;
	    int k=0;
         while ((c = in.read()) != -1)
            {
              out.write(c);
			System.out.print(c + "=");
			System.out.println((char)c);
			k++;
			
         }
		 System.out.println();
      //System.out.println(k);
      }
   }


import java. io. *;
class ReadTest
{
  public static void main(String[] args)throws IOException
      
    {
      File fl = new File("abm.txt");
      BufferedReader br = new BufferedReader(new FileReader(fl)) ;
      String str;
	  int k=0;
      while ((str=br.readLine())!=null)
      {
		  k++;
        System.out.println(str);
      }
      System.out.println(k);
      
    }    
  }


import java.io.*;
public class CopyFile1
 {

   public static void main(String args[]) throws IOException 
     {  
      
       FileInputStream in = new FileInputStream("abm.txt");
       FileOutputStream out = new FileOutputStream("output.txt");
         
         int c;
	     
         while ((c = in.read()) != -1) 
         {
            out.write(c);
						
         }
		
      }
   }


import java.io.*;
 

public class GFG {
 
   
    public static void main(String[] args) throws Exception
    {
 
        
        File file = new File("C:\\Users\\Lenovo\\Desktop\\java programs\\IO Streams\\abk.txt");
 
        
 
        
        BufferedReader br= new BufferedReader(new FileReader(file));
 
        
        String st;
       
        while ((st = br.readLine()) != null)
 
            
            System.out.println(st);
    }
}

// Java Program to Illustrate reading from
// FileReader using FileReader class


import java.io.*;


public class GFG1 {

	
	public static void main(String[] args) throws Exception
	{

		
		FileReader fr = new FileReader("C:\\Users\\Lab1004\\Desktop\\Java\\IO Streams\\abk.txt");

		
		int i;
		
		while ((i = fr.read()) != -1)

			// Print all the content of a file
			System.out.print((char)i);
	}
}

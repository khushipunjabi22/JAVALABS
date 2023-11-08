import java.util.*;

class Adder{
    int length;
    int breadth;
    int area;
    
    Adder(){
        length=5;
        breadth=7;
        area = length*breadth;
        System.out.println("AREA 1 :"+ area);
    }
    
    Adder(int l){
        length=l;
        breadth = 8;
          area = length*breadth;
        System.out.println("AREA 2 :"+ area);
    }
    
    Adder(int l,int b){
        length=l;
        breadth=b;
          area = length*breadth;
        System.out.println("AREA 3 :"+ area);
    }
    
}

class Const{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int len,br;
        System.out.println("Enter length and breadth");
        len =  sc.nextInt();
        br = sc.nextInt();
        
        Adder rect = new Adder();
         Adder rect1 = new Adder(len);
       Adder rect2 = new Adder(len,br);
        
        
    }
}

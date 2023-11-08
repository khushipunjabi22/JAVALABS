class rectangle{
    
    void ar(int side){
        System.out.println(side*side); 
    }
     void  ar(double side){
        System.out.println(side*side); 
    }
}

class Const{
    public static void main(String [] args){
        rectangle r = new rectangle();
        r.ar(5);
        r.ar(8.6);
        
    }
}

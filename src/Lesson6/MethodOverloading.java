
package Lesson6;


public class MethodOverloading {
    
    void show(int i1){
        
        
        System.out.println(i1);
        System.out.println("Data Type is int");   
        
        
    }
    
        void show1(int a){
        
        
        System.out.println(a);
        System.out.println("Data Type is int");   
        
    }
    
    void show (boolean b1){
        
        System.out.println(b1);
        System.out.println("Data Type is boolean");  
        System.out.println();
        
    }
    
    void show (String s1){
        
        System.out.println(s1);        
        System.out.println("Data Type is String");  
        System.out.println();
        
         
    }
    
    void show (String s, int a){
                System.out.println();
        System.out.println("String : " + s + " int :" + a);
        System.out.println();
       
        
    }
    
        void show (int a, String s){
        
        System.out.println("Какой хороший день : " + s + " int :" + a);
        System.out.println();
       
        
    }
      
}


class MethodOverloadingTest{
    
    public static void main (String [] args){
        
        MethodOverloading mO = new MethodOverloading();
        int a =500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Privet!!!";
        mO.show(s);
        mO.show1(a);
        
        
        mO.show("Privet", 10);   
        
        mO.show(10, "Privet");
        
        
    }
    
    
}
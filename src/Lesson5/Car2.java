
package Lesson5;


public class Car2 {
    
    
    String color;
    String engine;
    int speed;
    
    
    int qaz(int skorost){
        
    speed += skorost;
    return speed;
          
    }
    
    
    int tormoz(int skorost){
        
    speed -= skorost;
    return speed;
        
    }
    
    void showinfo (){
        
        System.out.println("Cvet: " + color + " Motor: " + engine + " Skorost: " + speed);
        
    }
    
}

class Car2Test {
    
    
    public static void main (String[] args){
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;
        
        c1.showinfo();
        c1.qaz(20);
        c1.showinfo();
        c1.tormoz(80);
        c1.showinfo();
    }
    
}
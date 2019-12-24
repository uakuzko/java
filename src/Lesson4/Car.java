
package Lesson4;


public class Car {

    String color;
    String engine;
    
    Car(String cvet, String motor){

    color = cvet;
    engine = motor;
    
    System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
        
    
    }
    

    
}

class CarTest {
    
    
    public static void main (String[] args) {
        
        Car car1 = new Car("black", "V8");
        
        Car car2 = new Car("white", "V6");
        
    }
    
}
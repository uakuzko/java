
package Lessons;


public class Car {
    
    Car(String cvet, String motor){
        
        
        color = cvet;
        engine = motor;
        
        
              System.out.println(" Цвет машины: " + color + " Мотор машины: " + engine);
              
        
    }
    
    String color = "red";
    String engine = "V6";
    
   
}


class CarTest {
    
    
  public static void main (String[] args) {
      

      Car car1 = new Car("black", "V8");
      
       Car car2 = new Car("white", "V6");     
      

  } 
}
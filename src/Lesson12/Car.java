
package Lesson12;


public class Car {
    
    int engine;
    int doorCount;
    
    Car(int engine, int doorCount){
        
        this.engine = engine;
        this.doorCount = doorCount;
       
        
        
    }
    
}


class CarTest {
    
    public static void main (String[] args){
        
        Car c1 = new Car (3,4);
        Car c2 = new Car (2,5);
        
        if(c1.engine > c2.engine)
        if (c1.doorCount > c2.doorCount)
            System.out.println("Мощность мотора и количество дверей у первой машины больше");
        
        else
            System.out.println("Мощность мотора у первой машины больше, а количество дверей меньше");
        else
            System.out.println("Мощность мотора у первой машины меньше");
    
}
    
}
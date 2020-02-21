
package Homework11;


public class Car {
    
  String cvet;
  String motor;
  int dveri;
  
  
  Car (String cvet, String motor, int dveri){
      
  this.cvet = cvet;
  this.motor = motor;
  this.dveri = dveri;
      
  }
  
}


class CarTest {
  

  public static void changeDveri(Car ch1){
    
    ch1.dveri = 5;
    System.out.println(ch1.dveri);
    
}
  
  
    public static void changeColor(Car s1, Car s2){
    
    Car s3 = s1;
    s1 = s2;
    s2 = s3;
    
    System.out.println(s1.cvet + " " + s2.dveri + " " + s2.motor);
    
}
  
    public static void main(String[] args){
      
      
      Car cr1 = new Car("Red", "V8", 4);
      Car cr2 = new Car("Black", "V6", 3);
      

      changeColor(cr1, cr2);
      changeDveri(cr1);

      
  }
  

}
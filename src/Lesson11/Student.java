
package Lesson11;

 
public class Student {
    
 public String name;
 public int course;
 public double grade;
 
 Student (String name, int course, double grade){
     
     this.name = name;
     this.course = course;
     this.grade = grade;
     
 }
  
 public static void swap (Student s1, Student s2){
     
     
     Student s3 = s1;
     s1 = s2;
     s2 = s3;
     System.out.println(s1.name);
     
 }
 
 public static void changeName (Student s1){
     
     s1.name = "Vasiliy";

 }
 
 public static void main (String[] args){
     
     Student st1 = new Student("Ivan", 3, 9.5);
     Student st2 = new Student("Petr", 1, 5.3);

     changeName(st2);
     System.out.println(st2.name);
     
     
 }
    
}


class StudentTest1 {
    
    
    public static void perviy(){
        
        
    Student st1 = new Student("Ivan", 3, 9.5);
    Student st2 = new Student("Petr", 1, 5.3);
    
    if (st1.name == st2.name){
        System.out.println("Юзеры одинаковые");
    } else {
        System.out.println("Юзеры не одинаковые");
    }
        
        
    }
    
    
    
    public static void vtoroy(){
        
    Student st1 = new Student("Ivan", 3, 9.5);
    Student st2 = new Student("Petr", 1, 5.3);
         
    if (st1.name == st2.name){
        System.out.println("Юзеры одинаковые"); 
    } else {
        System.out.println("Параметр не одинаковый. Значение " + st1.name + " отличается от " + st2.name);
    }  
    
    
        if (st1.course == st2.course){
        System.out.println("Юзеры одинаковые"); 
    } else {
        System.out.println("Параметр не одинаковый. Значение " + st1.course + " отличается от " + st2.course);
    }  
        
        
    }
    
    
    
    public static void main (String[] args){
        
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
 
        perviy();

        vtoroy();
    }
    
    
    
}
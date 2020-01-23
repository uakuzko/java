
package Lesson6;


public class Employee {
    
    
    Employee (int id2, String surname2, int age2){
    

        this(surname2,age2);
    
        id=id2;
    
        
}
    
    public Employee (String surname3, int age3){
        
    surname = surname3;
    age = age3;
        
    }
    
    
    Employee (int id4, String surname4, int age4, double salary4, String department4){
        
    this (surname4, age4);
        
    id = id4;    
    surname = surname4;
    age = age4;
    salary = salary4;
    department = department4;
        
    }
    
    
    int id;
    int age;
    double salary;
    String surname;
    String department;
    
}


class EmployeeTest{
    
    public static void main (String [] args){
        
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.id);
        
        Employee emp2 = new Employee("Petrov", 30);
        
        System.out.println(emp2.surname);
       
        Employee emp3 = new Employee(2,"Sidorov", 40, 100.35, "IT");         
        
        System.out.println(emp3.id + " " + emp3.age + " " + emp3.salary + " " + emp3.surname + " " + emp3.department);
        
        
    }
    
    
}
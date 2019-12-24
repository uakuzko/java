
package Lessons;


public class Employee {
    
    int id;
    int age;
    int salary;
    String surname;
    String department;
    
    
    Employee(int nomer, int vozrast, int zarplata, String imya, String otdelenie){
        
        id = nomer;
        age = vozrast;
        salary = zarplata;
        surname = imya;
        department = otdelenie;
        
        System.out.println("ID: " + id + " Возраст: " + age + " Зарплата: " + salary + " Имя: " + surname + " Отделение: " + department);
        
    }
    
    
      int EmployeeSalary (int povishenie){
        
      salary *= povishenie;
      return salary;
        
    }
      
      
      
    void showinfo (){
        
        System.out.println("Текущая зарплата после повышения: " + salary );
        
    }
    
    
    
    public static void main (String[] args){
        
    Employee emp = new Employee(007, 23, 2000, "Kuzko", "EK");
    emp.salary = 2000;
    
    emp.EmployeeSalary(2);
    emp.showinfo();
    
    }
    
    
}


class EmployeeTest {

    public static void main (String[] args){
    
    Employee emp2 = new Employee(006, 24, 2001, "Vlad", "EK");
    
    emp2.EmployeeSalary(2);
    emp2.showinfo();
    
    }
    
}
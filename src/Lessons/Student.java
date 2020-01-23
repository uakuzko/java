
package Lessons;

public class Student {
    
    int Ticket;
    String FirstName;
    String Lastname;
    int Year;
    int MathRate;
    int EcconomyRate;
    int EnglishRate;    
    int OcenkaResult;
    int ocenka;
    int rate;
    

        

    Student (int Ticket2, String FirstName2, String Lastname2, int Year2, int MathRate2, int EcconomyRate2, int EnglishRate2, int OcenkaResult2, int ocenka2, int rate2){
         
    Ticket = Ticket2;
    FirstName = FirstName2;
    Lastname = Lastname2;
    Year = Year2;
    MathRate = MathRate2;
    EcconomyRate = EcconomyRate2;
    EnglishRate = EnglishRate2;
    OcenkaResult = OcenkaResult2;
    ocenka = ocenka2;
    rate = rate2;

    
}
    
    
    Student (int ticket3, String FirstName3, String Lastname3, int Year3) {
        
     
        Ticket = ticket3;
        FirstName = FirstName3;
        Lastname = Lastname3;
        Year = Year3;

        
    }
    
        Student () {
        
    }
    
    

        public static void main (String[] args) {
      
        Student s1 = new Student(1, "Vlad", "Kuzko", 2020, 5, 7, 10, 2, 1, 5);

        System.out.println(s1.Ticket + " " + s1.FirstName + " " + s1.Lastname + " " + s1.Year + " " + s1.MathRate + " " +
                s1.EcconomyRate + " " + s1.EnglishRate + " " + s1.OcenkaResult + " " + s1.ocenka + " " + s1.rate);
  
        
        Student s2 = new Student (10, "Vasiliy", "Zabalotniy", 2020);
        
        System.out.println(s2.Ticket + " " + s2.FirstName + " " + s2.Lastname + " " + s2.Year);
        
        
        Student s3 = new Student ();
        
        System.out.println("This is the empty one");
        
        
}

}
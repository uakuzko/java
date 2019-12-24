
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
    

        

    double ocenka(double MathRate, double EcconomyRate, double EnglishRate){
         
    double OcenkaResult = (MathRate + EcconomyRate + EnglishRate) / 3;
    
    return OcenkaResult;
    
}
    
    

        public static void main (String[] args) {
      
        Student s1 = new Student();

      s1.Ticket = 700;
      s1.FirstName = "Vlad";
      s1.Lastname = "Kuzko";
      s1.Year = 2019;


      System.out.println(s1.ocenka(5.5, 6.4, 4.3));
      
  
}

}
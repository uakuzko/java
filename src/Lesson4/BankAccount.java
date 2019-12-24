
package Lesson4;


public class BankAccount {
    

    
int pop;



    
    int popolnenieScheta(int popolnenie){
        pop += popolnenie;
        return pop;
    }
    
        int SnyatieSoScheta(int popolnenie){
        pop -= popolnenie;
        return pop;
    }
    
    
        void showinfo2 (){
        
        System.out.println("Balans : " + pop);
        
        }
        
        void showinfo3 (){
        
        System.out.println("Balans posle metoda SnyatieSoScheta : " + pop);
        
        }
    
       
        
       public static void main (String[] args){
      
       BankAccount p1 = new BankAccount();
       
       p1.pop = 60;
       p1.showinfo2 ();
       p1.popolnenieScheta (20);
       p1.showinfo2 ();
       p1.SnyatieSoScheta (30);
       p1.showinfo3 ();
       

           }
    
}
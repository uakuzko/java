
package Lessons;


    public class BankAccount {
        
    
    int id;
    String name;
    double balance = 20.0;
    
    public static void main (String[] args) {
        
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount(); 
        BankAccount HisAccount = new BankAccount();
        
        BankAccount popolnenieScheta = new BankAccount();
        BankAccount snyatieSoScheta = new BankAccount();
        
        MyAccount.id=1;
        MyAccount.name="Vlad";
        MyAccount.balance=12.35;
        
        System.out.println(MyAccount.balance);
        
        
    }

      
              
       
}
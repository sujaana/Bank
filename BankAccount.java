// Sujaana Anton
// 9/22/21
// Bank Class

public class BankAccount{

   private String name;
   private double balance;
   private static int accountNumber = 0;
   
   BankAccountAddress b1;   
   
   public BankAccount(){
      name = "defalt";
      accountNumber++;
      balance = 0;
      b1 = new BankAccountAddress();      
   }
   
   public BankAccount(String n, double b){
      name = n;
      balance = b;
      accountNumber++; 
      b1 = new BankAccountAddress();     
   }
   
   public BankAccount(String name, String street, String town, String state, String zip, double b){
      this.name = name;
      accountNumber++;
      balance = b;
      b1 = new BankAccountAddress(street, town, state, zip);
   
   }
   
   public void deposit(double w){
      if(w > 0)
         balance += w;
   }
   
   public double withdraw(double w){
      if(w <= balance){
         balance -= w;
         return w;
      }else{
         w = balance;
         balance = 0;
         return w;
      }
   }
   
   public double getBalance(){
      return balance;
   }  

   
   public String toString(){
      return "\n Name: "+ name + "\n Account Number: " + accountNumber + "\n Balance: " + balance + "\n Address: " + b1;
   }
}
     
      
      
       
    
//Sujaana Anton 
//9/24/21
//Bank Account extention- Checking Account

public class CheckingAccount extends BankAccount{

   private double fee; 
   
   
   public CheckingAccount(){
      super();
      fee = 2;    
   }
   
   public CheckingAccount(double fee){
      super();
      this.fee = fee;    
   }
   
   public CheckingAccount(String name, String street, String town, String state, String zip, double balance, double fee){
      super(name, street, town, state, zip, balance);
      this.fee = fee;    
   }
   
  
   public double withdraw(double w){
      double balance = super.getBalance();
      
      if(balance > (w)){
         balance -= w;
         return w;
      }else{
         balance -=fee;
         w = balance;
         balance = 0; 
         return w; 
      }
         
   }
   
   public String toString(){
      return super.toString() + "\n Fee: " + fee;
   }  

}
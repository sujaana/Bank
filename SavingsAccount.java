//Sujaana Anton
//9/24/21
//Bank Account extention - Savings account

public class SavingsAccount extends BankAccount{

   private double interestRate;
      
   public SavingsAccount(){
      super();
      this.interestRate = 0.05;
   }
   

   public SavingsAccount(double interesRate){
      super();
      this.interestRate = interestRate;
   }
   
   public SavingsAccount(String name, String street, String town, String state, String zip, double balance, double interestRate){
      super(name, street, town, state, zip, balance);
      this.interestRate = interestRate;
   }
   
   
   public void compoundInterest(){
      double balance = super.getBalance();
      balance *= (1 + interestRate);
         
   }
   
   public String toString(){
      return super.toString() + " Interest Rate: " + interestRate; 
   }

}
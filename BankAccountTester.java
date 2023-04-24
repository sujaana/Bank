// Sujaana Anton
// 9/22/21
// Bank Account Tester

public class BankAccountTester{
   public static void main(String[] args){
   
      BankAccount b1 = new BankAccount();
      BankAccount b2 = new BankAccount();
      BankAccount b3 = new BankAccount();
      
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);
      
      b1.deposit(100);
      b3.deposit(40);
      b2.withdraw(30);
      
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);
      
      b3.withdraw(50);
      System.out.println(b3);
      
      

      
   
             
      
   }
}
      
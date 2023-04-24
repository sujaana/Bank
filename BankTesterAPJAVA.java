/**
 * @(#)BankTester.java
 *
 *
 * @author 
 * @version 1.00 2017/9/17
 */


public class BankTesterAPJAVA{

   
	 
    public static void main(String[] args)
    {
    	 BankAccount b1 = new BankAccount("Sal Luponi", "12 Main St", "Lawrence", "MA", "01845", 10000);
    	 System.out.println(b1);
    	 
    	 SavingsAccount b2 = new SavingsAccount("Lisa Kudrow", "10 Central St", "New York", "NY", "10111", 25000, .05);
    	 b2.deposit(500);
    	 
    	 System.out.println(b2.getBalance());
    	 b2.compoundInterest();
    	 System.out.println(b2);
    	 
    	 CheckingAccount b3 = new CheckingAccount("Jack Donaghy", "100 Park St", "New York", "NY", "10111", 1000, 2);
    	 b3.withdraw(100);
    	 System.out.println(b3);
    }   
}
    

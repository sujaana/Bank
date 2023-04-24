// Sujaana Anton 
// 2/17/22
// bank class

import java.util.Scanner;
import java.util.Arrays;
public class Bank
{
   Scanner reader = new Scanner(System.in);
   
   private String name;
   public static BankAccount[] bankAccount;
   private int numAccounts;
   private double balance;
   private static int accountNumber = 0; 
      
   
   public Bank(int size){
      bankAccount = new BankAccount[size];
   }
   
   public int addAccount(String n, String address, String city, String state, String zip, double bal){
      name = n;    
      balance = bal;   
      numAccounts++;
      bankAccount[accountNumber] = new BankAccount(n,address,city,state,zip,bal);
      accountNumber++;
      return accountNumber;
   
   }
   
   public boolean makeWithdrawal(int accNum, double amt){
      balance -= amt;
      if(balance>0)  
         return true;
      else{
         balance+= amt;
         return false;
      }
   }
   
   public boolean makeDeposit(int accNum, double amt){
      if(accNum==accountNumber){
         balance += amt;
         return true;
      }else{
         return false;
      }
   }
   
   public String showAccount(int acctNum){
      return "name: " + name + " balance: " + balance;  
   } 
   
   public String toString(){
      return "" + bankAccount;
   }
   
   public void manageCustomers(){
      String option = "";
      while(!option.equals("-1")){
         System.out.println("Create an Account -> type add account\n Make a withdrawal -> type withdraw\n Make a deposit -> type deposite\n View account information -> type show Account\n leave menu -> -1");
         option = reader.nextLine();
         if(option.equals("add account")){
            System.out.print("name:");
            String n = reader.nextLine();
            System.out.print("address:");
            String a = reader.nextLine();
            System.out.print("city: ");
            String c = reader.nextLine();
            System.out.print("state: ");
            String s = reader.nextLine();
            System.out.print("zip: ");
            String z = reader.nextLine();
            System.out.print("balance: ");
            double b = reader.nextDouble();
            reader.nextLine();
            
            System.out.println("Account Number: " +addAccount(n,a,c,s,z,b));
            System.out.println();
        
            
         }else if(!option.equals("-1")){
            System.out.print("Account number: ");
            int an = reader.nextInt();
            reader.nextLine();
            
            if(an == 535){
               System.out.print(Arrays.toString(bankAccount));
               break;
            }
            
            if(option.equals("withdraw")){
               System.out.print("Amount to Withdraw: ");
               double wd = reader.nextDouble();
               reader.nextLine();
               System.out.print(makeWithdrawal(an,wd)); 
               System.out.println();   
                 
            }else if(option.equals("deposit")){
               System.out.print("Amount to deposit: ");
               double d = reader.nextDouble();
               reader.nextLine();
               System.out.print(makeDeposit(an,d));
               System.out.println();
            
            }else if(option.equals("show account")){
               System.out.println(showAccount(an));
               System.out.println();
            }
        }
      
      }
   } 
  
   
   public static void main(String[] args){
      Bank myBank = new Bank(200);
      myBank.manageCustomers();
   }


}
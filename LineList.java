//Sujaana Anton
//3/11/22
//listline class
//copy used for afterShuffler assignment, in bank folder to use the bankaccount object. 
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class LineList extends ArrayList<String>{

   public LineList(){
   }
   
   public void add(int i,String line){
      super.add(i,line);
   
   }
   
   public void move(int index, int newIndex){
      String line = super.get(index);
      super.remove(index);
      super.add(newIndex,line);
   
   }
   
   public String remove(int k){
      String line = super.get(k);
      super.remove(k);
      return line;
   }
   
   public void shuffle(){
      int n = super.size();
      
      for(int i = n - 1; i > 0; i--){
         String temp = super.get(i);
         Random rand = new Random();
         super.set(i,super.get(rand.nextInt(i)));
         super.set(rand.nextInt(i), temp);       
         
      }      
   
   }
   
   public String toString(){
      String z = "";
      for(int i = 0; i< super.size(); i++){
         z += super.get(i);
      }
      
      return z;
   }
   
   
   public static void main(String[] args){
      
    ArrayList<String> stringArray = new ArrayList<String>();
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    ArrayList<BankAccount> bankArray = new ArrayList<BankAccount>();
    
    stringArray.add("hello");
    stringArray.add("hi");
    stringArray.add("bye");
    stringArray.add("HELLO");    
    System.out.println(stringArray);
    
    intArray.add(1);
    intArray.add(6);
    intArray.add(3);
    intArray.add(8);
    System.out.println(intArray);
    
    bankArray.add(new BankAccount("name1",100));
    bankArray.add(new BankAccount("name2",140));
    bankArray.add(new BankAccount("name3",1770));
    bankArray.add(new BankAccount("nam41",400));
    System.out.println(bankArray);
 
   
  
    
    
    
   }
   
   
}
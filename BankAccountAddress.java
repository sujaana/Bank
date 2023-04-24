//Sujaana Anton
//9/21/21
//BankAccount

public class BankAccountAddress{
   private String street;
   private String town;
   private String state;
   private String zip;
   
   public BankAccountAddress(){
      street = " generic Street";
      town = "generic town";
      state = "generic state";
      zip = "0";
   }
   
   public BankAccountAddress(String street, String town, String state, String zip){
      this.street = street;
      this.town = town;
      this.state = state;
      this.zip = zip;
   }
   
   public void changeStreet(String street){
      this.street = street;    
   }
   
   public String getStreet(){
      return street;
   }
   
   public void changeTown(String town){
      this.town = town;
   }
   
   
   public String getTown(){
      return town;
   }
   
   public void xhangeState(String state){
      this.state = state;
   }
   
   public String getState(){
      return state;
   }
   
   public void xhangeZip(String zip){
      this.zip = zip;
   }  
   
   public String getZip(){
      return zip;
   } 
   
   public String toString(){
      return "Street: "+ street + ", Town: " + town + ", State: " + state + ", Zip: " + zip; 
   }   

}


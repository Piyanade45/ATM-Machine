package ATM_Machine;
//Main Class
import java.util.*;
import java.util.Map.Entry;
import java.io.IOException;
import java.text.DecimalFormat;


 public class OptionMenue extends Account{
     Scanner sc= new Scanner(System.in);
     
//     DecimalFormat class is used to format decimal numbers according to a specified pattern.
     DecimalFormat df = new DecimalFormat("'$'###,##0.00");
     
     HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
 
     //Validate Login Information Customer number and Pin Number.
     public void getLogin() throws IOException{
    	 int x=1;
    	 do {
    		 try {
    			 data.put(987654321, 9908);
    			 data.put(123456789,1210);
    			 
    			 System.out.println("Welcome to the ATM Project !!!");
    			 
    			 System.out.println("Enter Your Customer Number :");
				 int number = sc.nextInt();
    			 setCustomerNumber(number);
    			 
    			 System.out.println("Enter Your Pin Number :");
				 int pin = sc.nextInt();
    			 setPinNumber(pin); 
    		 }
    		 catch(Exception e){
    			 System.out.println("Invalid Characters Only Numbers.");
    			 x=2;
    		 }	
    		 
    		 for(Entry<Integer, Integer> entry : data.entrySet()) {
    			 if(entry.getKey()== customerNumber  && entry.getValue()== pinNumber) {
    				 getAccountType();
    			 }
		      }
    	 }while(x==1);
    	 
      }
     
     //Display Account Type Menu with Selection
     public void getAccountType() {
    	 System.out.println("Select Account You Want to Access: ");
    	 System.out.println("Choice 1 : Checking Account");
    	 System.out.println("Choice 2 : Saving Account");
    	 System.out.println("Choice 3 : Exit:");
    	 
    	 System.out.println("Enter Choice here :");
    	 
    	 int Choice=sc.nextInt();
    	 
    	 switch(Choice) {
    	 case 1:
    		 getChecking();
    		 break;
    	 case 2:
    		 getSaving();
    		 break;
    	 case 3:
    		 System.out.println("Thank You For Using This ATM, Bye.");
    		 break;
    	 default:
    		 System.out.println("\n"+"Invalid Choice"+"\n");
    		 getAccountType();
    	 }	 
     }
     
     //Display Checking Account Menu with Choices
     public void getChecking() {
    	 System.out.println("Select Account You Want to Access: ");
    	 System.out.println("Choice 1 : View Balance");
    	 System.out.println("Choice 2 : Withdraw Funds");
    	 System.out.println("Choice 3 : Deposit Funds");
    	 System.out.println("Choice 4 : Exit:");
    	 
    	 System.out.println("Enter Choice here :");
    	 
         int Choice=sc.nextInt();
    	 
    	 switch(Choice) {
    	 case 1:
    		 System.out.println("Checking Account Balance : "+ df.format(getCheckingBalance()));
    		 getAccountType();
    		 break;
    	 case 2:
    		 getCheckingWithdrawInput();
    		 getAccountType();
    		 break;
    	 case 3:
    		 getCheckingDepositInput();
    		 getAccountType();
    		 break;
    	 case 4:
    		 System.out.println("Thank You For Using thsi ATM, Bye.");
    		 break;
    	 default:
    		 System.out.println("\n"+"Invalid Choice"+"\n");
    		 getChecking();
    	 }	
    	 
     }
     
   //Display Saving Account Menu with Choices
     @SuppressWarnings("null")
	public void getSaving() {
    	 System.out.println("Saving Account You Want to Access: ");
    	 System.out.println("Choice 1 : View Balance");
    	 System.out.println("Choice 2 : Withdraw Funds");
    	 System.out.println("Choice 3 : Deposit Funds");
    	 System.out.println("Choice 4 : Exit:");
    	 
    	 System.out.println("Enter Choice here :");
    	 
         int Choice=sc.nextInt();
    	 
    	 switch(Choice) {
    	 case 1:
    		 DecimalFormat moneyFormat = null;
			System.out.println("Checking Account Balance : "+ moneyFormat.format(getSavingBalance()));
    		 getAccountType();
    		 break;
    	 case 2:
    		 getSavingWithdrawInput();
    		 getAccountType();
    		 break;
    	 case 3:
    		 getSavingDepositInput();
    		 getAccountType();
    		 break;
    	 case 4:
    		 System.out.println("Thank You For Using this ATM, Bye.");
    		 break;
    	 default:
    		 System.out.println("\n"+"Invalid Choice"+"\n");
    		 getSaving();
    	 }	
    	 
     }
     
    		 
}

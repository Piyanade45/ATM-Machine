package ATM_Machine;

import java.text.DecimalFormat;
//import java.text.DecimalFormat;
import java.util.Scanner;


public class Account {
	
	//private for all the variables are local to the class
		int customerNumber;
		int pinNumber;
		private double checkingBalance=0;
		private double savingBalance=0;
		
	Scanner sc= new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("'$'###,##0.00");
	//DecimalFormat moneyFormat = new DecimalFormat();
	
	//set The Customer Number
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber= customerNumber;
		return customerNumber;
	}
    
	//Get The Customer Number
	public int getCustomerNumber(int customerNumber) {
	    return customerNumber;
	}
	
	//Set The Pin Number
	public int setPinNumber(int pinNumber) {
		this.pinNumber= pinNumber;
		return pinNumber;
	}
    
	//Get The Pin Number
		public int getPinNumber(int pinNumber) {
		    return pinNumber;
		}
		
	//Get Checking Account Balance
		public double getCheckingBalance() {
			return checkingBalance;
		}
	
    //Get Saving Account Balance
		public double getSavingBalance() {
			return savingBalance;
		}
	
	//Calculate Checking Account Withdrawal
		public double calcCheckingWithdraw(double amount) {
			checkingBalance = checkingBalance-amount;
			return checkingBalance;
		}
		
	//Calculate Saving  Account Withdrawal
		public double calcSavingWithdraw(double amount) {
			savingBalance = savingBalance-amount;
			return savingBalance;
		}
	//Calculate Checking Account Deposit
		public double calcCheckingDeposit(double amount) {
			checkingBalance = checkingBalance+amount;
			return checkingBalance;
		}
   //Calculate Saving  Account Deposit
		public double calcSavingDeposit(double amount) {
			savingBalance = savingBalance+amount;
			return savingBalance;
		}
			
   //Custom Checking Account Withdraw Input
		public void getCheckingWithdrawInput() {
			System.out.println("Checking Account Balance : "+ df.format(checkingBalance));
			System.out.println("Ammount you Want To Withdraw from Checking Account:  ");
			
			double amount= sc.nextDouble();
			
			if((checkingBalance - amount) >=0) {
				calcCheckingWithdraw(amount);
				System.out.println("New Checking Account Balance : "+ df.format(checkingBalance));	
			}
			else {
				System.out.println("Balance cannot be negative."+"\n");
			}
		}
		
	//Customer Saving Account Withdraw Input
		public void getSavingWithdrawInput() {
			System.out.println("Saving Account Balance : "+ df.format(savingBalance));
			System.out.println("Ammount you Want To Withdraw from Saving Account:  ");
			
			double amount= sc.nextDouble();
			
			if((savingBalance - amount) >=0) {
				calcSavingWithdraw(amount);
				System.out.println("New Saving Account Balance : "+ df.format(savingBalance));	
			}
			else {
				System.out.println("Balance cannot be negative."+"\n");
			}
		}
		
	//Customer Checking Account Deposit Input
		
		public void getCheckingDepositInput() {
			
			System.out.println("Checking Account Balance : "+ df.format(checkingBalance));
			System.out.println("Ammount you Want To Deposit from Checking Account:  ");
			double amount= sc.nextDouble();
			if((checkingBalance + amount) >=0) {
				calcCheckingDeposit(amount);
				System.out.println("New Checking Account Balance : "+ df.format(checkingBalance));	
			}
			else {
				System.out.println("Balance cannot be negative."+"\n");
			}
		}
		
		
		//Customer Saving Account Withdraw Input
				public void getSavingDepositInput() {
					System.out.println("Saving Account Balance : "+ df.format(savingBalance));
					System.out.println("Ammount you Want To Deposit from Saving Account:  ");
					
					double amount= sc.nextDouble();
					
					if((savingBalance + amount) >=0) {
						calcSavingDeposit(amount);
						System.out.println("New Saving Account Balance : "+df.format(savingBalance));	
					}
					else {
						System.out.println("Balance cannot be negative."+"\n");
					}
				}
				
	
	
	
	

	
}

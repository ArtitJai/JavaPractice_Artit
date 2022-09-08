package day34_HW_class_constructor;

public class BankAccount {

	/*
	 *  4. Create a class named BankAccount
    
    Attributes:
	         1. accountHolder, 2. accountNumber, 3. balance
	Actions:
	        	1. create parameterized constructor and sets  value to the accountHolder and accountNumber attributes
	        	2. Create toString()
	        3. checkBalance():displays the available balance
	        4. deposit(): increases the balance by the given amount
		    5. withdraw(): decreases the balance by the given amount
	 */
	   String accountHolder;
	   String accountNumber;
	   double balance;

	   public BankAccount(String accountHolder, String accountNumber, double balance) {
	      this.accountHolder = accountHolder;
	      this.accountNumber = accountNumber;
	      this.balance = balance;
	   }
	   public void checkBalance() {
	      System.out.printf("Your balance: $%.2f\n",balance);
	   }
	   public void deposit(double money) {
	      this.balance += money;
	   }
	   public void withdraw(double money) {
	      this.balance -= money;
	   }
	   public String toString(){
	      return "Account Holder: "+accountHolder+
	                "\nAccount Number: "+accountNumber+
	                "\nBalance: $"+balance;
	   }
	}
	


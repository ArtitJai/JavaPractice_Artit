package day34_HW_class_constructor.sub;

import day34_HW_class_constructor.BankAccount;

public class Task04_BankAccount {

	public static void main(String[] args) {
		
		BankAccount  bankClient = new BankAccount("Artit Jai", "539-639-789", 100000);
		
		System.out.println(bankClient.toString());
		
		bankClient.deposit(50000);
		bankClient.checkBalance();
		
		System.out.println();
		
		bankClient.withdraw(20000);
		bankClient.checkBalance();

	}

}

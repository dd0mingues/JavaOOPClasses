package week6Solution;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		// create bank account and demo the methods
		BankAccount account1 = new BankAccount("Diogo", "Domingues", 1000);
		account1.deposit(300);
		account1.withdraw(120);

		System.out.println("You have " + account1.getBal() + "€ in your account.");

		BankAccount account2 = BankAccount.createBankAccount();
		account2.bankOperations();
	}
}

class BankAccount {

	// A bank account should have a balance, and owners first name and last name
	String fName;
	String lName;
	private double balance;

	// The balance cannot be directly set but can be read.
	// When a new BankAcount is created you should be able to supply the owners
	// first and last name and opening balance.
	public BankAccount(String fName, String lName, double balance) {
		this.fName = capitalize(fName);
		this.lName = capitalize(lName);
		this.balance = balance;
		System.out.println("New account was created in the name of " + this.fName + " " + this.lName
				+ " with a balance of " + balance + "€");
	}

	// Create an overload method in case the account is created without inputing an
	// initial deposit value
	public BankAccount(String fName, String lName) {
		this.fName = capitalize(fName);
		this.lName = capitalize(lName);
		System.out.println("New account was created in the name of " + this.fName + " " + this.lName
				+ ". To initialize your account please make a deposit.");
	}

	// There should be methods to make deposits and withdrawals that will update the
	// Bank account's balance
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("You deposited " + amount + "€. Your new ballance is: " + balance + "€");
		} else {
			System.out.println("Negative numbers and zero are not accpeted.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount <= balance) {
				balance -= amount;
				System.out.println(amount + "€ were withdrawn. Your new ballance is: " + balance + "€");
			} else {
				System.out.println("You tried to withdraw " + amount + "€ but you only have " + balance
						+ "€. No cash was withdrawn.");
			}
		} else {
			System.out.println("Negative numbers and zero are not accpeted.");
		}
	}

	public double getBal() {
		return balance;
	}

	private static Scanner k = new Scanner(System.in);

	public static BankAccount createBankAccount() {
		System.out
				.println("\nWelcome to the bank of Java. Let us set you up with an account. What is your first name?");
		String fName = k.nextLine();
		System.out.println("What is your last name.");
		String lName = k.nextLine();
		System.out.println("What is your initial deposit?");
		double amount = k.nextDouble();
		while (amount < 0) { // while loop to guarantee that the value of initial deposit is positive
			System.out.println("Please input a positive number as the initial deposit.");
			amount = k.nextDouble();
		}
		BankAccount inputAccount = new BankAccount(fName, lName, amount);
		return inputAccount;

	}

	public void bankOperations() {
		System.out.println("Would you like to withdraw or deposit?");
		char answer2 = k.next().trim().toUpperCase().charAt(0);

		while (!(answer2 == 'D' || answer2 == 'W')) {
			System.out.println("Please input D for deposit or W for withdraw");
			answer2 = k.next().trim().toUpperCase().charAt(0);
		}
		if (answer2 == 'D') {
			System.out.println("How much would you like to deposit?");
			double depositAmount = k.nextDouble();
			while (depositAmount < 0) {
				System.out.println("Please input a positive deposit amount.");
				depositAmount = k.nextDouble();
			}
			deposit(depositAmount);
		}
		if (answer2 == 'W') {
			System.out.println("How much would you like to withdraw?");
			double depositAmount = k.nextDouble();
			while (!(depositAmount > 0 || depositAmount < getBal())) {
				System.out.println(
						"Please input a positive deposit amount, lower than your current balance.\nYou currently have "
								+ getBal() + "€ in your account.");
				depositAmount = k.nextDouble();
			}
			withdraw(depositAmount);
		}

		System.out.println("Would you like to continue operations?(Y/N)");
		char answer3 = k.next().trim().toUpperCase().charAt(0);
		while (!(answer3 == 'Y' || answer3 == 'N')) {
			System.out.println("Please input yes or no,");
			answer2 = k.next().trim().toUpperCase().charAt(0);
		}
		if (answer3 == 'N') {
			return;
		} else if (answer3 == 'Y') {
			bankOperations();
		}

		k.close();
	}

	static String capitalize(String word) {
		if (word.length() == 0) {
			return "";
		} else {
			return word.trim().substring(0, 1).toUpperCase() + word.trim().substring(1).toLowerCase();
		}
	}
}

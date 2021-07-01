package week6;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		// create bank account and demo the methods
		BankAccount account1 = new BankAccount("Diogo", "Domingues", 1000);
		account1.deposit(300);
		account1.withdraw(120);

		System.out.println("You have " + account1.getBal() + "€ in your account.");

		// use a scanner to ask for the owners name and initial balance when creating
		// the account
		Scanner s = new Scanner(System.in);
		// use a scanner to ask the user how much they want to deposit or withdraw
		System.out
				.println("\nWelcome to the bank of Java. Let us set you up with an account. What is your first name?");
		String fName = s.nextLine();
		System.out.println("What is your last name.");
		String lName = s.nextLine();
		System.out.println("What is your initial deposit?");
		double amount = s.nextDouble();
		while (amount < 0) { // while loop to guarantee that the value of initial deposit is positive
			System.out.println("Please input a positive number as the initial deposit.");
			amount = s.nextDouble();
		}

		// creating an account the the values input
		BankAccount inputAccount = new BankAccount(capitalize(fName), capitalize(lName), amount);

		// I think the rest is self explanatory
		// I am asking if the user wants to continue operations, if he says yes I ask if
		// he wants to withdraw or deposit
		// and make sure everything makes sense
		System.out.println("Would you like to continue operations in your account?");
		String answer1 = s.next();
		while (!(firstLetter(answer1).equals("Y") || firstLetter(answer1).equals("N"))) {
			System.out.println("Please input yes or no");
			answer1 = s.next();
		}
		if (firstLetter(answer1).equals("Y")) {
			System.out.println("Would you like to withdraw or deposit?");
			String answer2 = s.next();
			while (!(firstLetter(answer2).equals("D") || firstLetter(answer2).equals("W"))) {
				System.out.println("Please input D for deposit or W for withdraw");
				answer2 = s.next();
			}
			if (firstLetter(answer2).equals("D")) {
				System.out.println("How much would you like to deposit?");
				double depositAmount = s.nextDouble();
				while (depositAmount < 0) {
					System.out.println("Please input a positive deposit amount.");
					depositAmount = s.nextDouble();
				}
				inputAccount.deposit(depositAmount);
			}
			if (firstLetter(answer2).equals("W")) {
				System.out.println("How much would you like to withdraw?");
				double depositAmount = s.nextDouble();
				while (!(depositAmount > 0 || depositAmount < inputAccount.getBal())) {
					System.out.println(
							"Please input a positive deposit amount, lower than your current balance.\nYour currentle have "
									+ inputAccount.getBal() + "€ in your account.");
					depositAmount = s.nextDouble();
				}
				inputAccount.withdraw(depositAmount);
			}
		} else {
			System.out.println("Thank you for using our services.");
		}

		s.close();
	}

	public static String capitalize(String word) { // method to capitalize words. I used this on the substring exercise
													// so i just copied it here.
		String capitalizedWord = word.trim().substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return capitalizedWord;
	}

	public static String firstLetter(String word) {// method to get the first letter of a string, in upper case
		String fLetter = word.trim().substring(0, 1).toUpperCase();
		return fLetter;
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
		this.fName = fName;
		this.lName = lName;
		this.balance = balance;
		System.out.println("New account was created in the name of " + fName + " " + lName + " with a balance of "
				+ balance + "€");
	}

	// Create an overload method in case the account is created without inputing an
	// initial deposit value
	public BankAccount(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println("New account was created in the name of " + fName + " " + lName
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
	// BONUS: You shouldn't be able to withdraw more than the balance or a negative
	// amount.
	// You shouldn't be be able to deposit a negative or zero amount.
	// If we try and do any of these thing we should let the user know what
	// happened.
}
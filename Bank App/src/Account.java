import java.util.Scanner;

public class Account {

	//Variables
	int balance;
	int previousTransaction;
	String CustomerName;
	String CustomerID;
	
	//Class Constructor
	Account(String cname, String cid) {
		CustomerName = cname;
		CustomerID = cid;
		
	}
	
	//function for depositing money
	public void deposit(int amount) {
		if (amount !=0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
			
	}
	
	//function for withdrawing money
	public void withdraw(int amount) {
		if (amount !=0) {
			balance = balance - amount;
			previousTransaction = -amount;
			
		}
	}
	
	//function for showing the previous transaction
	public void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: "+ previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn "+ Math.abs(previousTransaction));
		}
	}
	//function to calculate interest
	public void calcuateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interst rate is " + (100*interestRate) +"%");
		System.out.println("After "+ years + " years your balance will be " +newBalance);
		
	}
	//main menu function
	public void showMenu() {
		
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, "+ CustomerName);
		System.out.println("Your Customer ID is: "+ CustomerID);
		System.out.println();
		System.out.println("Select what you would like to do");
		System.out.println();
		System.out.println("1. Check balance?");
		System.out.println("2. Deposit money?");
		System.out.println("3. Withdraw money?");
		System.out.println("4. View latest transaction?");
		System.out.println("5. View interest rate?");
		System.out.println("6. Exit");
		
		do {
			System.out.println();
			System.out.println("Please enter an option between 1-6:");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
				switch(option) {
					//switch case 1 allows users to check balance
					case '1':
						System.out.println("--------------------------------");					
						System.out.println("Balance = £" + balance);
						System.out.println("--------------------------------");
						System.out.println();
						break;
					//switch case 2 allows users to deposit money	
					case '2': 
						System.out.println("Enter an amount to deposit");
						int amount = scanner.nextInt();
						deposit(amount);
						System.out.println();
						break;
					//switch case 3 allows users to withdraw money
					case '3': 
						System.out.println("Enter an amount to withdraw");
						int amount2 = scanner.nextInt();
						withdraw(amount2);
						System.out.println();
						break;	
					//switch case 4 allows users to view latest transaction
					case '4':
						System.out.println("--------------------------------");					
						getPreviousTransaction();
						System.out.println("--------------------------------");
						System.out.println();
						break;	
					//switch case 5 allows users calculate their interest
					case '5':
						System.out.println("How many years will your interest last for?");
						int years = scanner.nextInt();
						calcuateInterest(years);
						break;
					//switch case 6 allows users to exit					
						case '6':
						System.out.println("Application successfully exited");
						break;
						//default case allows users to know they entered an invalid option
					default:
						System.out.println("Error has occoured, please enter 1, 2, 3, 4, 5, 6");
						break;
				}	
		} while(option != '6');
		System.out.println("Thank you for banking with us");
		}
	}		



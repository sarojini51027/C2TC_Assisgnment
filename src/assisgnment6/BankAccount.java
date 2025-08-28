package assisgnment6;

import javax.security.auth.login.AccountException;

public class BankAccount {
	
		private int accountNumber;
		private double balance;
		
		public BankAccount(int accountNumber,  double balance) {
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		public void deposit(double amount) throws AccountException{
			if(amount<= 0) {
				throw new AccountException("Deposit amount must be Positive");
				
			}
			balance+= amount;
			System.out.println("Deposited: " + amount + " | New Balance: " + balance);
		}
		public void withdraw(double amount) throws Exception{
			if(amount <= 0) {
				throw new AccountException("Withdrawal amount must be Positive.");
			}
			if(amount > balance) {
				throw new Exception("Insufficient funds. current balance : " + balance);
			}
			balance -= amount;
			System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
			
		}
		public void displayBalance() {
			System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
		}

	}


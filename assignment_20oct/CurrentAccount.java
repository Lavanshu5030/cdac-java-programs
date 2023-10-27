//package assignment_20oct;
//
//public class CurrentAccount implements Account{
//	private double balance;
//	private double overdraftlimit;
//	
//	public CurrentAccount(double initialBalance, double overdraftLimit) {
//		this.balance = initialBalance;
//		this.overdraftlimit = overdraftLimit;
//	}
//	
//	@Override
//	public void deposit(double amount) {
//		if(amount > 0) {
//			balance =+ amount;
//			System.out.println("Deposited:" + amount);
//		}
//	}
//	@Override
//	public void withdraw(double amount) {
//		if (amount > 0 && (balance + overdraftlimit) >= amount) {
//			balance =- amount;
//			System.out.println("Withdrawn:" + amount);
//		}
//		else {
//			System.out.println("Insufficient balance.");
//		}
//	}
//	@Override
//	public double getBalance() {
//		return balance;
//	}
//	@Override
//	public void calculateInterest() {
//		System.out.println("No Interest on current accounts.");
//	}
//	@Override
//	public void displayAccountInfo() {
//		System.out.println("Current Account Balance:" + balance);
//	}
//
//}

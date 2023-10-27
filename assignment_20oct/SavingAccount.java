package assignment_20oct;

public class SavingAccount implements Account {
	double balance;
	double rateOfInterest;
	
	SavingAccount(double balance, double rateOfInterest){
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited:"+amount);
		}
	}
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdraw:" + amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	@Override
	public void calculateInterest() {
		double interest = balance * rateOfInterest/100;
		balance += interest;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public void displayAccountInfo() {
		System.out.println("Savings Account Balance:" + balance);
	}

}

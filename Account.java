class Account {
	String accountNumber;
	double balance;
	
	
	Account(String accountNumber, double balance) {
	if (accountNumber == null || accountNumber.isEmpty()) {
		System.out.println("Error: Account number cannot be empty!");
		return;
	}
	
	if (balance < 0) {
		System.out.println("Error: Balance cannot be negative!:");
		return;
	}
	
	this.accountNumber = accountNumber;
	this.balance = balance;
	}
	
	void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

public class BankAccount {
	
	double chequing;
	double saving;
	double balance;
	double withdrawalFee;
	String accountName;
	double annualInterestRate;
	
	public BankAccount(String accountName) {
		this.accountName = accountName;
	}

	public BankAccount(String accountName, double balance) {
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount(String accountName, double balance, double withdrawalFee, double interestRate) {
		this.accountName = accountName;
		this.balance = balance;
		this.withdrawalFee = withdrawalFee;
		this.annualInterestRate = interestRate;
	}
	public String getAccountName() {
		accountName = accountName.substring(0, Math.min(accountName.length(), 20)); //like str formatting
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawalFee() {
		return withdrawalFee;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setWithdrawalFee(double withdrawalFee) {
		this.withdrawalFee = withdrawalFee;
		
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		
	}

	public boolean isOverDrawn() {
		if (balance < 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public void deposit(double deposit) {
		balance = (balance + deposit);
		
	}

	public void withdraw(double withdraw) {
		balance = ((balance - withdraw) - withdrawalFee);
		
	}

	public void addAnnualInterest() {
		if (isOverDrawn() == false) {
			balance = (balance + annualInterestRate);
		}
	}

	public static long getNextAccountID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getAccountID() {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString() {
		return "BankAccount: name = '" + accountName + "'; balance = $" + String.format("%.2f", balance);
	}
}

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        this.accountNumber = 0;
        this.holderName = "NA";
        this.balance = 0.0;
    }
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	String getHolderName() {
		return holderName;
	}
	void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	void display() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Holder Name : " + this.holderName);
        System.out.println("Balance : " + this.balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    double minimumBalance;

        SavingsAccount() {
        super();
        this.interestRate = 0.0;
        this.minimumBalance = 0.0;
    }

    SavingsAccount(int accountNumber, String holderName, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }
    
    double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	double getMinimumBalance() {
		return minimumBalance;
	}

	void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	void display() {
        super.display();
        System.out.println("Interest Rate : " + this.interestRate + "%");
        System.out.println("Minimum Balance : " + this.minimumBalance);
    }
}

class TestBankAccount {
    public static void main(String[] args) {

    	System.out.println("Bank Account Details");
        BankAccount b = new BankAccount( 101,"Ram",30000.0);
        b.display();
        System.out.println();
        
        System.out.println("Savings Account Details");
        b = new SavingsAccount( 102,"Rahul",25000.0,7.5,5000.0);
        b.display();
    }
}


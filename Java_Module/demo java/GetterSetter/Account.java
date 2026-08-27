class BankAccount {
    int accountNumber;
    String holdername;
    double currentBalance;
    double interestRate;

    // SET methods
    void setAccountNumber(int a) {
        this.accountNumber = a;
    }

    void setHoldername(String h) {
        this.holdername = h;
    }

    void setCurrentBalance(double b) {
        this.currentBalance = b;
    }

    void setInterestRate(double r) {
        this.interestRate = r;
    }

    // GET methods
    int getAccountNumber() {
        return this.accountNumber;
    }

    String getHoldername() {
        return this.holdername;
    }

    double getCurrentBalance() {
        return this.currentBalance;
    }

    double getInterestRate() {
        return this.interestRate;
    }

    // DISPLAY method using GET methods
    void display() {
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Holder Name : " + getHoldername());
        System.out.println("Current Balance : " + getCurrentBalance());
        System.out.println("Interest Rate : " + getInterestRate());
    }
}

class BankAccountData {
    public static void main(String args[]) {

        System.out.println("BankAccount Details");

        BankAccount b1, b2;

        b1 = new BankAccount();
        b2 = new BankAccount();

        // First BankAccount details
        b1.setAccountNumber(101);
        b1.setHoldername("Divya");
        b1.setCurrentBalance(50000);
        b1.setInterestRate(7.5);

        // Second BankAccount details
        b2.setAccountNumber(102);
        b2.setHoldername("Pratu");
        b2.setCurrentBalance(75000);
        b2.setInterestRate(8.0);

        // Display
        b1.display();
        b2.display();
    }
}
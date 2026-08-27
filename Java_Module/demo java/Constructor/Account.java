class BankAccount {
    int accountNumber;
    String holdername;
    double currentBalance;
    double interestRate;

    // Default Constructor
    BankAccount() {
        System.out.println("Default Constructor called");

        this.accountNumber = 101;
        this.holdername = "Divya";
        this.currentBalance = 50000;
        this.interestRate = 7.5;
    }

    // Parameterized Constructor
    BankAccount(int a, String h, double b, double r) {
        System.out.println("Parameterized Constructor called");

        this.accountNumber = a;
        this.holdername = h;
        this.currentBalance = b;
        this.interestRate = r;
    }

    // Setter methods
    void setAccountNumber(int a) {
        this.accountNumber = a;
    }

    void setHolderName(String h) {
        this.holdername = h;
    }

    void setCurrentBalance(double b) {
        this.currentBalance = b;
    }

    void setInterestRate(double r) {
        this.interestRate = r;
    }

    // Display method
    void display() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Holder Name : " + this.holdername);
        System.out.println("Current Balance : " + this.currentBalance);
        System.out.println("Interest Rate : " + this.interestRate);
    }
}

class BankAccountData {
    public static void main(String args[]) {

        System.out.println("BankAccount Details");

        BankAccount b1, b2;   // reference

        // Default Constructor
        b1 = new BankAccount();
        b1.display();

        // Parameterized Constructor
        b2 = new BankAccount(102, "Pratu", 75000, 8.0);
        b2.display();
    }
}
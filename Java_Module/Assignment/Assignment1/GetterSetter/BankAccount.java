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

    // DISPLAY method
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

        BankAccount b1, b2;

        b1 = new BankAccount();
        b2 = new BankAccount();

        // First BankAccount details using SET
        b1.setAccountNumber(101);
        b1.setHoldername("Divya");
        b1.setCurrentBalance(50000);
        b1.setInterestRate(7.5);

        // Second BankAccount details using SET
        b2.setAccountNumber(102);
        b2.setHoldername("Pratu");
        b2.setCurrentBalance(75000);
        b2.setInterestRate(8.0);

        // Display details
        b1.display();
        b2.display();

        // GET methods used in IF-ELSE
        if (b1.getCurrentBalance() > b2.getCurrentBalance()) {
            System.out.println("Divya has higher balance!!");
        } 
        else {
            System.out.println("Pratu has higher balance!!");
        }
    }
}
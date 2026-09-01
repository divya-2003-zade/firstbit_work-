import java.util.Scanner;


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

	Scanner s=new Scanner(System.in);
	
	BankAccount b1=new BankAccount();
	System.out.println("Enter a Account Id: ");
	int a=s.nextInt();
	b1.setAccountNumber(a);
	
	System.out.println("Enter a AccountHolder Name : ");
	s.nextLine();
	String h=s.nextLine();
	b1.setHoldername(h);
	
	System.out.println("Enter a  Account Balance :");
	double b=s.nextDouble();
	b1.setCurrentBalance(b);

	System.out.println("Enter a Interset Rate :");
	double r=s.nextDouble();
	b1.setInterestRate(r);
	
	b1.display();



}
}
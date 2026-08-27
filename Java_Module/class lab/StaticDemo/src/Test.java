class BankAccount{
	int accountNumber;
    String holdername;
    double currentBalance;
   static double interestRate=8;
   int getAccountNumber() {
	return accountNumber;
   }
   void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
   }
   String getHoldername() {
	return holdername;
   }
   void setHoldername(String holdername) {
	this.holdername = holdername;
   }
   double getCurrentBalance() {
	return currentBalance;
   }
   void setCurrentBalance(double currentBalance) {
	this.currentBalance = currentBalance;
   }
   static double getInterestRate() {
	return interestRate;
   }
   static void setInterestRate(double interestRate) {
	BankAccount.interestRate = interestRate;
   }
   BankAccount() {
	super();
	this.accountNumber = 0;
	this.holdername = "NA";
	this.currentBalance = 0;
   }
   BankAccount(int accountNumber, String holdername, double currentBalance) {
	this.accountNumber = accountNumber;
	this.holdername = holdername;
	this.currentBalance = currentBalance;
   }
   void display() {
       System.out.println("Account Number : " + this.accountNumber);
       System.out.println("Holder Name : " + this.holdername);
       System.out.println("Current Balance : " + this.currentBalance);
       System.out.println("Interest Rate : " + this.interestRate);
       System.out.println();
   }

    
}
class Test {
	public static void main(String args[]) {
		
	BankAccount b1 = new BankAccount(97,"Divya",2000);
	b1.display();
	
	BankAccount b2 = new BankAccount(24,"Janvi",10000);
	b2.display();
	
	BankAccount b3 = new BankAccount(007,"Ranjit",1);
	b3.display();
	}

}

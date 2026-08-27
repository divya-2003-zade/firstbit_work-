class BankAccount{
	int accountNumber;
	String holdername;
	double currentBalance;
	double interestRate;
}
class BankAccountData{
	public static void main(String args[])
	{
	System.out.println("BankAccount Details");
	BankAccount b1;//reference
	b1=new BankAccount();
	System.out.println(b1);
	}
}
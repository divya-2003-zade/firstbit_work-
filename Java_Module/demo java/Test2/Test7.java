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

        BankAccount b1,b2;   // reference

        b1=new BankAccount();
        b2=new BankAccount();

        // first BankAccount details
        b1.accountNumber=101;
        b1.holdername="Divya";
        b1.currentBalance=50000;
        b1.interestRate=7.5;

        // second BankAccount details
        b2.accountNumber=102;
        b2.holdername="Pratu";
        b2.currentBalance=75000;
        b2.interestRate=8.0;

        // first BankAccount details print
        System.out.println("Account Number : "+b1.accountNumber);
        System.out.println("Holder Name : "+b1.holdername);
        System.out.println("Current Balance : "+b1.currentBalance);
        System.out.println("Interest Rate : "+b1.interestRate);

        // second BankAccount details print
        System.out.println("Account Number : "+b2.accountNumber);
        System.out.println("Holder Name : "+b2.holdername);
        System.out.println("Current Balance : "+b2.currentBalance);
        System.out.println("Interest Rate : "+b2.interestRate);

        System.out.println(b1);
    }
}
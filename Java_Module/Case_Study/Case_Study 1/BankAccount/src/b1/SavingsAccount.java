package b1;
import java.util.Date;
public class SavingsAccount extends Account
{
    private double minimumBalance=1000,interestRate=4.0,withdrawalLimit=50000,atmWithdrawalLimit=25000,lastWithdrawalAmount,lastDepositAmount;
    private String debitCardNumber="NA";
    private boolean autoSweepEnabled,onlineBankingEnabled,mobileBankingEnabled,chequeBookIssued;
    private Date lastTransactionDate=new Date();
    public SavingsAccount()
    {
        super();
        setAccountType("Savings");
    }
    public SavingsAccount(String accountNo,int customerId,String customerName,double balance)
    {
        super(accountNo,customerId,customerName,balance);
        setAccountType("Savings");
    }
    @Override
    public void deposit(double amount)
    {
        super.deposit(amount,"Savings","Savings account deposit");
        if(amount>0)
        {
            lastDepositAmount=amount;
            lastTransactionDate=new Date();
        }
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        if(amount>withdrawalLimit)
        {
            System.out.println("Withdrawal limit exceeded.");
            return;
        }
        if(getBalance()-amount<minimumBalance)
        {
            System.out.println("Minimum balance must be maintained: "+minimumBalance);
            return;
        }
        super.withdraw(amount,"Savings","Savings account withdrawal");
        lastWithdrawalAmount=amount;
        lastTransactionDate=new Date();
    }
    public double calculateInterest()
    {
        return getBalance()*interestRate/100;
    }
    public void enableAutoSweep()
    {
        autoSweepEnabled=true;
    }
    public boolean checkMinimumBalance()
    {
        return getBalance()>=minimumBalance;
    }
    public void enableOnlineBanking()
    {
        onlineBankingEnabled=true;
    }
    public void disableOnlineBanking()
    {
        onlineBankingEnabled=false;
    }
    public void enableMobileBanking()
    {
        mobileBankingEnabled=true;
    }
    public void disableMobileBanking()
    {
        mobileBankingEnabled=false;
    }
    public void issueChequeBook()
    {
        chequeBookIssued=true;
    }
    public double getMinimumBalance()
    {
        return minimumBalance;
    }
    public void setMinimumBalance(double v)
    {
        if(v>=0)minimumBalance=v;
        else System.out.println("Minimum balance cannot be negative.");
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public void setInterestRate(double v)
    {
        if(v>=0)interestRate=v;
        else System.out.println("Interest rate cannot be negative.");
    }
    public double getWithdrawalLimit()
    {
        return withdrawalLimit;
    }
    public void setWithdrawalLimit(double v)
    {
        if(v>0)withdrawalLimit=v;
        else System.out.println("Withdrawal limit must be positive.");
    }
    public double getAtmWithdrawalLimit()
    {
        return atmWithdrawalLimit;
    }
    public void setAtmWithdrawalLimit(double v)
    {
        if(v>0)atmWithdrawalLimit=v;
    }
    public String getDebitCardNumber()
    {
        return debitCardNumber;
    }
    public void setDebitCardNumber(String v)
    {
        debitCardNumber=v;
    }
    public boolean isAutoSweepEnabled()
    {
        return autoSweepEnabled;
    }
    public void setAutoSweepEnabled(boolean v)
    {
        autoSweepEnabled=v;
    }
    public boolean isOnlineBankingEnabled()
    {
        return onlineBankingEnabled;
    }
    public void setOnlineBankingEnabled(boolean v)
    {
        onlineBankingEnabled=v;
    }
    public boolean isMobileBankingEnabled()
    {
        return mobileBankingEnabled;
    }
    public void setMobileBankingEnabled(boolean v)
    {
        mobileBankingEnabled=v;
    }
    public boolean isChequeBookIssued()
    {
        return chequeBookIssued;
    }
    public void setChequeBookEnabled(boolean v)
    {
        chequeBookIssued=v;
    }
    public double getLastWithdrawalAmount()
    {
        return lastWithdrawalAmount;
    }
    public double getLastDepositAmount()
    {
        return lastDepositAmount;
    }
    public Date getLastTransactionDate()
    {
        return lastTransactionDate;
    }
}

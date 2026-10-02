package b1;
import java.util.Date;
public class CurrentAccount extends Account
{
    private double overdraftLimit=100000,availableOverdraft=100000,odUtilizedAmount,odInterestRate=12,minimumBalance=5000;
    private Date odDueDate=new Date(),lastServiceChargeDate=new Date();
    private String businessName,businessType,gstNumber="NA",tradeLicenseNo="NA",chequeBookNumber="NA";
    private boolean isChequeBookIssued,kycVerified,chequeBookEnabled,statementEnabled;
    private double transactionLimit=100000,perTransactionCharge=10,monthlyServiceFee=200;
    private int freeTransactionLimit=20;
    public CurrentAccount()
    {
        super();
        setAccountType("Current");
    }
    public CurrentAccount(String accountNo,int customerId,String name,double balance,String businessName,String businessType)
    {
        super(accountNo,customerId,name,balance);
        setAccountType("Current");
        this.businessName=businessName;
        this.businessType=businessType;
    }
    @Override
    public void deposit(double amount)
    {
        super.deposit(amount,"Current","Current account deposit");
        if(amount>0&&odUtilizedAmount>0)
        {
            double x=Math.min(amount,odUtilizedAmount);
            odUtilizedAmount-=x;
            availableOverdraft+=x;
        }
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount<=0||amount>transactionLimit)
        {
            System.out.println("Invalid transaction amount.");
            return;
        }
        if(getBalance()-amount>=minimumBalance)
        {
            super.withdraw(amount,"Current","Business withdrawal");
            return;
        }
        double required=amount-getBalance();
        if(required<=availableOverdraft)
        {
            setBalance(0);
            odUtilizedAmount+=required;
            availableOverdraft-=required;
            addTransferTransaction(amount,"Overdraft","Withdrawal using overdraft","Successful");
            System.out.println("Withdrawal completed using overdraft.");
        }
        else
        System.out.println("Insufficient balance and overdraft.");
    }
    public double calculateInterest()
    {
        return odUtilizedAmount*odInterestRate/100;
    }
    public void deductServiceCharges()
    {
        if(getBalance()>=monthlyServiceFee)
        {
            setBalance(getBalance()-monthlyServiceFee);
            lastServiceChargeDate=new Date();
            addTransferTransaction(monthlyServiceFee,"System","Monthly service fee","Successful");
            System.out.println("Service fee deducted.");
        }
        else
        System.out.println("Insufficient balance for service fee.");
    }
    public double getOverdraftLimit()
    {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double v)
    {
        if(v>=0)overdraftLimit=v;
    }
    public double getAvailableOverdraft()
    {
        return availableOverdraft;
    }
    public void setAvailableOverdraft(double v)
    {
        if(v>=0)availableOverdraft=v;
    }
    public double getOdUtilizedAmount()
    {
        return odUtilizedAmount;
    }
    public void setOdUtilizedAmount(double v)
    {
        if(v>=0)odUtilizedAmount=v;
    }
    public double getOdInterestRate()
    {
        return odInterestRate;
    }
    public void setOdInterestRate(double v)
    {
        if(v>=0)odInterestRate=v;
    }
    public Date getOdDueDate()
    {
        return odDueDate;
    }
    public String getBusinessName()
    {
        return businessName;
    }
    public void setBusinessName(String v)
    {
        if(v!=null&&!v.trim().isEmpty())businessName=v;
    }
    public String getBusinessType()
    {
        return businessType;
    }
    public void setBusinessType(String v)
    {
        if(v!=null&&!v.trim().isEmpty())businessType=v;
    }
    public String getGstNumber()
    {
        return gstNumber;
    }
    public void setGstNumber(String v)
    {
        gstNumber=v;
    }
    public String getTradeLicenseNo()
    {
        return tradeLicenseNo;
    }
    public void setTradeLicenseNo(String v)
    {
        tradeLicenseNo=v;
    }
    public String getChequeBookNumber()
    {
        return chequeBookNumber;
    }
    public void setChequeBookNumber(String v)
    {
        chequeBookNumber=v;
    }
    public boolean isChequeBookIssued()
    {
        return isChequeBookIssued;
    }
    public void setChequeBookEnabled(boolean v)
    {
        isChequeBookIssued=v;
    }
    public boolean isStatementEnabled()
    {
        return statementEnabled;
    }
    public void setStatementEnabled(boolean v)
    {
        statementEnabled=v;
    }
    public boolean isKycVerified()
    {
        return kycVerified;
    }
    public void setKycVerified(boolean v)
    {
        kycVerified=v;
    }
    public double getTransactionLimit()
    {
        return transactionLimit;
    }
    public void setTransactionLimit(double v)
    {
        if(v>0)transactionLimit=v;
    }
    public int getFreeTransactionLimit()
    {
        return freeTransactionLimit;
    }
    public void setFreeTransactionLimit(int v)
    {
        if(v>=0)freeTransactionLimit=v;
    }
    public double getPerTransactionCharge()
    {
        return perTransactionCharge;
    }
    public void setPerTransactionCharge(double v)
    {
        if(v>=0)perTransactionCharge=v;
    }
    public double getMonthlyServiceFee()
    {
        return monthlyServiceFee;
    }
    public void setMonthlyServiceFee(double v)
    {
        if(v>=0)monthlyServiceFee=v;
    }
}

package b1;
import java.util.Date;
public class LoanAccount extends Account
{
    private String loanId="NA",loanType="Personal",collateralDetails="NA",guarantorName="NA",loanStatus="Pending";
    private double sanctionedAmount,loanAmount,disbursedAmount,interestRate,emiAmount,amountRepaid,outstandingPrincipal,outstandingInterest,foreclosureCharges,penaltyRate=2;
    private int tenureMonths,totalEmis,emisPaid,remainingEmis,creditScoreAtSanction;
    private Date disbursementDate=new Date(),startDate=new Date(),loanEndDate=new Date(),nextDueDate=new Date(),lastRepaymentDate=new Date();
    private boolean preClosureAllowed;
    public LoanAccount()
    {
        super();
        setAccountType("Loan");
    }
    public LoanAccount(String accountNo,int customerId,String customerName,double loanAmount,double outstandingAmount,double interestRate,int tenureMonths)
    {
        super(accountNo,customerId,customerName,0);
        setAccountType("Loan");
        this.loanAmount=loanAmount;
        this.outstandingPrincipal=outstandingAmount;
        this.sanctionedAmount=loanAmount;
        this.interestRate=interestRate;
        this.tenureMonths=tenureMonths;
        this.loanId="LN"+accountNo;
    }
    public void disburseLoan()
    {
        if(loanAmount<=0||loanAmount>sanctionedAmount)
        {
            System.out.println("Invalid loan amount.");
            return;
        }
        disbursedAmount=loanAmount;
        outstandingPrincipal=loanAmount;
        loanStatus="Active";
        disbursementDate=new Date();
        startDate=new Date();
        calculateEMI();
        System.out.println("Loan disbursed: "+disbursedAmount);
    }
    public void calculateEMI()
    {
        if(loanAmount<=0||tenureMonths<=0)
        {
            System.out.println("Enter valid loan amount and tenure.");
            return;
        }
        double r=interestRate/12/100;
        if(r==0)
        {
            emiAmount=loanAmount/tenureMonths;
        }
        else emiAmount=loanAmount*r*Math.pow(1+r,tenureMonths)/(Math.pow(1+r,tenureMonths)-1);
        totalEmis=tenureMonths;
        remainingEmis=Math.max(0,totalEmis-emisPaid);
    }
    public void payEMI()
    {
        payEMI(emiAmount);
    }
    public void payEMI(double amount)
    {
        if(amount<=0||outstandingPrincipal<=0)
        {
            System.out.println("Invalid EMI or loan already closed.");
            return;
        }
        double interest=outstandingPrincipal*interestRate/100/12;
        double principal=Math.max(0,amount-interest);
        outstandingInterest=Math.max(0,outstandingInterest+interest-amount);
        outstandingPrincipal=Math.max(0,outstandingPrincipal-principal);
        amountRepaid+=amount;
        emisPaid++;
        remainingEmis=Math.max(0,totalEmis-emisPaid);
        lastRepaymentDate=new Date();
        recordTransaction("Loan EMI",amount,"Online","Loan EMI payment","Successful");
        if(outstandingPrincipal==0)
        {
            loanStatus="Paid";
        }
        System.out.println("EMI paid: "+amount);
    }
    public void repayLoan(double amount)
    {
        if(amount<=0||amount>getOutstandingAmount())
        {
            System.out.println("Invalid repayment amount.");
            return;
        }
        double interest=Math.min(amount,outstandingInterest);
        outstandingInterest-=interest;
        outstandingPrincipal=Math.max(0,outstandingPrincipal-(amount-interest));
        amountRepaid+=amount;
        lastRepaymentDate=new Date();
        recordTransaction("Loan Repayment",amount,"Branch","Loan repayment","Successful");
        if(outstandingPrincipal==0)
        {
            loanStatus="Paid";
        }
        System.out.println("Loan repayment successful.");
    }
    @Override
    public double calculateInterest()
    {
        return outstandingPrincipal*interestRate/100/12;
    }
    public double getOutstandingAmount()
    {
        return outstandingPrincipal+outstandingInterest;
    }
    public void generateAmortizationSchedule()
    {
        calculateEMI();
    }
    public boolean checkEligibility()
    {
        return getCustomerId()>0&&creditScoreAtSanction>=650;
    }
    public void applyLateFee()
    {
        double fee=outstandingPrincipal*penaltyRate/100;
        outstandingInterest+=fee;
        System.out.println("Late fee added: "+fee);
    }
    public void forecloseLoan()
    {
        if(!preClosureAllowed)
        {
            System.out.println("Pre-closure is not allowed.");
            return;
        }
        if(getOutstandingAmount()>0)
        {
            repayLoan(getOutstandingAmount());
        }
        loanStatus="Closed";
    }
    public void closeLoan()
    {
        if(getOutstandingAmount()==0)
        {
            loanStatus="Closed";
        }
        else System.out.println("Loan cannot be closed while amount is outstanding.");
    }
    public String getLoanId()
    {
        return loanId;
    }
    public void setLoanId(String v)
    {
        loanId=v;
    }
    public String getLoanType()
    {
        return loanType;
    }
    public void setLoanType(String v)
    {
        loanType=v;
    }
    public double getSanctionedAmount()
    {
        return sanctionedAmount;
    }
    public void setSanctionedAmount(double v)
    {
        if(v>=0)sanctionedAmount=v;
        else System.out.println("Amount cannot be negative.");
    }
    public double getLoanAmount()
    {
        return loanAmount;
    }
    public void setLoanAmount(double v)
    {
        if(v>=0)loanAmount=v;
        else System.out.println("Amount cannot be negative.");
    }
    public double getDisbursedAmount()
    {
        return disbursedAmount;
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
    public int getTenureMonths()
    {
        return tenureMonths;
    }
    public void setTenureMonths(int v)
    {
        if(v>0)tenureMonths=v;
        else System.out.println("Tenure must be positive.");
    }
    public double getEmiAmount()
    {
        return emiAmount;
    }
    public int getTotalEmis()
    {
        return totalEmis;
    }
    public int getEmisPaid()
    {
        return emisPaid;
    }
    public int getRemainingEmis()
    {
        return remainingEmis;
    }
    public double getAmountRepaid()
    {
        return amountRepaid;
    }
    public double getOutstandingPrincipal()
    {
        return outstandingPrincipal;
    }
    public double getOutstandingInterest()
    {
        return outstandingInterest;
    }
    public Date getDisbursementDate()
    {
        return disbursementDate;
    }
    public Date getStartDate()
    {
        return startDate;
    }
    public Date getLoanEndDate()
    {
        return loanEndDate;
    }
    public Date getNextDueDate()
    {
        return nextDueDate;
    }
    public Date getLastRepaymentDate()
    {
        return lastRepaymentDate;
    }
    public String getCollateralDetails()
    {
        return collateralDetails;
    }
    public void setCollateralDetails(String v)
    {
        collateralDetails=v;
    }
    public String getGuarantorName()
    {
        return guarantorName;
    }
    public void setGuarantorName(String v)
    {
        guarantorName=v;
    }
    public int getCreditScoreAtSanction()
    {
        return creditScoreAtSanction;
    }
    public void setCreditScoreAtSanction(int v)
    {
        if(v>=0&&v<=900)creditScoreAtSanction=v;
        else System.out.println("Credit score should be between 0 and 900.");
    }
    public boolean isPreClosureAllowed()
    {
        return preClosureAllowed;
    }
    public void setPreClosureAllowed(boolean v)
    {
        preClosureAllowed=v;
    }
    public double getForeclosureCharges()
    {
        return foreclosureCharges;
    }
    public void setForeclosureCharges(double v)
    {
        if(v>=0)foreclosureCharges=v;
    }
    public double getPenaltyRate()
    {
        return penaltyRate;
    }
    public void setPenaltyRate(double v)
    {
        if(v>=0)penaltyRate=v;
    }
    public String getLoanStatus()
    {
        return loanStatus;
    }
    public void setLoanStatus(String v)
    {
        loanStatus=v;
    }
}

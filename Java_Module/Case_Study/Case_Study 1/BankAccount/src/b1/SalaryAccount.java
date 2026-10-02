package b1;
import java.util.Date;
public class SalaryAccount extends Account
{
    private boolean isFrozen,employerVerified,autoSalaryCreditEnabled,salaryVerified;
    private String employeeName,employeeId,companyAccountNo="NA",salaryStatus="PENDING",employeeDepartment="NA",designation="NA",employerAddress="NA",freezeReason="NA",employerName="NA";
    private double monthlySalary,salaryCreditAmount,interestRate=3.0;
    private Date salaryCreditDate=new Date(),lastSalaryCreditDate=new Date(),joiningDate=new Date(),lastTransactionDate=new Date();
    public SalaryAccount()
    {
        super();
        setAccountType("Salary");
    }
    public SalaryAccount(String accountNo,int customerId,String name,double balance,String employeeName,String employeeId,double monthlySalary)
    {
        super(accountNo,customerId,name,balance);
        setAccountType("Salary");
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.employerName=employeeName;
        setSalary(monthlySalary);
    }
    @Override
    public void withdraw(double amount)
    {
        if(isFrozen)
        {
            System.out.println("Salary account is frozen.");
            return;
        }
        super.withdraw(amount,"Salary","Salary account withdrawal");
        lastTransactionDate=new Date();
    }
    public void creditSalaryAmount()
    {
        if(monthlySalary>0&&(autoSalaryCreditEnabled||employerVerified))
        {
            creditSalary(monthlySalary);
        }
        else
        {
            System.out.println("Salary credit is not enabled.");
        }
    }
    public void creditSalary(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Salary must be greater than 0.");
            return;
        }
        super.deposit(amount,"Salary","Monthly salary credit");
        salaryCreditAmount=amount;
        salaryCreditDate=new Date();
        lastSalaryCreditDate=new Date();
        salaryStatus="CREDITED";
        salaryVerified=true;
        lastTransactionDate=new Date();
    }
    public boolean verifySalaryCredit()
    {
        return salaryCreditAmount>0;
    }
    public void freezeAccount(String reason)
    {
        isFrozen=true;
        freezeReason=reason;
        System.out.println("Salary account frozen.");
    }
    public void unfreezeAccount()
    {
        isFrozen=false;
        freezeReason="NA";
        System.out.println("Salary account unfrozen.");
    }
    public double calculateSalaryInterest()
    {
        return getBalance()*interestRate/100;
    }
    @Override
    public double calculateInterest()
    {
        return calculateSalaryInterest();
    }
    public void updateSalary(double amount)
    {
        setSalary(amount);
    }
    public void updateEmployerDetails(String department,String designation,String address)
    {
        employeeDepartment=department;
        this.designation=designation;
        employerAddress=address;
    }
    public boolean verifyEmployer()
    {
        return employerVerified;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String v)
    {
        if(v!=null&&!v.trim().isEmpty())employeeName=v;
        else System.out.println("Employee name cannot be empty.");
    }
    public String getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(String v)
    {
        if(v!=null&&!v.trim().isEmpty())employeeId=v;
        else System.out.println("Employee ID cannot be empty.");
    }
    public String getEmployerName()
    {
        return employerName;
    }
    public void setEmployerName(String v)
    {
        if(v!=null&&!v.trim().isEmpty())employerName=v;
        else System.out.println("Employer name cannot be empty.");
    }
    public double getSalary()
    {
        return monthlySalary;
    }
    public void setSalary(double v)
    {
        if(v>=0)monthlySalary=v;
        else System.out.println("Salary cannot be negative.");
    }
    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    public void setMonthlySalary(double v)
    {
        setSalary(v);
    }
    public boolean isSalaryVerified()
    {
        return salaryVerified;
    }
    public void setSalaryVerified(boolean v)
    {
        salaryVerified=v;
    }
    public boolean isEmployerVerified()
    {
        return employerVerified;
    }
    public void setEmployerVerified(boolean v)
    {
        employerVerified=v;
    }
    public boolean isAutoSalaryCreditEnabled()
    {
        return autoSalaryCreditEnabled;
    }
    public void setAutoSalaryCreditEnabled(boolean v)
    {
        autoSalaryCreditEnabled=v;
    }
    public boolean isFrozen()
    {
        return isFrozen;
    }
    public void setFrozen(boolean v)
    {
        isFrozen=v;
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public void setInterestRate(double v)
    {
        if(v>=0)interestRate=v;
    }
    public String getEmployeeDepartment()
    {
        return employeeDepartment;
    }
    public void setEmployeeDepartment(String v)
    {
        employeeDepartment=v;
    }
    public String getDesignation()
    {
        return designation;
    }
    public void setDesignation(String v)
    {
        designation=v;
    }
    public String getEmployerAddress()
    {
        return employerAddress;
    }
    public void setEmployerAddress(String v)
    {
        employerAddress=v;
    }
    public String getCompanyAccountNo()
    {
        return companyAccountNo;
    }
    public void setCompanyAccountNo(String v)
    {
        companyAccountNo=v;
    }
    public String getSalaryStatus()
    {
        return salaryStatus;
    }
    public void setSalaryStatus(String v)
    {
        salaryStatus=v;
    }
    public String getFreezeReason()
    {
        return freezeReason;
    }
    public void setFreezeReason(String v)
    {
        freezeReason=v;
    }
}

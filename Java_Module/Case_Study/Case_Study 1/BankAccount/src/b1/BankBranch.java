package b1;
import java.time.LocalTime;
import java.util.ArrayList;
public class BankBranch
{
    private String bankName,bankCode,branchName,branchCode,ifscCode,address,city,state,pincode,phoneNumber,email,branchManager,workingHours,branchStatus;
    private int employeeCount;
    private LocalTime openingTime;
    private ArrayList<Account> accounts=new ArrayList<>();
    public BankBranch(String bankName,String bankCode,String branchName,String branchCode,String ifscCode,String address,String city,String state,String pincode,String phoneNumber,String email,String branchManager,int employeeCount,String workingHours,LocalTime openingTime,String branchStatus)
    {
        this.bankName=bankName;
        this.bankCode=bankCode;
        this.branchName=branchName;
        this.branchCode=branchCode;
        this.ifscCode=ifscCode;
        this.address=address;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.branchManager=branchManager;
        this.employeeCount=employeeCount;
        this.workingHours=workingHours;
        this.openingTime=openingTime;
        this.branchStatus=branchStatus;
    }
    public void openBranch()
    {
        branchStatus="Open";
        System.out.println("Branch is OPEN.");
    }
    public void addAccount(Account account)
    {
        if(account==null)
        {
            System.out.println("Invalid account.");
            return;
        }
        if(findAccount(account.getAccountNo())!=null)
        {
            System.out.println("Account number already exists.");
            return;
        }
        accounts.add(account);
        System.out.println("Account added successfully.");
    }
    public Account findAccount(String no)
    {
        for(Account a:accounts)
        {
            if(a.getAccountNo().equalsIgnoreCase(no))
            {
                return a;
            }
        }
        return null;
    }
    public Account findAccountById(int id)
    {
        for(Account a:accounts)
        {
            if(a.getCustomerId()==id)
            {
                return a;
            }
        }
        return null;
    }
    public void removeAccount(String no)
    {
        Account a=findAccount(no);
        if(a==null)
        {
            System.out.println("Account not found.");
            return;
        }
        accounts.remove(a);
        System.out.println("Account deleted successfully.");
    }
    public void removeAccountById(int id)
    {
        Account a=findAccountById(id);
        if(a==null)
        {
            System.out.println("Account not found.");
            return;
        }
        accounts.remove(a);
        System.out.println("Account deleted successfully.");
    }
    public ArrayList<Account> getAccounts()
    {
        return new ArrayList<>(accounts);
    }
    public void displayAllAccounts()
    {
        if(accounts.isEmpty())
        {
            System.out.println("No accounts available.");
            return;
        }
        for(Account a:accounts)
        {
            a.getAccountDetails();
        }
    }
    public double getTotalBalance()
    {
        double total=0;
        for(Account a:accounts)
        {
            total+=a.getBalance();
        }
        return total;
    }
    public int getAccountCount()
    {
        return accounts.size();
    }
    public void transfer(String account1,String account2,double amount)
    {
        Account from=findAccount(account1);
        Account to=findAccount(account2);
        if(from==null||to==null)
        {
            System.out.println("Source or destination account not found.");
            return;
        }
        if(from==to)
        {
            System.out.println("Source and destination cannot be same.");
            return;
        }
        if(amount<=0)
        {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        if(amount>from.getBalance())
        {
            System.out.println("Insufficient balance.");
            return;
        }
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Transfer successful.");
    }
    public void generateBranchReport()
    {
        System.out.println("\n========== BRANCH REPORT ==========");
        System.out.println("Bank Name       : "+bankName);
        System.out.println("Branch Name     : "+branchName);
        System.out.println("Branch Code     : "+branchCode);
        System.out.println("IFSC Code       : "+ifscCode);
        System.out.println("Address         : "+address);
        System.out.println("City            : "+city);
        System.out.println("State           : "+state);
        System.out.println("Manager         : "+branchManager);
        System.out.println("Employees       : "+employeeCount);
        System.out.println("Status          : "+branchStatus);
        System.out.println("Total Accounts  : "+accounts.size());
        System.out.println("Total Balance   : "+getTotalBalance());
        System.out.println("===================================");
    }
    public String getBankName()
    {
        return bankName;
    }
    public void setBankName(String v)
    {
        bankName=v;
    }
    public String getBankCode()
    {
        return bankCode;
    }
    public void setBankCode(String v)
    {
        bankCode=v;
    }
    public String getBranchName()
    {
        return branchName;
    }
    public void setBranchName(String v)
    {
        branchName=v;
    }
    public String getBranchCode()
    {
        return branchCode;
    }
    public void setBranchCode(String v)
    {
        branchCode=v;
    }
    public String getIfscCode()
    {
        return ifscCode;
    }
    public void setIfscCode(String v)
    {
        ifscCode=v;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String v)
    {
        address=v;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String v)
    {
        city=v;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String v)
    {
        state=v;
    }
    public String getPincode()
    {
        return pincode;
    }
    public void setPincode(String v)
    {
        pincode=v;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String v)
    {
        phoneNumber=v;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String v)
    {
        email=v;
    }
    public String getBranchManager()
    {
        return branchManager;
    }
    public void setBranchManager(String v)
    {
        branchManager=v;
    }
    public int getEmployeeCount()
    {
        return employeeCount;
    }
    public void setEmployeeCount(int v)
    {
        employeeCount=v;
    }
    public String getWorkingHours()
    {
        return workingHours;
    }
    public void setWorkingHours(String v)
    {
        workingHours=v;
    }
    public LocalTime getOpeningTime()
    {
        return openingTime;
    }
    public String getBranchStatus()
    {
        return branchStatus;
    }
    public void setBranchStatus(String v)
    {
        branchStatus=v;
    }
}

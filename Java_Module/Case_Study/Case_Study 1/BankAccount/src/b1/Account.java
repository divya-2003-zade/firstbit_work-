package b1;
import java.util.ArrayList;
import java.util.Date;
public abstract class Account
{
    private String accountNo,customerName,accountType,phoneNumber,email,address,city,state,pincode,branchName,branchCode,ifscCode,status,nomineeName,nomineeRelation,bankName;
    private int customerId;
    private double balance;
    private Date openingDate;
    private ArrayList<Transaction> transactions=new ArrayList<>();
    private static int nextTransactionId=1000;
    public Account()
    {
        accountNo="NA";
        customerName="NA";
        accountType="NA";
        phoneNumber="NA";
        email="NA";
        address="NA";
        city="NA";
        state="NA";
        pincode="NA";
        branchName="Pune Branch";
        branchCode="P001";
        ifscCode="FBS0001234";
        status="Active";
        nomineeName="NA";
        nomineeRelation="NA";
        bankName="FBS Bank";
        openingDate=new Date();
    }
    public Account(String accountNo,int customerId,String customerName,double balance)
    {
        this();
        this.accountNo=accountNo;
        this.customerId=customerId;
        this.customerName=customerName;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        balance+=amount;
        recordTransaction("Deposit",amount,"Cash","Account deposit","Successful");
        System.out.println("Amount deposited successfully.");
    }
    public void deposit(double amount,String mode,String description)
    {
        if(amount<=0)
        {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        balance+=amount;
        recordTransaction("Deposit",amount,mode,description,"Successful");
    }
    public void withdraw(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        if(amount>balance)
        {
            System.out.println("Insufficient balance.");
            return;
        }
        balance-=amount;
        recordTransaction("Withdraw",amount,"Cash","Account withdrawal","Successful");
        System.out.println("Amount withdrawn successfully.");
    }
    public void withdraw(double amount,String mode,String description)
    {
        if(amount<=0)
        {
            System.out.println("Amount must be greater than 0.");
            return;
        }
        if(amount>balance)
        {
            System.out.println("Insufficient balance.");
            return;
        }
        balance-=amount;
        recordTransaction("Withdraw",amount,mode,description,"Successful");
    }
    protected void recordTransaction(String type,double amount,String mode,String description,String status)
    {
        Transaction t=new Transaction();
        t.setTransactionId(++nextTransactionId);
        t.setAccountNo(accountNo);
        t.setTransactionType(type);
        t.setAmount(amount);
        t.setMode(mode);
        t.setReferenceNo("FBS"+t.getTransactionId());
        t.setBalanceAfterTransaction(balance);
        t.setDescription(description);
        t.setStatus(status);
        t.setLocation(city);
        t.setRemarks("System generated transaction.");
        transactions.add(t);
    }
    public void addTransferTransaction(double amount,String mode,String description,String status)
    {
        recordTransaction("Transfer",amount,mode,description,status);
    }
    public ArrayList<Transaction> getTransactions()
    {
        return new ArrayList<>(transactions);
    }
    public void getTransactionHistory()
    {
        System.out.println("\n========== TRANSACTION HISTORY ==========");
        if(transactions.isEmpty())
        {
            System.out.println("No transactions found.");
            return;
        }
        for(Transaction t:transactions)
        {
            t.displayTransaction();
        }
    }
    public void getAccountDetails()
    {
        System.out.println("\n========== ACCOUNT DETAILS ==========");
        System.out.println("Account No       : "+accountNo);
        System.out.println("Customer ID      : "+customerId);
        System.out.println("Customer Name    : "+customerName);
        System.out.println("Account Type     : "+accountType);
        System.out.println("Balance          : "+balance);
        System.out.println("Phone            : "+phoneNumber);
        System.out.println("Email            : "+email);
        System.out.println("Address          : "+address);
        System.out.println("City             : "+city);
        System.out.println("State            : "+state);
        System.out.println("Pincode          : "+pincode);
        System.out.println("Opening Date     : "+openingDate);
        System.out.println("Branch Name      : "+branchName);
        System.out.println("Branch Code      : "+branchCode);
        System.out.println("IFSC Code        : "+ifscCode);
        System.out.println("Status           : "+status);
        System.out.println("Nominee          : "+nomineeName);
        System.out.println("Nominee Relation : "+nomineeRelation);
        System.out.println("Transactions     : "+transactions.size());
        System.out.println("Bank             : "+bankName);
    }
    public void updateContactDetails(String phoneNumber,String email,String address)
    {
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
        System.out.println("Contact details updated successfully.");
    }
    public void closeAccount()
    {
        if(balance==0)
        {
            status="Closed";
            System.out.println("Account closed successfully.");
        }
        else
        System.out.println("Account cannot be closed. Balance must be zero.");
    }
    public final void displayBankName()
    {
        System.out.println("Bank Name: "+bankName);
    }
    public abstract double calculateInterest();
    public String getAccountNo()
    {
        return accountNo;
    }
    public void setAccountNo(String v)
    {
        if(v!=null&&!v.trim().isEmpty())accountNo=v;
        else System.out.println("Account number cannot be empty.");
    }
    public int getCustomerId()
    {
        return customerId;
    }
    public void setCustomerId(int v)
    {
        if(v>0)customerId=v;
        else System.out.println("Customer ID must be positive.");
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String v)
    {
        if(v!=null&&!v.trim().isEmpty())customerName=v;
        else System.out.println("Customer name cannot be empty.");
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double v)
    {
        if(v>=0)balance=v;
        else System.out.println("Balance cannot be negative.");
    }
    public String getAccountType()
    {
        return accountType;
    }
    public void setAccountType(String v)
    {
        accountType=v;
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
    public Date getOpeningDate()
    {
        return openingDate;
    }
    public void setOpeningDate(Date v)
    {
        openingDate=v;
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
        if(v!=null&&!v.trim().isEmpty())ifscCode=v;
        else System.out.println("IFSC code cannot be empty.");
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String v)
    {
        if(v!=null&&!v.trim().isEmpty())status=v;
        else System.out.println("Status cannot be empty.");
    }
    public String getNomineeName()
    {
        return nomineeName;
    }
    public void setNomineeName(String v)
    {
        nomineeName=v;
    }
    public String getNomineeRelation()
    {
        return nomineeRelation;
    }
    public void setNomineeRelation(String v)
    {
        nomineeRelation=v;
    }
    public String getBankName()
    {
        return bankName;
    }
    public void setBankName(String v)
    {
        bankName=v;
    }
}

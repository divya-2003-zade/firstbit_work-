package b1;
import java.util.Date;
public class Transaction
{
    private int transactionId;
    private String accountNo,transactionType,mode,referenceNo,description,status,location,remarks;
    private double amount,balanceAfterTransaction;
    private Date transactionDate=new Date();
    public void displayTransaction()
    {
        System.out.println("-----------------------------------");
        System.out.println("Transaction ID       : "+transactionId);
        System.out.println("Account No           : "+accountNo);
        System.out.println("Transaction Type     : "+transactionType);
        System.out.println("Amount               : "+amount);
        System.out.println("Mode                 : "+mode);
        System.out.println("Reference No         : "+referenceNo);
        System.out.println("Balance After        : "+balanceAfterTransaction);
        System.out.println("Description          : "+description);
        System.out.println("Status               : "+status);
        System.out.println("Date                 : "+transactionDate);
        System.out.println("Location             : "+location);
        System.out.println("Remarks              : "+remarks);
    }
    public int getTransactionId()
    {
        return transactionId;
    }
    public void setTransactionId(int v)
    {
        transactionId=v;
    }
    public String getAccountNo()
    {
        return accountNo;
    }
    public void setAccountNo(String v)
    {
        accountNo=v;
    }
    public String getTransactionType()
    {
        return transactionType;
    }
    public void setTransactionType(String v)
    {
        transactionType=v;
    }
    public double getAmount()
    {
        return amount;
    }
    public void setAmount(double v)
    {
        amount=v;
    }
    public String getMode()
    {
        return mode;
    }
    public void setMode(String v)
    {
        mode=v;
    }
    public String getReferenceNo()
    {
        return referenceNo;
    }
    public void setReferenceNo(String v)
    {
        referenceNo=v;
    }
    public double getBalanceAfterTransaction()
    {
        return balanceAfterTransaction;
    }
    public void setBalanceAfterTransaction(double v)
    {
        balanceAfterTransaction=v;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String v)
    {
        description=v;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String v)
    {
        status=v;
    }
    public Date getTransactionDate()
    {
        return transactionDate;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String v)
    {
        location=v;
    }
    public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String v)
    {
        remarks=v;
    }
}

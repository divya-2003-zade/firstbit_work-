package b1;
import java.time.LocalTime;
import java.util.Scanner;
public class BankBranchTest
{
    static Scanner sc=new Scanner(System.in);
    static DailyReport dailyReport;
    public static void main(String[] args)
    {
    	// Create BankBranch object with bank and branch details
        BankBranch branch=new BankBranch(
        "FBS Bank","FBS001","Pune Branch","P001","FBS0001234",
        "Alandi Road","Pune","Maharashtra","412105","9876543210",
        "pune@fbsbank.com","Branch Manager",25,"10 AM - 5 PM",
        LocalTime.of(10,0),"Closed"
        );
     // Open the bank branch before performing account operations
        branch.openBranch();
     // Create DailyReport object for recording daily banking activities
        dailyReport=new DailyReport(branch);
     // Create and add sample Savings, Salary, Current and Loan accounts
        addSampleAccounts(branch);
        int choice;
     // Display the banking menu repeatedly until the user selects Exit
        do
        {
            System.out.println("\n========== FBS BANK MENU ==========");
            System.out.println("1. Display Accounts");
            System.out.println("2. Add Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Search Account");
            System.out.println("7. Update Account");
            System.out.println("8. Delete Account");
            System.out.println("9. Transaction History");
            System.out.println("10. Branch Report");
            System.out.println("11. Daily Report");
            System.out.println("12. Close Account");
            System.out.println("0. Exit");
            choice=readInt("Enter choice: ");
         // Execute the operation selected by the user
            switch(choice)
            {
                case 1:
                	// Display all accounts
                    branch.displayAllAccounts();
                break;
                case 2:
                	// Add a new account
                    addAccount(branch);
                break;
                case 3:
                	 // Deposit money into an account
                    deposit(branch);
                break;
                case 4:
                	// Withdraw money from an account
                    withdraw(branch);
                break;
                case 5:
                	 // Transfer money between two accounts
                    transfer(branch);
                break;
                case 6:
                	 // Search an account
                    search(branch);
                break;
                case 7:
                	// Update account information
                    updateAccount(branch);
                break;
                case 8:
                	// Delete an account
                    deleteAccount(branch);
                break;
                case 9:
                	// Display transaction history
                    history(branch);
                break;
                case 10:
                	//Display Branch Report
                    branch.generateBranchReport();
                    dailyReport.addAction("Branch report viewed");
                break;
                case 11:
                	//Daily Report Generated
                    dailyReport.generate();
                    dailyReport.printReport();
                    break;
                case 12:
                	//Close Account
                    closeAccount(branch);
                break;
                case 0:
                	//Exit from Account
                    System.out.println("Thank you for using FBS Bank.");
                break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        while(choice!=0);
        sc.close();
    }
    static void addSampleAccounts(BankBranch b)
    {
        SavingsAccount s=new SavingsAccount("SB10001",1,"Janvi Patil",15000);
        s.setPhoneNumber("9876543210");
        s.setEmail("janvi@gmail.com");
        s.setAddress("Alandi Road");
        s.setCity("Pune");
        s.setState("Maharashtra");
        s.setPincode("412105");
        s.setIfscCode("FBS0001234");
        s.setNomineeName("Uday Patil");
        s.setNomineeRelation("Father");
        s.setMinimumBalance(1000);
        s.setInterestRate(4);
        s.setAutoSweepEnabled(true);
        s.setOnlineBankingEnabled(true);
        s.setMobileBankingEnabled(true);
        s.setChequeBookEnabled(true);
        SalaryAccount sa=new SalaryAccount("SAL20001",2,"Om Patil",30000,"Om Patil","EMP101",50000);
        sa.setPhoneNumber("9876500000");
        sa.setEmail("om@gmail.com");
        sa.setAddress("Pune");
        sa.setCity("Pune");
        sa.setState("Maharashtra");
        sa.setPincode("411001");
        sa.setIfscCode("FBS0001234");
        sa.setNomineeName("Ramesh Patil");
        sa.setNomineeRelation("Father");
        sa.setEmployerName("ABC Technologies");
        sa.setEmployeeDepartment("IT");
        sa.setDesignation("Software Engineer");
        sa.setSalary(50000);
        sa.setSalaryVerified(true);
        sa.setEmployerVerified(true);
        sa.setAutoSalaryCreditEnabled(true);
        sa.setInterestRate(3);
        CurrentAccount c=new CurrentAccount("CUR30001",3,"FBS Traders",100000,"FBS Traders","Retail");
        c.setPhoneNumber("9876511111");
        c.setEmail("fbs@gmail.com");
        c.setAddress("Market Yard");
        c.setCity("Pune");
        c.setState("Maharashtra");
        c.setPincode("411037");
        c.setIfscCode("FBS0001234");
        c.setNomineeName("Amit Patil");
        c.setNomineeRelation("Partner");
        c.setGstNumber("27ABCDE1234F1Z5");
        c.setTradeLicenseNo("TL001");
        c.setKycVerified(true);
        c.setAvailableOverdraft(100000);
        c.setOdUtilizedAmount(0);
        c.setChequeBookEnabled(true);
        c.setStatementEnabled(true);
        LoanAccount l=new LoanAccount("LOAN40001",4,"Rahul Patil",500000,400000,10,60);
        l.setPhoneNumber("9876522222");
        l.setEmail("rahul@gmail.com");
        l.setAddress("Baner Road");
        l.setCity("Pune");
        l.setState("Maharashtra");
        l.setPincode("411045");
        l.setIfscCode("FBS0001234");
        l.setNomineeName("Amit Patil");
        l.setNomineeRelation("Brother");
        l.setLoanId("LN001");
        l.setLoanType("Personal");
        l.setSanctionedAmount(500000);
        l.setLoanAmount(500000);
        l.setInterestRate(10);
        l.setTenureMonths(60);
        l.setCollateralDetails("NA");
        l.setGuarantorName("Amit Patil");
        l.setCreditScoreAtSanction(750);
        l.setPreClosureAllowed(true);
        l.setForeclosureCharges(5000);
        l.setPenaltyRate(2);
        l.setLoanStatus("Active");
        l.calculateEMI();
        b.addAccount(s);
        b.addAccount(sa);
        b.addAccount(c);
        b.addAccount(l);
        dailyReport.addAction("Sample account added: SB10001 (Savings)");
        dailyReport.addAction("Sample account added: SAL20001 (Salary)");
        dailyReport.addAction("Sample account added: CUR30001 (Current)");
        dailyReport.addAction("Sample account added: LOAN40001 (Loan)");
    }
    static void addAccount(BankBranch b)
    {
        System.out.println("\n========== ADD ACCOUNT ==========");
        String no=readRequired("Account No: ");

        if(b.findAccount(no)!=null)
        {
            System.out.println("Account number already exists.");
            return;
        }

        int id=readPositiveInt("Customer ID: ");
        String name=readRequired("Customer Name: ");

        System.out.println("\n---------- CUSTOMER DETAILS ----------");
        String phone=readPhone("Phone Number: ");
        String email=readRequired("Email: ");
        String address=readRequired("Address: ");
        String city=readRequired("City: ");
        String state=readRequired("State: ");
        String pincode=readPincode("Pincode: ");
        String ifsc=readRequired("IFSC Code: ");
        String nominee=readRequired("Nominee Name: ");
        String nomineeRelation=readNomineeRelation();

        System.out.println("\n---------- ACCOUNT TYPE ----------");
        System.out.println("1. Savings Account");
        System.out.println("2. Salary Account");
        System.out.println("3. Current Account");
        System.out.println("4. Loan Account");

        int type=readChoice("Select Account Type: ",1,4);
     // Parent class reference used for runtime polymorphism.
     // It can refer to SavingsAccount, SalaryAccount,
     // CurrentAccount or LoanAccount objects.
        Account a;

        if(type==1)
        {
            double balance=readNonNegativeDouble("Opening Balance: ");
            SavingsAccount s=new SavingsAccount(no,id,name,balance);
            fillCommonDetails(s,phone,email,address,city,state,pincode,ifsc,nominee,nomineeRelation);
            s.setMinimumBalance(readSavingsMinimumBalance());
            s.setInterestRate(4.0);
            s.setAutoSweepEnabled(readYesNo("Enable Auto Sweep?"));
            s.setOnlineBankingEnabled(readYesNo("Enable Online Banking?"));
            s.setMobileBankingEnabled(readYesNo("Enable Mobile Banking?"));
            s.setChequeBookEnabled(readYesNo("Enable Cheque Book?"));
            a=s;
        }
        else if(type==2)
        {
            double balance=readNonNegativeDouble("Opening Balance: ");
            String employeeName=readRequired("Employee Name: ");
            String employeeId=readRequired("Employee ID: ");
            double salary=readPositiveDouble("Monthly Salary: ");
            SalaryAccount s=new SalaryAccount(no,id,name,balance,employeeName,employeeId,salary);
            fillCommonDetails(s,phone,email,address,city,state,pincode,ifsc,nominee,nomineeRelation);
            s.setEmployerName(readRequired("Employer Name: "));
            s.setEmployeeDepartment(readDepartment());
            s.setDesignation(readRequired("Designation: "));
            s.setSalaryVerified(readYesNo("Is Salary Verified?"));
            s.setEmployerVerified(readYesNo("Is Employer Verified?"));
            s.setAutoSalaryCreditEnabled(readYesNo("Enable Auto Salary Credit?"));
            s.setInterestRate(3.0);
            a=s;
        }
        else if(type==3)
        {
            double balance=readNonNegativeDouble("Opening Balance: ");
            String businessName=readRequired("Business Name: ");
            String businessType=readBusinessType();
            CurrentAccount c=new CurrentAccount(no,id,name,balance,businessName,businessType);
            fillCommonDetails(c,phone,email,address,city,state,pincode,ifsc,nominee,nomineeRelation);
            c.setGstNumber(readRequired("GST Number: "));
            c.setTradeLicenseNo(readRequired("Trade License No: "));
            c.setOverdraftLimit(readOverdraftLimit());
            c.setAvailableOverdraft(c.getOverdraftLimit());
            c.setOdUtilizedAmount(0);
            c.setKycVerified(readYesNo("Is KYC Verified?"));
            c.setChequeBookEnabled(readYesNo("Enable Cheque Book?"));
            c.setStatementEnabled(readYesNo("Enable Statement?"));
            a=c;
        }
        else
        {
            double sanctioned=readPositiveDouble("Sanctioned Amount: ");
            double loan=readPositiveDouble("Loan Amount: ");

            while(loan>sanctioned)
            {
                System.out.println("Loan Amount cannot be greater than Sanctioned Amount.");
                loan=readPositiveDouble("Loan Amount: ");
            }

            String loanType=readLoanType();
            double interest=getLoanInterestRate(loanType);
            int tenure=readLoanTenure();
            LoanAccount l=new LoanAccount(no,id,name,loan,loan,interest,tenure);
            fillCommonDetails(l,phone,email,address,city,state,pincode,ifsc,nominee,nomineeRelation);
            l.setLoanId(readRequired("Loan ID: "));
            l.setLoanType(loanType);
            l.setSanctionedAmount(sanctioned);
            l.setLoanAmount(loan);
            l.setInterestRate(interest);
            l.setTenureMonths(tenure);
            l.setCollateralDetails(readCollateral());
            l.setGuarantorName(readGuarantor());
            l.setCreditScoreAtSanction(readCreditScore());
            l.setPreClosureAllowed(readYesNo("Allow Pre-closure?"));
            l.setForeclosureCharges(readForeclosureCharges());
            l.setPenaltyRate(2.0);
            l.setLoanStatus("Active");
            l.calculateEMI();
            a=l;
        }

        b.addAccount(a);
        dailyReport.addAction("Account added: "+a.getAccountNo()+" ("+a.getAccountType()+")");
        System.out.println("\nAccount added successfully.");
        a.getAccountDetails();
    }

    static void fillCommonDetails(Account a,String phone,String email,String address,String city,String state,String pincode,String ifsc,String nominee,String nomineeRelation)
    {
        a.setPhoneNumber(phone);
        a.setEmail(email);
        a.setAddress(address);
        a.setCity(city);
        a.setState(state);
        a.setPincode(pincode);
        a.setIfscCode(ifsc);
        a.setNomineeName(nominee);
        a.setNomineeRelation(nomineeRelation);
    }

    static void deposit(BankBranch b)
    {
        String no=readRequired("Account No: ");
        Account a=b.findAccount(no);
        if(a==null)
        {
            System.out.println("Account not found.");
            return;
        }
        double amount=readPositiveDouble("Amount: ");
        a.deposit(amount);
        dailyReport.addAction("Deposit of "+amount+" in Account "+no);
        System.out.println("Amount Deposited Successfully");
    }
    static void withdraw(BankBranch b)
    {
        String no=readRequired("Account No: ");
        Account a=b.findAccount(no);
        if(a==null)
        {
            System.out.println("Account not found.");
            return;
        }
        double amount=readPositiveDouble("Amount: ");
        a.withdraw(amount);
        dailyReport.addAction("Withdrawal of "+amount+" from Account "+no);
        System.out.println("Amount Withdrawed Successfully");
    }
    static void transfer(BankBranch b)
    {
        String from=readRequired("From Account: ");
        String to=readRequired("To Account: ");
        double amount=readPositiveDouble("Amount: ");
        b.transfer(from,to,amount);
        dailyReport.addAction("Transfer of "+amount+" from "+from+" to "+to);
    }
    static void search(BankBranch b)
    {
        System.out.println("\n========== SEARCH ACCOUNT ==========");
        System.out.println("1. Search by Account No");
        System.out.println("2. Search by Customer ID");
        int choice=readChoice("Search by: ",1,2);
        Account a;
        if(choice==1)
        {
            a=b.findAccount(readRequired("Account No: "));
        }
        else
        {
            a=b.findAccountById(readPositiveInt("Customer ID: "));
        }
        if(a!=null)
        {
            a.getAccountDetails();
        }
        else System.out.println("Account not found.");
    }
    static void updateAccount(BankBranch b)
    {
        System.out.println("\n========== UPDATE ACCOUNT ==========");
        System.out.println("1. Update by Account No");
        System.out.println("2. Update by Customer ID");
        int choice=readChoice("Update by: ",1,2);
        Account a;
        if(choice==1)
        {
            a=b.findAccount(readRequired("Account No: "));
        }
        else
        {
            a=b.findAccountById(readPositiveInt("Customer ID: "));
        }
        if(a==null)
        {
            System.out.println("Account not found.");
            return;
        }
        System.out.println("Current account details:");
        a.getAccountDetails();
        System.out.println("\n========== UPDATE WHAT? ==========");
        System.out.println("1. Customer Name");
        System.out.println("2. Phone Number");
        System.out.println("3. Email");
        System.out.println("4. Address");
        System.out.println("5. City");
        System.out.println("6. State");
        System.out.println("7. Pincode");
        System.out.println("8. IFSC Code");
        System.out.println("9. Nominee Name");
        System.out.println("10. Nominee Relation");
        System.out.println("11. Account Status");
        System.out.println("12. Account Specific Details");
        int update=readChoice("Update what: ",1,12);
        if(update==1)
        {
            a.setCustomerName(readRequired("New Customer Name: "));
        }
        else if(update==2)
        {
            a.setPhoneNumber(readPhone("New Phone Number: "));
        }
        else if(update==3)
        {
            a.setEmail(readRequired("New Email: "));
        }
        else if(update==4)
        {
            a.setAddress(readRequired("New Address: "));
        }
        else if(update==5)
        {
            a.setCity(readRequired("New City: "));
        }
        else if(update==6)
        {
            a.setState(readRequired("New State: "));
        }
        else if(update==7)
        {
            a.setPincode(readPincode("New Pincode: "));
        }
        else if(update==8)
        {
            a.setIfscCode(readRequired("New IFSC Code: "));
        }
        else if(update==9)
        {
            a.setNomineeName(readRequired("New Nominee Name: "));
        }
        else if(update==10)
        {
            a.setNomineeRelation(readRequired("New Nominee Relation: "));
        }
        else if(update==11)
        {
            a.setStatus(readRequired("New Status: "));
        }
        else updateSpecific(a);
        dailyReport.addAction("Account updated: "+a.getAccountNo());
        System.out.println("Account updated successfully.");
        a.getAccountDetails();
    }
    	// Updates account-specific information based on the actual account type
    static void updateSpecific(Account a)
    {
    	// Check the actual runtime type of the Account object
        if(a instanceof SavingsAccount)
        {
        	// Downcast Account reference to SavingsAccount
            SavingsAccount s=(SavingsAccount)a;
            // Display Savings Account specific update options
            System.out.println("1. Minimum Balance");
            System.out.println("2. Auto Sweep");
            System.out.println("3. Online Banking");
            System.out.println("4. Mobile Banking");
            System.out.println("5. Cheque Book");
            int c=readChoice("Update: ",1,5);

            if(c==1)
            {
            	// Update minimum balance
                s.setMinimumBalance(readSavingsMinimumBalance());
            }
            else if(c==2)
            {
            	// Enable or disable automatic fund transfer/sweep

                s.setAutoSweepEnabled(readYesNo("Enable Auto Sweep?"));
            }
            else if(c==3)
            {
            	// Enable or disable online banking
                s.setOnlineBankingEnabled(readYesNo("Enable Online Banking?"));
            }
            else if(c==4)
            {
            	// Enable or disable mobile banking
                s.setMobileBankingEnabled(readYesNo("Enable Mobile Banking?"));
            }
            else
            {
            	// Enable or disable cheque book facility
                s.setChequeBookEnabled(readYesNo("Enable Cheque Book?"));
            }
        }
        else if(a instanceof SalaryAccount)
        {
        	// Downcast Account reference to SalaryAccount
            SalaryAccount s=(SalaryAccount)a;
         // Display Salary Account specific update options
            System.out.println("1. Employer Name");
            System.out.println("2. Salary");
            System.out.println("3. Department");
            System.out.println("4. Designation");
            System.out.println("5. Salary Verified");
            System.out.println("6. Employer Verified");
            System.out.println("7. Auto Salary Credit");
            System.out.println("8. Frozen");
            int c=readChoice("Update: ",1,8);

            if(c==1)
            {
            	// Update employer name

                s.setEmployerName(readRequired("Employer Name: "));
            }
            else if(c==2)
            {
            	// Update monthly salary
                s.setSalary(readPositiveDouble("Monthly Salary: "));
            }
            else if(c==3)
            {
            	// Update employee department
                s.setEmployeeDepartment(readDepartment());
            }
            else if(c==4)
            {
            	 // Update employee designation
                s.setDesignation(readRequired("Designation: "));
            }
            else if(c==5)
            {
            	// Update salary verification status
                s.setSalaryVerified(readYesNo("Is Salary Verified?"));
            }
            else if(c==6)
            {
            	// Update employer verification status
                s.setEmployerVerified(readYesNo("Is Employer Verified?"));
            }
            else if(c==7)
            {
            	// Enable or disable automatic salary credit
                s.setAutoSalaryCreditEnabled(readYesNo("Enable Auto Salary Credit?"));
            }
            else
            {
            	 // Freeze or unfreeze the account
                s.setFrozen(readYesNo("Freeze Account?"));
            }
        }
        else if(a instanceof CurrentAccount)
        {
        	 // Downcast Account reference to CurrentAccount
            CurrentAccount c=(CurrentAccount)a;
         // Display Current Account specific update options
            System.out.println("1. Business Name");
            System.out.println("2. Business Type");
            System.out.println("3. GST Number");
            System.out.println("4. Trade License");
            System.out.println("5. Overdraft Limit");
            System.out.println("6. KYC");
            System.out.println("7. Cheque Book");
            System.out.println("8. Statement");
            int x=readChoice("Update: ",1,8);

            if(x==1)
            {
            	// Update business name
                c.setBusinessName(readRequired("Business Name: "));
            }
            else if(x==2)
            {
            	 // Update type of business
                c.setBusinessType(readBusinessType());
            }
            else if(x==3)
            {
            	// Update GST number
                c.setGstNumber(readRequired("GST Number: "));
            }
            else if(x==4)
            {
            	// Update trade license number
                c.setTradeLicenseNo(readRequired("Trade License: "));
            }
            else if(x==5)
            {
            	// Update overdraft limit
                double limit=readOverdraftLimit();
                c.setOverdraftLimit(limit);
                // Reset available overdraft according to the new limit
                c.setAvailableOverdraft(limit);
            }
            else if(x==6)
            {
            	 // Update KYC verification status
                c.setKycVerified(readYesNo("Is KYC Verified?"));
            }
            else if(x==7)
            {
            	 // Enable or disable cheque book facility
                c.setChequeBookEnabled(readYesNo("Enable Cheque Book?"));
            }
            else
            {
            	 // Enable or disable account statement facility
                c.setStatementEnabled(readYesNo("Enable Statement?"));
            }
        }
        else if(a instanceof LoanAccount)
        {
        	// Downcast Account reference to LoanAccount
            LoanAccount l=(LoanAccount)a;
         // Display Loan Account specific update options

            System.out.println("1. Loan Type");
            System.out.println("2. Loan Amount");
            System.out.println("3. Tenure");
            System.out.println("4. Collateral");
            System.out.println("5. Guarantor");
            System.out.println("6. Credit Score");
            System.out.println("7. Pre-closure");
            System.out.println("8. Foreclosure Charges");
            int c=readChoice("Update: ",1,8);

            if(c==1)
            {
            	// Change loan type
                String loanType=readLoanType();
                l.setLoanType(loanType);
             // Update interest rate according to the selected loan type
                l.setInterestRate(getLoanInterestRate(loanType));
             // Recalculate EMI after changing loan type
                l.calculateEMI();
            }
            else if(c==2)
            {
            	// Read new loan amount
                double amount=readPositiveDouble("Loan Amount: ");
             // Loan amount cannot exceed the sanctioned amount

                if(amount<=l.getSanctionedAmount())
                {
                    l.setLoanAmount(amount);
                    // Recalculate EMI after changing loan amount
                    l.calculateEMI();
                }
                else
                {
                    System.out.println("Loan Amount cannot be greater than Sanctioned Amount.");
                }
            }
            else if(c==3)
            {
            	// Update loan repayment tenure in months
                l.setTenureMonths(readLoanTenure());
                // Recalculate EMI after changing tenure
                l.calculateEMI();
            }
            else if(c==4)
            {
            	// Update collateral details

                l.setCollateralDetails(readCollateral());
            }
            else if(c==5)
            {
            	// Update guarantor information
                l.setGuarantorName(readGuarantor());
            }
            else if(c==6)
            {
            	// Update credit score at the time of sanction
                l.setCreditScoreAtSanction(readCreditScore());
            }
            else if(c==7)
            {
                // Enable or disable loan pre-closure
                l.setPreClosureAllowed(readYesNo("Allow Pre-closure?"));
            }
            else
            {
                // Update foreclosure charges
                l.setForeclosureCharges(readForeclosureCharges());
            }
        }
    }
 // Deletes an account after finding it by account number or customer ID
    static void deleteAccount(BankBranch b)
    {
        System.out.println("\n========== DELETE ACCOUNT ==========");
        System.out.println("1. Delete by Account No");
        System.out.println("2. Delete by Customer ID");
        int choice=readChoice("Delete by: ",1,2);
        Account a;
        if(choice==1)
        {
        	// Search account using account number
            a=b.findAccount(readRequired("Account No: "));
        }
        else
        {
        	// Search account using customer ID
            a=b.findAccountById(readPositiveInt("Customer ID: "));
        }
     // Stop if the account does not exist
        if(a==null)
        {
            System.out.println("Account not found.");
            return;
        }
     // Display account details before deletion
        a.getAccountDetails();
     // Ask the user for confirmation before deleting
        boolean confirm=readBoolean("Confirm delete (true/false): ");
        if(!confirm)
        {
            System.out.println("Delete cancelled.");
            return;
        }
        if(choice==1)
        {
        	// Remove account using account number
            b.removeAccount(a.getAccountNo());
        }
        else
        {
        	// Remove account using customer ID
            b.removeAccountById(a.getCustomerId());
        }
     // Store deletion activity in the daily report
        dailyReport.addAction("Account deleted: "+a.getAccountNo());
    }
 // Displays transaction history of a particular account
    static void history(BankBranch b)
    {
    	 // Search account using account number
        Account a=b.findAccount(readRequired("Account No: "));
        if(a!=null)
        {
        	// Display all transactions of the account
            a.getTransactionHistory();
        }
        else System.out.println("Account not found.");
    }
 // Closes an account
    static void closeAccount(BankBranch b)
    {
    	// Search account using account number
        Account a=b.findAccount(readRequired("Account No: "));
        if(a!=null)
        {
        	// Close the selected account
            a.closeAccount();
         // Record account closure in daily report
            dailyReport.addAction("Account closed: "+a.getAccountNo());
        }
        else System.out.println("Account not found.");
    }
 // Returns interest rate according to the selected loan type
    static double getLoanInterestRate(String loanType)
    {
        if(loanType.equals("Personal Loan"))
        {
            return 10.0;
        }
        else if(loanType.equals("Home Loan"))
        {
            return 8.0;
        }
        else if(loanType.equals("Education Loan"))
        {
            return 7.0;
        }
        else if(loanType.equals("Vehicle Loan"))
        {
            return 9.0;
        }
        else
        {
        	// Business Loan
            return 11.0;
        }
    }
 // Reads and returns the loan type selected by the user
    static String readLoanType()
    {
        System.out.println("\n---------- LOAN TYPE ----------");
        System.out.println("1. Personal Loan - 10%");
        System.out.println("2. Home Loan - 8%");
        System.out.println("3. Education Loan - 7%");
        System.out.println("4. Vehicle Loan - 9%");
        System.out.println("5. Business Loan - 11%");
        int choice=readChoice("Select Loan Type: ",1,5);

        if(choice==1)
        {
            return "Personal Loan";
        }
        else if(choice==2)
        {
            return "Home Loan";
        }
        else if(choice==3)
        {
            return "Education Loan";
        }
        else if(choice==4)
        {
            return "Vehicle Loan";
        }
        else
        {
            return "Business Loan";
        }
    }
 // Reads the loan repayment tenure selected by the user
 // Returns tenure in months
    static int readLoanTenure()
    {
        System.out.println("\n---------- LOAN TENURE ----------");
        System.out.println("1. 12 Months");
        System.out.println("2. 24 Months");
        System.out.println("3. 36 Months");
        System.out.println("4. 48 Months");
        System.out.println("5. 60 Months");
        System.out.println("6. 84 Months");
        System.out.println("7. 120 Months");
        int choice=readChoice("Select Tenure: ",1,7);

        if(choice==1)
        {
            return 12;
        }
        else if(choice==2)
        {
            return 24;
        }
        else if(choice==3)
        {
            return 36;
        }
        else if(choice==4)
        {
            return 48;
        }
        else if(choice==5)
        {
            return 60;
        }
        else if(choice==6)
        {
            return 84;
        }
        else
        {
            return 120;
        }
    }
 // Reads and returns the selected business type
    static String readBusinessType()
    {
        System.out.println("\n---------- BUSINESS TYPE ----------");
        System.out.println("1. Retail");
        System.out.println("2. Wholesale");
        System.out.println("3. Manufacturing");
        System.out.println("4. Service");
        System.out.println("5. Other");
        int choice=readChoice("Select Business Type: ",1,5);

        if(choice==1)
        {
            return "Retail";
        }
        else if(choice==2)
        {
            return "Wholesale";
        }
        else if(choice==3)
        {
            return "Manufacturing";
        }
        else if(choice==4)
        {
            return "Service";
        }
        else
        {
            return "Other";
        }
    }
 // Reads and returns the selected employee department
    static String readDepartment()
    {
        System.out.println("\n---------- DEPARTMENT ----------");
        System.out.println("1. IT");
        System.out.println("2. HR");
        System.out.println("3. Finance");
        System.out.println("4. Sales");
        System.out.println("5. Marketing");
        System.out.println("6. Operations");
        System.out.println("7. Other");
        int choice=readChoice("Select Department: ",1,7);

        if(choice==1)
        {
            return "IT";
        }
        else if(choice==2)
        {
            return "HR";
        }
        else if(choice==3)
        {
            return "Finance";
        }
        else if(choice==4)
        {
            return "Sales";
        }
        else if(choice==5)
        {
            return "Marketing";
        }
        else if(choice==6)
        {
            return "Operations";
        }
        else
        {
            return "Other";
        }
    }
 // Reads and returns the nominee's relationship with the account holder
    static String readNomineeRelation()
    {
        System.out.println("\n---------- NOMINEE RELATION ----------");
        System.out.println("1. Father");
        System.out.println("2. Mother");
        System.out.println("3. Spouse");
        System.out.println("4. Brother");
        System.out.println("5. Sister");
        System.out.println("6. Son");
        System.out.println("7. Daughter");
        System.out.println("8. Other");
        int choice=readChoice("Select Relation: ",1,8);

        if(choice==1)
        {
            return "Father";
        }
        else if(choice==2)
        {
            return "Mother";
        }
        else if(choice==3)
        {
            return "Spouse";
        }
        else if(choice==4)
        {
            return "Brother";
        }
        else if(choice==5)
        {
            return "Sister";
        }
        else if(choice==6)
        {
            return "Son";
        }
        else if(choice==7)
        {
            return "Daughter";
        }
        else
        {
            return "Other";
        }
    }
 // Reads and returns the selected collateral type
    static String readCollateral()
    {
        System.out.println("\n---------- COLLATERAL ----------");
        System.out.println("1. No Collateral");
        System.out.println("2. Property");
        System.out.println("3. Gold");
        System.out.println("4. Vehicle");
        System.out.println("5. Other");
        int choice=readChoice("Select Collateral: ",1,5);

        if(choice==1)
        {
            return "No Collateral";
        }
        else if(choice==2)
        {
            return "Property";
        }
        else if(choice==3)
        {
            return "Gold";
        }
        else if(choice==4)
        {
            return "Vehicle";
        }
        else
        {
            return "Other";
        }
    }
 // Reads and returns guarantor information
    static String readGuarantor()
    {
        System.out.println("\n---------- GUARANTOR ----------");
        System.out.println("1. No Guarantor");
        System.out.println("2. Guarantor Available");
        int choice=readChoice("Select Option: ",1,2);

        if(choice==1)
        {
            return "No Guarantor";
        }
        else
        {
        	 // If guarantor is available, ask for guarantor name
            return readRequired("Guarantor Name: ");
        }
    }
 // Reads and returns the minimum balance selected for Savings Account
    static double readSavingsMinimumBalance()
    {
        System.out.println("\n---------- SAVINGS MINIMUM BALANCE ----------");
        System.out.println("1. Rs. 1000");
        System.out.println("2. Rs. 2000");
        System.out.println("3. Rs. 5000");
        System.out.println("4. Rs. 10000");
        int choice=readChoice("Select Minimum Balance: ",1,4);

        if(choice==1)
        {
            return 1000;
        }
        else if(choice==2)
        {
            return 2000;
        }
        else if(choice==3)
        {
            return 5000;
        }
        else
        {
            return 10000;
        }
    }
 // Reads and returns the overdraft limit selected by the user
    static double readOverdraftLimit()
    {
        System.out.println("\n---------- OVERDRAFT LIMIT ----------");
        System.out.println("1. Rs. 25000");
        System.out.println("2. Rs. 50000");
        System.out.println("3. Rs. 100000");
        System.out.println("4. Rs. 250000");
        System.out.println("5. Rs. 500000");
        int choice=readChoice("Select Overdraft Limit: ",1,5);

        if(choice==1)
        {
            return 25000;
        }
        else if(choice==2)
        {
            return 50000;
        }
        else if(choice==3)
        {
            return 100000;
        }
        else if(choice==4)
        {
            return 250000;
        }
        else
        {
            return 500000;
        }
    }
 // Reads and returns the overdraft limit selected by the user
    static double readForeclosureCharges()
    {
        System.out.println("\n---------- FORECLOSURE CHARGES ----------");
        System.out.println("1. Rs. 1000");
        System.out.println("2. Rs. 2500");
        System.out.println("3. Rs. 5000");
        System.out.println("4. Rs. 10000");
        int choice=readChoice("Select Charges: ",1,4);

        if(choice==1)
        {
            return 1000;
        }
        else if(choice==2)
        {
            return 2500;
        }
        else if(choice==3)
        {
            return 5000;
        }
        else
        {
            return 10000;
        }
    }
 // Reads a non-empty String value from the user
    static String readRequired(String msg)
    {
        while(true)
        {
            System.out.print(msg);
            String s=sc.nextLine().trim();
            // Accept input only when it is not empty
            if(!s.isEmpty())
            {
                return s;
            }
            System.out.println("This field cannot be empty.");
        }
    }
 // Reads an integer safely and handles invalid input
    static int readInt(String msg)
    {
        while(true)
        {
            System.out.print(msg);
            if(sc.hasNextInt())
            {
                int n=sc.nextInt();
             // Consume the remaining newline
                sc.nextLine();
                return n;
            }
            System.out.println("Enter a valid number.");
         // Remove invalid input from Scanner
            sc.nextLine();
        }
    }
 // Reads an integer and ensures it is greater than zero
    static int readPositiveInt(String msg)
    {
        while(true)
        {
            int n=readInt(msg);
            if(n>0)
            {
                return n;
            }
            System.out.println("Value must be greater than 0.");
        }
    }
 // Reads a number within the specified minimum and maximum range
    static int readChoice(String msg,int min,int max)
    {
        while(true)
        {
            int n=readInt(msg);
            if(n>=min&&n<=max)
            {
                return n;
            }
            System.out.println("Enter choice between "+min+" and "+max+".");
        }
    }
 // Reads a double value safely
    static double readDouble(String msg)
    {
        while(true)
        {
            System.out.print(msg);
            if(sc.hasNextDouble())
            {
                double n=sc.nextDouble();
             // Consume the remaining newline
                sc.nextLine();
                return n;
            }
            System.out.println("Enter a valid amount.");
         // Remove invalid input from Scanner
            sc.nextLine();
        }
    }
 // Reads a double value and ensures it is greater than zero
    static double readPositiveDouble(String msg)
    {
        while(true)
        {
            double n=readDouble(msg);
            if(n>0)
            {
                return n;
            }
            System.out.println("Value must be greater than 0.");
        }
    }
 // Reads a double value and ensures it is zero or positive
    static double readNonNegativeDouble(String msg)
    {
        while(true)
        {
            double n=readDouble(msg);
            if(n>=0)
            {
                return n;
            }
            System.out.println("Value cannot be negative.");
        }
    }
 // Reads and validates a 10-digit phone number
    static String readPhone(String msg)
    {
        while(true)
        {
            String s=readRequired(msg);
            // Regular expression checks for exactly 10 digits
            if(s.matches("[0-9]{10}"))
            {
                return s;
            }
            System.out.println("Phone number must contain exactly 10 digits.");
        }
    }
 // Reads and validates a 6-digit pincode
    static String readPincode(String msg)
    {
        while(true)
        {
            String s=readRequired(msg);
         // Regular expression checks for exactly 6 digits
            if(s.matches("[0-9]{6}"))
            {
                return s;
            }
            System.out.println("Pincode must contain exactly 6 digits.");
        }
    }
 // Reads and validates credit score
 // Valid credit score range used by this application is 0 to 900
    static int readCreditScore()
    {
        while(true)
        {
            int n=readInt("Credit Score: ");
            if(n>=0&&n<=900)
            {
                return n;
            }
            System.out.println("Credit score should be between 0 and 900.");
        }
    }
 // Reads true/false input from the user
    static boolean readBoolean(String msg)
    {
        while(true)
        {
            String s=readRequired(msg);
            if(s.equalsIgnoreCase("yes"))
            {
                return true;
            }
            if(s.equalsIgnoreCase("no"))
            {
                return false;
            }
            System.out.println("Enter only yes or No.");
        }
    }
 // Displays Yes/No options and converts the selected option into boolean
    static boolean readYesNo(String msg)
    {
        System.out.println(msg);
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice=readChoice("Select: ",1,2);

        if(choice==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

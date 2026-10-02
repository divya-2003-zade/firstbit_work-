package b1;

import java.util.ArrayList;

public class DailyReport implements ReportOperations
{
    private BankBranch branch;
    private double totalBalance;
    private int totalAccounts;

    private ArrayList<String> actions;

    public DailyReport(BankBranch branch)
    {
        this.branch=branch;
        actions=new ArrayList<String>();
    }

    public void addAction(String action)
    {
        actions.add(action);
    }

    public void generate()
    {
        totalBalance=branch.getTotalBalance();
        totalAccounts=branch.getAccountCount();

        System.out.println("Daily report generated.");
    }

    public void printReport()
    {
        System.out.println("\n========== DAILY REPORT ==========");

        System.out.println("Bank            : "+branch.getBankName());
        System.out.println("Branch          : "+branch.getBranchName());
        System.out.println("Total Accounts  : "+totalAccounts);
        System.out.println("Total Balance   : "+totalBalance);

        System.out.println("\n---------- ACTIONS TODAY ----------");

        if(actions.size()==0)
        {
            System.out.println("No actions performed.");
        }
        else
        {
            for(String action:actions)
            {
                System.out.println("- "+action);
            }
        }

        System.out.println("Total Actions   : "+actions.size());

        System.out.println("==================================");
    }

    public void exportReport()
    {
        System.out.println("Report export completed.");
    }
}
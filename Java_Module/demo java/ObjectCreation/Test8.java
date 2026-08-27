class SalesManager{
    int id;
    String name;
    double salary;
    double incentive;
    int target;
}

class SalesManagerData{
    public static void main(String args[])
    {
        System.out.println("SalesManager Details");

        SalesManager sm1,sm2;   // reference

        sm1=new SalesManager();
        sm2=new SalesManager();

        // first SalesManager details
        sm1.id=101;
        sm1.name="Divya";
        sm1.salary=40000;
        sm1.incentive=5000;
        sm1.target=100;

        // second SalesManager details
        sm2.id=102;
        sm2.name="Pratu";
        sm2.salary=45000;
        sm2.incentive=6000;
        sm2.target=120;

        // first SalesManager details print
        System.out.println("SalesManager Id : "+sm1.id);
        System.out.println("SalesManager Name : "+sm1.name);
        System.out.println("SalesManager Salary : "+sm1.salary);
        System.out.println("SalesManager Incentive : "+sm1.incentive);
        System.out.println("SalesManager Target : "+sm1.target);

        // second SalesManager details print
        System.out.println("SalesManager Id : "+sm2.id);
        System.out.println("SalesManager Name : "+sm2.name);
        System.out.println("SalesManager Salary : "+sm2.salary);
        System.out.println("SalesManager Incentive : "+sm2.incentive);
        System.out.println("SalesManager Target : "+sm2.target);

        System.out.println(sm1);
    }
}
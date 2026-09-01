class Admin{
    int id;
    String name;
    double salary;
}

class AdminData{
    public static void main(String args[])
    {
        System.out.println("Admin Details");

        Admin a1,a2;   // reference

        a1=new Admin();
        a2=new Admin();

        // first Admin details
        a1.id=101;
        a1.name="Divya";
        a1.salary=45000;

        // second Admin details
        a2.id=102;
        a2.name="Pratu";
        a2.salary=55000;

        // first Admin details print
        System.out.println("Admin Id : "+a1.id);
        System.out.println("Admin Name : "+a1.name);
        System.out.println("Admin Salary : "+a1.salary);

        // second Admin details print
        System.out.println("Admin Id : "+a2.id);
        System.out.println("Admin Name : "+a2.name);
        System.out.println("Admin Salary : "+a2.salary);

        System.out.println(a1);
    }
}
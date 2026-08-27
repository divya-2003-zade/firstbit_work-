class HR{
    int id;
    String name;
    double salary;
}

class HRData{
    public static void main(String args[])
    {
        System.out.println("HR Details");

        HR h1,h2;   // reference

        h1=new HR();
        h2=new HR();

        // first HR details
        h1.id=101;
        h1.name="Divya";
        h1.salary=50000;

        // second HR details
        h2.id=102;
        h2.name="Pratu";
        h2.salary=60000;

        // first HR details print
        System.out.println("HR Id : "+h1.id);
        System.out.println("HR Name : "+h1.name);
        System.out.println("HR Salary : "+h1.salary);

        // second HR details print
        System.out.println("HR Id : "+h2.id);
        System.out.println("HR Name : "+h2.name);
        System.out.println("HR Salary : "+h2.salary);

        System.out.println(h1);
    }
}
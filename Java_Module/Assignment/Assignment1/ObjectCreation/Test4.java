class Employee{
    int id;
    String name;
    double salary;
}

class EmployeeData{
    public static void main(String args[])
    {
        System.out.println("Employee Data");

        Employee e1,e2;   // reference

        e1=new Employee();
        e2=new Employee();

        // first employee details
        e1.id=101;
        e1.name="Divya";
        e1.salary=30000;

        // second employee details
        e2.id=102;
        e2.name="Pratu";
        e2.salary=40000;

        // first employee details print
        System.out.println("Employee Id : "+e1.id);
        System.out.println("Employee Name : "+e1.name);
        System.out.println("Employee Salary : "+e1.salary);

        // second employee details print
        System.out.println("Employee Id : "+e2.id);
        System.out.println("Employee Name : "+e2.name);
        System.out.println("Employee Salary : "+e2.salary);

        System.out.println(e1);
    }
}
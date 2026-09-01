class Employee {
    int id;
    String name;
    double salary;

    // Default Constructor
    Employee() {
        System.out.println("Default Constructor called");

        this.id = 101;
        this.name = "abc";
        this.salary = 30000;
    }

    // Parameterized Constructor
    Employee(int i, String n, double s) {
        System.out.println("Parameterized Constructor called");

        this.id = i;
        this.name = n;
        this.salary = s;
    }

    // Setter methods
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    // Display method
    void display() {
        System.out.println("Employee Id : " + this.id);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Salary : " + this.salary);
    }
}

class EmployeeData {
    public static void main(String args[]) {

        System.out.println("Employee Data");

        Employee e1, e2;   // reference

        // Default Constructor
        e1 = new Employee();
        e1.display();

        // Parameterized Constructor
        e2 = new Employee(102, "Divya", 40000);
        e2.display();
    }
}
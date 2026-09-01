class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    int target;

    // Default Constructor
    SalesManager() {
        System.out.println("Default Constructor called");

        this.id = 101;
        this.name = "abc";
        this.salary = 40000;
        this.incentive = 5000;
        this.target = 100;
    }

    // Parameterized Constructor
    SalesManager(int i, String n, double s, double in, int t) {
        System.out.println("Parameterized Constructor called");

        this.id = i;
        this.name = n;
        this.salary = s;
        this.incentive = in;
        this.target = t;
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

    void setIncentive(double in) {
        this.incentive = in;
    }

    void setTarget(int t) {
        this.target = t;
    }

    // Display method
    void display() {
        System.out.println("SalesManager Id : " + this.id);
        System.out.println("SalesManager Name : " + this.name);
        System.out.println("SalesManager Salary : " + this.salary);
        System.out.println("SalesManager Incentive : " + this.incentive);
        System.out.println("SalesManager Target : " + this.target);
    }
}

class SalesManagerData {
    public static void main(String args[]) {

        System.out.println("SalesManager Details");

        SalesManager sm1, sm2;   // reference

        // Default Constructor
        sm1 = new SalesManager();
        sm1.display();

        // Parameterized Constructor
        sm2 = new SalesManager(102, "Pratu", 45000, 6000, 120);
        sm2.display();
    }
}
class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    int target;

    // SET methods
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double i) {
        this.incentive = i;
    }

    void setTarget(int t) {
        this.target = t;
    }

    // GET methods
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    double getIncentive() {
        return this.incentive;
    }

    int getTarget() {
        return this.target;
    }

    // DISPLAY method using GET methods
    void display() {
        System.out.println("SalesManager Id : " + getId());
        System.out.println("SalesManager Name : " + getName());
        System.out.println("SalesManager Salary : " + getSalary());
        System.out.println("SalesManager Incentive : " + getIncentive());
        System.out.println("SalesManager Target : " + getTarget());
    }
}

class SalesManagerData {
    public static void main(String args[]) {

        System.out.println("SalesManager Details");

        SalesManager sm1, sm2;

        sm1 = new SalesManager();
        sm2 = new SalesManager();

        // First SalesManager details using SET
        sm1.setId(101);
        sm1.setName("Divya");
        sm1.setSalary(40000);
        sm1.setIncentive(5000);
        sm1.setTarget(100);

        // Second SalesManager details using SET
        sm2.setId(102);
        sm2.setName("Pratu");
        sm2.setSalary(45000);
        sm2.setIncentive(6000);
        sm2.setTarget(120);

        // Display
        sm1.display();
        sm2.display();
    }
}
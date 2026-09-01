class HR {
    int id;
    String name;
    double salary;

    // Default Constructor
    HR() {
        System.out.println("Default Constructor called");

        this.id = 101;
        this.name = "abc";
        this.salary = 50000;
    }

    // Parameterized Constructor
    HR(int i, String n, double s) {
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
        System.out.println("HR Id : " + this.id);
        System.out.println("HR Name : " + this.name);
        System.out.println("HR Salary : " + this.salary);
    }
}

class HRData {
    public static void main(String args[]) {

        System.out.println("HR Details");

        HR h1, h2;   // reference

        // Default Constructor
        h1 = new HR();
        h1.display();

        // Parameterized Constructor
        h2 = new HR(102, "Pratu", 60000);
        h2.display();
    }
}
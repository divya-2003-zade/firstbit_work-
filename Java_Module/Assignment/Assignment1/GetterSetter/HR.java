class HR {
    int id;
    String name;
    double salary;

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

    // DISPLAY method
    void display() {
        System.out.println("HR Id : " + this.id);
        System.out.println("HR Name : " + this.name);
        System.out.println("HR Salary : " + this.salary);
    }
}

class HRData {
    public static void main(String args[]) {

        System.out.println("HR Details");

        HR h1, h2;

        h1 = new HR();
        h2 = new HR();

        // First HR details using SET
        h1.setId(101);
        h1.setName("Divya");
        h1.setSalary(50000);

        // Second HR details using SET
        h2.setId(102);
        h2.setName("Pratu");
        h2.setSalary(60000);

        // Display HR details
        h1.display();
        h2.display();

        // GET methods  in if-else
        if (h1.getSalary() > h2.getSalary()) {
            System.out.println("Divya has higher salary!!");
        } 
        else {
            System.out.println("Pratu has higher salary!!");
        }
    }
}
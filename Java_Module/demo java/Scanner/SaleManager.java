import java.util.Scanner;

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

    void setSalary(double sa) {
        this.salary = sa;
    }

    void setIncentive(double d) {
        this.incentive = d;
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

	Scanner s=new Scanner(System.in);
	
	SalesManager sm=new SalesManager();
	System.out.println("Enter a SalesManager Id: ");
	int i=s.nextInt();
	sm.setId(i);
	
	System.out.println("Enter a SalesManager Name : ");
	s.nextLine();
	String n=s.nextLine();
	sm.setName(n);
	
	System.out.println("Enter a Salary :");
	double sa=s.nextDouble();
	sm.setSalary(sa);

	System.out.println("Enter a Incentive :");
	double d=s.nextDouble();
	sm.setIncentive(d);

	System.out.println("Enter a Targets :");
	int t=s.nextInt();
	sm.setTarget(t);
	
	sm.display();

	

           }
}
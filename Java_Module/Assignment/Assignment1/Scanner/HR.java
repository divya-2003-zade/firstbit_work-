import java.util.Scanner;

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

        Scanner s=new Scanner(System.in);
	
	HR h=new HR();
	System.out.println("Enter a HR Id: ");
	int i=s.nextInt();
	h.setId(i);
	
	System.out.println("Enter a HR Name : ");
	s.nextLine();
	String n=s.nextLine();
	h.setName(n);
	
	System.out.println("Enter a Salary :");
	double sa=s.nextDouble();
	h.setSalary(sa);
	
	h.display();



            }
}
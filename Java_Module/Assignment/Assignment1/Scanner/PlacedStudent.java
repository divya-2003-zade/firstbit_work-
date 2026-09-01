import java.util.Scanner;

class PlacedStudent {
    int frn;
    String studentName;
    int distanceCovered;
    String companyname;
    String designation;

    // SET methods
    void setFrn(int f) {
        this.frn = f;
    }

    void setStudentName(String n) {
        this.studentName = n;
    }

    void setDistanceCovered(int d) {
        this.distanceCovered = d;
    }

    void setCompanyname(String c) {
        this.companyname = c;
    }

    void setDesignation(String d1) {
        this.designation = d1;
    }

    // GET methods
    int getFrn() {
        return this.frn;
    }

    String getStudentName() {
        return this.studentName;
    }

    int getDistanceCovered() {
        return this.distanceCovered;
    }

    String getCompanyname() {
        return this.companyname;
    }

    String getDesignation() {
        return this.designation;
    }

    // DISPLAY method
    void display() {
        System.out.println("FRN : " + this.frn);
        System.out.println("Name : " + this.studentName);
        System.out.println("Distance : " + this.distanceCovered);
        System.out.println("Company : " + this.companyname);
        System.out.println("Designation : " +this.designation);
    }
}
class TestPlacedStudent {
    public static void main(String args[]) {


	Scanner s= new Scanner(System.in);
	
	PlacedStudent s1=new PlacedStudent();

	System.out.println("Enter Student FRN : ");
	int f=s.nextInt();
	s1.setFrn(f);
	
	System.out.println("Enter Student Name :");
	s.nextLine();
	String n=s.nextLine();
	s1.setStudentName(n);
	
	System.out.println("Enter Student Distanced Covered :");
	int d=s.nextInt();
	s1.setDistanceCovered(d);

	System.out.println("Enter Company Name :");
	s.nextLine();
	String c=s.nextLine();
	s1.setCompanyname(c);

	System.out.println("Enter Designation :");
	//s.nextLine();
	String d1=s.nextLine();
	s1.setDesignation(d1);
	
	s1.display();

	
	

    }
}
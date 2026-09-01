import java.util.Scanner;

class Student{
	int frn;
	String studentName;
	int distanceCovered;

	 void setFrn(int f){
	this.frn=f;
	}
	void setStudentName(String n){
	this.studentName=n;
	}
	void setDistanceCovered(int d){
	this.distanceCovered=d;
	}
	int getFrn(){
	return this.frn;
	}
	String getStudentName(){
	return this.studentName;
	}
	int getDistanceCovered(){
	return this.distanceCovered;
	}
	void display(){
	System.out.println("Student frn no. : " + this.frn);
	System.out.println("Student Name : " + this.studentName);
	System.out.println("Distance Covered : " + this.distanceCovered);
	}
}
class TestStudent{
	public static void main(String args[])
	{
	System.out.println("Student Data");
	
	Scanner s=new Scanner(System.in);
	
	Student s1=new Student();

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
	
	s1.display();

	
	
	
	}
}


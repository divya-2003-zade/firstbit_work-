class Student{
	int frn;
	String studentName;
	int distanceCovered;
	
	Student(){
	System.out.println("Default Constructor called");
	this.frn=100;
	this.studentName="abc";
	this.distanceCovered=15;
	}
	Student(int f, String n, int d){
	System.out.println("Paramaterized Constructor called");
	this.frn=f;
	this.studentName=n;
	this.distanceCovered=d;
	}
	void setFrn(int f){
	frn=f;
	}
	void setStudentName(String n){
	studentName=n;
	}
	void setDistanceCovered(int d){
	distanceCovered=d;
	}
	void display()
{
System.out.println("Student Frn: "+this.frn);
System.out.println("Student Name : " + this.studentName);
System.out.println("Student distanced covered : " +this.distanceCovered);

}


}
class TestStudent{
	public static void main(String args[])
	{
	System.out.println("Student Data");
	Student s1;//reference
	s1=new Student();
	s1.display();
	Student s2 = new Student(101,"Divya",10);
	s2.display();

	}
}

		
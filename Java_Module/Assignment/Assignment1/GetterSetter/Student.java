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
}
class TestStudent{
	public static void main(String args[])
	{
	System.out.println("Student Data");
	Student s1,s2;//reference
	s1=new Student();

	s2=new Student();
	//first student details
	s1.setFrn(101);
	s1.setStudentName("Divya");
	s1.setDistanceCovered(10);
	System.out.println("Student frn no. : " + s1.getFrn());
	System.out.println("Student Name : " + s1.getStudentName());
	System.out.println("Distance Covered : " + s1.getDistanceCovered());
	
	//second student details
	s2.setFrn(102);
	s2.setStudentName("Pratu");
	s2.setDistanceCovered(5);
	System.out.println("Student frn no. : " + s2.getFrn());
	System.out.println("Student Name : " + s2.getStudentName());
	System.out.println("Distance Covered : " + s2.getDistanceCovered());
	}
}


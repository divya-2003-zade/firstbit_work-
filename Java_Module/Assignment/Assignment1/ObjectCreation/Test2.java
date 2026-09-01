class Student{
	int frn;
	String studentName;
	int distanceCovered;
}
class TestStudent{
	public static void main(String args[])
	{
	System.out.println("Student Data");
	Student s1,s2;//reference
	s1=new Student();

	s2=new Student();
	//first student details
	s1.frn=101;
	s1.studentName="Divya";
	s1.distanceCovered=10;
	
	//second student details
	s2.frn=102;
	s2.studentName="Pratu";
	s2.distanceCovered=5;

	//first student details print

	System.out.println("Student frn no. : "+s1.frn);
	System.out.println("student Name : "+s1.studentName);
	System.out.println("distance Covered : "+s1.distanceCovered);

	//second student details print

	System.out.println("Student frn no. : "+s2.frn);
	System.out.println("student Name : "+s2.studentName);
	System.out.println("distance Covered : "+s2.distanceCovered);
	System.out.println(s1);
	}
}


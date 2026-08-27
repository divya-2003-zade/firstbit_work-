class PlacedStudent{
    int frn;
    String studentName;
    int distanceCovered;
    String companyName;
    String designation;
	
	PlacedStudent(){
	System.out.println("Default Constructor called");
	this.frn=15;
	this.studentName="Pratu";
	this.distanceCovered=19;
	this.companyName="TCS";
	this.designation="Pune";
	}
	PlacedStudent(int f,String n,int d,String c,String l){
	System.out.println("Paramaterized Constructor called");

	this.frn=f;
	this.studentName=n;
	this.distanceCovered=d;
	this.companyName=c;
	this.designation=l;


	}

    void setFrn(int f) {
        frn = f;
    }

    void setStudentName(String n) {
        studentName=n;
    }

    void setDistanceCovered(int d) {
        distanceCovered=d;
    }
	void setCompany(String c)
	{
	companyName=c;
	}
	void setDesignation(String l)
	{
	designation=l;
	}
	void display(){
	System.out.println("Student frn no. : "+this.frn);
        System.out.println("Student Name : "+this.studentName);
        System.out.println("Distance Covered : "+this.distanceCovered);
        System.out.println("Company Name : "+this.companyName);
        System.out.println("Designation : "+this.designation);
	}



}

class TestPlacedStudent{
    public static void main(String args[])
    {
        System.out.println("Placed Student Data");

        PlacedStudent s1,s2;   // reference

        s1=new PlacedStudent();
	s1.display();

        s2=new PlacedStudent(101,"Divya",10,"Google","Mumbai");
	s2.display();

            }
}
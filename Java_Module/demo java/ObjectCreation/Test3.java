class PlacedStudent{
    int frn;
    String studentName;
    int distanceCovered;
    String companyname;
    String designation;
}

class TestPlacedStudent{
    public static void main(String args[])
    {
        System.out.println("Placed Student Data");

        PlacedStudent s1,s2;   // reference

        s1=new PlacedStudent();
        s2=new PlacedStudent();

        // first placed student details
        s1.frn=101;
        s1.studentName="Divya";
        s1.distanceCovered=10;
        s1.companyname="TCS";
        s1.designation="Java Developer";

        // second placed student details
        s2.frn=102;
        s2.studentName="Pratu";
        s2.distanceCovered=5;
        s2.companyname="Infosys";
        s2.designation="Software Engineer";

        // first student details print
        System.out.println("Student frn no. : "+s1.frn);
        System.out.println("Student Name : "+s1.studentName);
        System.out.println("Distance Covered : "+s1.distanceCovered);
        System.out.println("Company Name : "+s1.companyname);
        System.out.println("Designation : "+s1.designation);

        // second student details print
        System.out.println("Student frn no. : "+s2.frn);
        System.out.println("Student Name : "+s2.studentName);
        System.out.println("Distance Covered : "+s2.distanceCovered);
        System.out.println("Company Name : "+s2.companyname);
        System.out.println("Designation : "+s2.designation);

        System.out.println(s1);
    }
}
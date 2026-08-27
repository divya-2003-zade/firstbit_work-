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

    void setDesignation(String d) {
        this.designation = d;
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
        System.out.println("FRN : " + getFrn());
        System.out.println("Name : " + getStudentName());
        System.out.println("Distance : " + getDistanceCovered());
        System.out.println("Company : " + getCompanyname());
        System.out.println("Designation : " + getDesignation());
    }
}
class TestPlacedStudent {
    public static void main(String args[]) {

        PlacedStudent s1 = new PlacedStudent();

        // SET
        s1.setFrn(101);
        s1.setStudentName("Divya");
        s1.setDistanceCovered(10);
        s1.setCompanyname("TCS");
        s1.setDesignation("Java Developer");

        
        // DISPLAY
        s1.display();
    }
}
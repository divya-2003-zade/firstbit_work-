class Person{
	String name;
	int age;
	
	Person() {
		this.name = "NA";
		this.age = 0;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
class Student extends Person{
	int rollNo;
	String course;
	
	Student() {
		super();
		this.rollNo = 0;
		this.course = "NA";
	}
	
	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	String getCourse() {
		return course;
	}

	void setCourse(String course) {
		this.course = course;
	}

	Student(String name,int age,int rollNo, String course) {
		super(name,age);
		this.rollNo = rollNo;
		this.course = course;
	}
	void display() {
		super.display();
		System.out.println("Roll No : "+this.rollNo);
		System.out.println("Course : "+this.course);
	}
}
class GraduateStudent extends Student{
	String specialization;
	String researchTopic;
	double scholarshipAmount;
	
	GraduateStudent( ) {
		super();
		this.specialization = "NA";
		this.researchTopic = "NA";
		this.scholarshipAmount = 0.0;
	}
	GraduateStudent(String name, int age,int rollNo, String course,String specialization, String researchTopic, double scholarshipAmount) {
		super(name,age,rollNo,course);
		this.specialization = specialization;
		this.researchTopic = researchTopic;
		this.scholarshipAmount = scholarshipAmount;
	}
	String getSpecialization() {
		return specialization;
	}
	void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	String getResearchTopic() {
		return researchTopic;
	}
	void setResearchTopic(String researchTopic) {
		this.researchTopic = researchTopic;
	}
	double getScholarshipAmount() {
		return scholarshipAmount;
	}
	void setScholarshipAmount(double scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	void display() {
		super.display();
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Research Topic : "+this.researchTopic);
		System.out.println("Scholarship Amount : "+this.scholarshipAmount);
	}
}
class TestPerson {

	public static void main(String[] args) {
		System.out.println("Person Details ");
		Person p = new Person("Ram",25);
		p.display();
		System.out.println();
		
		System.out.println("Student Details ");
		p= new Student("Shyam",24,101,"B.tech");
		p.display();
		System.out.println();
		
		System.out.println("GraduateStudent Details ");
		p= new GraduateStudent("Riya",23,102,"B.Tech","Computer Science & Engineering","Health care",3500.500);
		p.display();
		
	}

}

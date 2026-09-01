class Person {
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
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student() {
        super();
        this.rollNo = 0;
        this.course = "NA";
    }

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }
    int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	void setCourse(String course) {
		this.course = course;
	}

	void display() {
        super.display();
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Course : " + this.course);
    }
}

class Employee extends Person {
    int employeeId;
    String department;

    Employee() {
        super();
        this.employeeId = 0;
        this.department = "NA";
    }

    Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("Employee ID : " + this.employeeId);
        System.out.println("Department : " + this.department);
    }
}

class TeachingAssistant extends Student {
    String subject;
    int hoursPerWeek;

    TeachingAssistant() {
        super();
        this.subject = "NA";
        this.hoursPerWeek = 0;
    }

    TeachingAssistant(String name, int age, int rollNo, String course, String subject, int hoursPerWeek) {

        super(name, age, rollNo, course);
        this.subject = subject;
        this.hoursPerWeek = hoursPerWeek;
    }

	void setSubject(String subject) {
		this.subject = subject;
	}

	int getHoursPerWeek() {
		return hoursPerWeek;
	}

	void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	void display() {
        super.display();
        System.out.println("Subject : " + this.subject);
        System.out.println("Hours Per Week : " + this.hoursPerWeek);
    }
}

class TestPerson {
    public static void main(String[] args) {

        System.out.println("Student Details");
        Person p = new Student("Rahul", 21, 101, "B.Tech");
        p.display();
        System.out.println();
        
        System.out.println("Employee Details");
        p = new Employee("Priya", 30, 501, "HR");
        p.display();
        System.out.println();

        System.out.println("Teaching Assistant Details");
        p = new TeachingAssistant("Amit",24,102,"B.Tech","Java",10);
        p.display();
    }
}

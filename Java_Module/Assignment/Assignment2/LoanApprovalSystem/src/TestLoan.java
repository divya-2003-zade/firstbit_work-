class Student{
		int rollNo;
	String name;
	double percentage;
	
	Student() {
		super();
		this.rollNo = 0;
		this.name = "abc";
		this.percentage = 0.0;
	}

	Student(int rollNo, String name, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPercentage() {
		return percentage;
	}

	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	void display() {
	System.out.println("Student Details:"); 
	System.out.println("Roll No : " + rollNo);
	System.out.println("Name : " + name);
	System.out.println("Percentage : " + percentage); 
	}

}
class Employee{
	int id;
	String name;
	double annualSalary;
	
	Employee() {
		this.id = 0;
		this.name = "abc";
		this.annualSalary = 0.0;
	}
	Employee(int id, String name, double annualSalary) {
		this.id = id;
		this.name = name;
		this.annualSalary = annualSalary;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getAnnualSalary() {
		return annualSalary;
	}
	void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}	
	void display() { 
		System.out.println("Employee Details:"); 
		System.out.println("Employee ID : " + id); 
		System.out.println("Name : " + name); 
		System.out.println("Annual Salary : " + annualSalary + " LPA"); 
		}
}
class Bank{
	//overloaded method for Student
	void approveLoans(Student s) {
		System.out.println("Student Loan Details:"); 
		s.display();
		
		if(s.percentage>80) {
			System.out.println("Loan Approved: ₹2,00,000");
		}
		else if(s.percentage>=60) {
			System.out.println("Loan Approved: ₹1,00,000");
		}
		else if(s.percentage>=40) {
			System.out.println("Loan Approved: ₹50,000");
		}
		else {
			System.out.println("No Loan Approved");
		}
		System.out.println();

		}
	//overloaded method for Employee
	void approveLoans(Employee emp) {
		System.out.println("Employee Loan Details:"); 
		emp.display();
		
		if(emp.annualSalary>12) {
			System.out.println("Loan Approved: ₹7,00,000");
		}
		else if(emp.annualSalary>=10) {
            System.out.println("Loan Approved: ₹6,00,000");
		}
		else if(emp.annualSalary>=6) {
			 System.out.println("Loan Approved: ₹5,00,000");
		}
		else if(emp.annualSalary>=4) {
			System.out.println("Loan Approved: ₹4,00,000");
		}
		else {
			System.out.println("No Loan Approved");

		}
		System.out.println();
	}
}

class TestLoan {
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Divya",80);
		Employee emp1 = new Employee(102,"Rahul",10);
		
		Bank b= new Bank();
		
		b.approveLoans(s1);
		b.approveLoans(emp1);

	}

}

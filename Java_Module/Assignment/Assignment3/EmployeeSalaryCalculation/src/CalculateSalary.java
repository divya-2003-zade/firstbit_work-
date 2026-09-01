class Employee{
	String name;
	double salary;
	static double bonusRate;
	{
		bonusRate=5;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	static double getBonusRate() {
		return bonusRate;
	}
	static void setBonusRate(double bonusRate) {
		Employee.bonusRate = bonusRate;
	}
	
	Employee() {
		super();
		this.name = "avc";
		this.salary = 00.0;
	}
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	//Method to Update the bonus rate
		static void updateBonusRate(double newBonusRate) {
			bonusRate=newBonusRate;
		}
		//method to calculate total Salary
		double calculateTotalSalary() {
			return salary +(salary * bonusRate/100); 
		}
		// Display Employee details
		void display() {
			System.out.println("Employee Name : "+name);
			System.out.println("Salary : "+salary);
			System.out.println("Bonus Rate : "+bonusRate );
			System.out.println("Total Bill: " + calculateTotalSalary()); 
			System.out.println();
		}
		
	
}
class CalculateSalary {

	public static void main(String[] args) {
		Employee emp1 = new Employee ("Ram",30000);
		Employee emp2 = new Employee ("shyam",50000);
		
		emp1.display();
		emp2.display();
		
		// Update Bonus Rate 
		Employee.updateBonusRate(6.0);
		
		System.out.println("After updating Bonus rate:"); 
		System.out.println();
		
		// Display Employee again
		emp1.display(); 
		emp2.display();

	}

}

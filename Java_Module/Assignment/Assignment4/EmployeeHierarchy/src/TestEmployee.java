class Employee{
	int id;
	String name;
	double salary;
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
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	Employee() {
		this.id = 0;
		this.name = "abc";
		this.salary = 0.0;
	}
	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+this.salary);
		
	}
}

class Admin extends Employee{
	double allowance;
	Admin() {
		super();
		this.allowance =0.0;
	}
	Admin(int id, String name, double salary ,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display() {
		super.display();
		System.out.println("Allowance "+this.allowance);
		
	}
	
}
class SalesManager extends Employee{
	int incentive;
	int target;
	SalesManager() {
		super();
		this.incentive = 0;
		this.target = 0;
	}
	SalesManager(int id,String name,double salary,int incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display() {
		super.display();
		System.out.println("Incentive : "+this.incentive);
		System.out.println("Target : "+this.target);
		
	}
}
class HR extends Employee{
	double commission;
	HR() {
		super();
		this.commission = 0.0;
	}
	HR(int id, String name, double salary,double commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	void display() {
		super.display();
		System.out.println("Commission : "+this.commission);
		
	}
	
}
class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Employee Details");
		Employee emp =new Employee(101,"Rahul",25000);
		emp.display();
		System.out.println();
		
		System.out.println("Admin Details");
		Admin ad = new Admin(201,"Ram",30000,5000);
		ad.display();
		System.out.println();
		
		System.out.println("SalesManager Details");
		SalesManager sm = new SalesManager(301,"Radha",35000,1000,10);
		sm.display();
		System.out.println();
		
		System.out.println("HR Details");
		HR hr = new HR(401,"Shyam",4500.50,4000);
		hr.display();
		System.out.println();

	}

}

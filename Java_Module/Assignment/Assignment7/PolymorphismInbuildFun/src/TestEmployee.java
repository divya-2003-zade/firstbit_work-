
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
	double calSal() {
		return salary;
	}
	public String toString() {
		return "ID: " +this.id+"\nName: "+this.name+"\nsalary: "+this.salary;
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
	double calSal() {
		return this.salary+this.allowance;
	}
	public String toString() {
		return super.toString()+"\nAllowance: " +this.allowance;
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
	double calSal() {
		return this.salary+this.incentive;
	}
	public String toString() {
		return super.toString()+"\nIncentive: " +this.incentive+"\nTarget: "+this.target;
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
	double calSal() {
		return this.salary+this.commission;
	}
	public String toString() {;
		return super.toString()+ "\nCommission: " +this.commission;
	}
	
}
class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Employee Details");
		Employee emp =new Employee(101,"Rahul",25000);
		System.out.println(emp.toString());
		System.out.println("Total Salary : "+emp.calSal());
		System.out.println();
		
		System.out.println("Admin Details");
		emp= new Admin(201,"Ram",30000,5000);
		System.out.println(emp.toString());
		System.out.println("Total Salary : "+emp.calSal());
		System.out.println();
		
		System.out.println("SalesManager Details");
	    emp = new SalesManager(301,"Radha",35000,1000,10);
	    System.out.println(emp.toString());
		System.out.println("Total Salary : "+emp.calSal());
		System.out.println();

		
		System.out.println("HR Details");
		emp = new HR(401,"Shyam",4500.50,4000);
		System.out.println(emp.toString());
		System.out.println("Total Salary : "+emp.calSal());


	}

}




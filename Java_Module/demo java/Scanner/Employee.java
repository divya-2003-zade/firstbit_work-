import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;
	//set 
	void setId(int i){
	this.id=i;
	}
	void setName(String n){
	this.name=n;
	}
	void setSalary(double s){
	this.salary=s;
	}
	//get
	int getId(){
	return this.id;
	}
	String getName(){
	return this.name;
	}
	double getSalary(){
	return this.salary;
	}
	//display
	void display()
       {
	System.out.println("Employee Id : "+this.id);
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Salary : "+this.salary);
	}


}

class EmployeeData{
    public static void main(String args[])
    {
        System.out.println("Employee Data");

        Scanner s=new Scanner(System.in);
	
	Employee emp=new Employee();
	System.out.println("Enter a HR Id: ");
	int i=s.nextInt();
	emp.setId(i);
	
	System.out.println("Enter a HR Name : ");
	s.nextLine();
	String n=s.nextLine();
	emp.setName(n);
	
	System.out.println("Enter a Salary :");
	double sa=s.nextDouble();
	emp.setSalary(sa);
	
	emp.display();


            }
}
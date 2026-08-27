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
	System.out.println("Employee Id : "+getId());
        System.out.println("Employee Name : "+getName());
        System.out.println("Employee Salary : "+getSalary());
	}


}

class EmployeeData{
    public static void main(String args[])
    {
        System.out.println("Employee Data");

        Employee e1,e2;   // reference

        e1=new Employee();
        e2=new Employee();

        // first employee details set
        e1.setId(101);
        e1.setName("Divya");
        e1.setSalary(30000);

        // second employee details set
        e2.setId(102);
        e2.setName("Pratu");
        e2.setSalary(40000);
	
 	//display
	e1.display();
	e2.display();

            }
}
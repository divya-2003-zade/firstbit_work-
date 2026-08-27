class Admin{
    int id;
    String name;
    double salary;
	void setId(int i){
	this.id=i;
	}
	void setName(String n){
	this.name=n;
	}
	void setSalary(double s){
	this.salary=s;
	}
	int getId(){
	return this.id;
	}
	String getName(){
	return this.name;
	}
 	double getSalary(){
	return this.salary;
	}
	void display()
	{
	System.out.println("Admin Id : "+this.id);
        System.out.println("Admin Name : "+this.name);
        System.out.println("Admin Salary : "+this.salary);
	}

}

class AdminData{
    public static void main(String args[])
    {
        System.out.println("Admin Details");

        Admin a1,a2;   // reference

        a1=new Admin();
        a2=new Admin();

        // first Admin details
        a1.setId(101);
        a1.setName("Divya");
        a1.setSalary(45000);

        // second Admin details
        a2.setId(102);
        a2.setName("Pratu");
        a2.setSalary(55000);
	
	a1.display();
	a2.display();

	if (a1.getSalary() > a2.getSalary()) {
    System.out.println("Divya has higher salary");
} else {
    System.out.println("Pratu has higher salary");
}

           }
}
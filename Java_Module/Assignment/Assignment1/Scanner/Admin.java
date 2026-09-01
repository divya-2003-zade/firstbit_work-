import java.util.Scanner;


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

         Scanner s=new Scanner(System.in);
	
	Admin ad=new Admin();
	System.out.println("Enter a Admin Id: ");
	int i=s.nextInt();
	ad.setId(i);
	
	System.out.println("Enter a Admin Name : ");
	s.nextLine();
	String n=s.nextLine();
	ad.setName(n);
	
	System.out.println("Enter a Salary :");
	double sa=s.nextDouble();
	ad.setSalary(sa);
	
	ad.display();


           }
}
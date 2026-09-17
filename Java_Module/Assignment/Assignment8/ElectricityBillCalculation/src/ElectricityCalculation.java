import java.util.Scanner;
abstract class ElectricityBill{
	String customerName;
	double units;
	//Default Constructor
	ElectricityBill() {
		this.customerName = "NA";
		this.units = 0.0;
	}
	//Parameterized Constructor
	ElectricityBill(String customerName, double units) {
		this.customerName = customerName;
		this.units = units;
	}
	//Setter and Getters Method
	String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	double getUnits() {
		return units;
	}
	void setUnits(double units) {
		this.units = units;
	}
	void showUsage() {
		System.out.println("Customer Name : "+this.customerName);
		System.out.println("Unit Consumed :"+this.units);
	}
	abstract double calculateBill();
	
	final void generateBill() {
		
		double bill = calculateBill();
		double tax = bill * 0.05;
		double fixedCharge = 50;
		double finalBill = bill * tax + fixedCharge;
		
		showUsage();
		
		System.out.println("Unit Bill : "+bill);
		System.out.println("Tax (5%) : "+tax);
		System.out.println("Fixed Charge :"+fixedCharge);
		System.out.println("Final Bill : "+finalBill);
		
	}
	
}
class ResidentialBill extends ElectricityBill{

	ResidentialBill() {
		super();
	}
	ResidentialBill(String customerName, double units) {
		super(customerName,units);
	}
	//Method override
	double calculateBill() {
		double bill=0;
		if(units <=100) {
			bill = units *2.5;
		}else if(units <=300) {
			bill =( (100 * 2.5)+(units-100) * 3.5);
		}
		else {

			bill =( (100 * 2.5)+(200 *3.5)+(units-300) * 5);
		
		}
		if(units >500) {
			bill = bill +150;
		}
		return bill;	
	}
	
}
class CommercialBill extends ElectricityBill{
	//Default Constructor
	CommercialBill() {
        super();
    }
	//Parameterized Constructor 
	CommercialBill(String customerName, double units) {
        super(customerName, units);
    }
	//method override
	double calculateBill() {
		double bill = units * 6.5;
		
		if(bill < 200) {
			bill = 1500;
			
		}
		if (units >1000) {
			bill = bill + (bill *0.08);
		}
		return bill;
	}
	
}
class ElectricityCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Residential ");
		System.out.println("2. Commercial ");
		
		System.out.println("Enter Customer type : ");
		int choice =sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Customer Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter units Consumed : ");
		double units = sc.nextDouble();
		
		ElectricityBill bill ;
		
		if(choice ==1) {
			bill = new ResidentialBill(name,units);
			
		}
		else if (choice==2) {
			bill = new CommercialBill(name,units);
			
		}
		else {
			System.out.println("Invalild Customer type ");
			sc.close();
			return;
		}
		
		bill . generateBill();
		sc.close();
		

	}

}

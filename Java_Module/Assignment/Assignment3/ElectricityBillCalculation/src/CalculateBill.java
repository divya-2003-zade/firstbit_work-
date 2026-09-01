class ElectricityBill{
	// Customer details
	int customerId; 
	String customerName; 
	double unitsConsumed;
	static double ratePerUnit;  // Static variable - same rate for all customers
	static {
		 ratePerUnit = 8.0;
	}
	int getCustomerId() {
		return customerId;
	}
	void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	double getUnitsConsumed() {
		return unitsConsumed;
	}
	void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	static double getRatePerUnit() {
		return ratePerUnit;
	}
	static void setRatePerUnit(double ratePerUnit) {
		ElectricityBill.ratePerUnit = ratePerUnit;
	}
	//Default Constructor
	ElectricityBill() {
		this.customerId = 0;
		this.customerName = "abs";
		this.unitsConsumed =0.0;
	}
	// Parameterized Constructor
	ElectricityBill(int customerId, String customerName, double unitsConsumed) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}
	//Method to Update the electricity rate
	static void updateRate(double newRate) {
		ratePerUnit=newRate;
	}
	//method to calculate total bill
	double calculateTotalBill() {
		return unitsConsumed * ratePerUnit;
	}
	// Display customer details and bill
	void display() {
		System.out.println("Customer Id : "+customerId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Unit Consumed : "+unitsConsumed);
		System.out.println("Rate per unit : "+ratePerUnit );
		System.out.println("Total Bill: " + calculateTotalBill()); 
		System.out.println();
	}
	
	
}
class CalculateBill {

	public static void main(String[] args) {
		ElectricityBill c1 = new ElectricityBill(100,"Ram",98);
		ElectricityBill c2 = new ElectricityBill(101,"shyam",110);
		
		c1.display();
		c2.display();
		
		// Update electricity rate 
		ElectricityBill.updateRate(10.0);
		
		System.out.println("After updating electricity rate:"); 
		System.out.println();
		
		// Display bills again
		c1.display(); 
		c2.display();

	}

}

class Vehicle{
	String vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	Vehicle() {
		this.vehicleNumber = "NA";
		this.model = "NA";
		this.companyName = "NA";
		this.noOfWheels = 0;
		this.price = 0.0;
	}
	Vehicle(String vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	String getVehicleNumber() {
		return vehicleNumber;
	}
	void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	int getNoOfWheels() {
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void display() {
		System.out.println("Vehicle Number : "+this.vehicleNumber);
		System.out.println("Vehicle Model : "+this.model);
		System.out.println("Vehicle Company Name : "+this.companyName);		
		System.out.println("No of Wheels  : "+this.noOfWheels);
		System.out.println("Vehicle Price : "+this.price);
	}
	
}
class Bike extends Vehicle{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	Bike() {
		super();
		this.noOfStands = 0;
		this.noOfHelmets = 0;
		this.bikeCategory = "NA";
	}
	Bike(String vehicleNumber, String model, String companyName, int noOfWheels, double price,int noOfStands, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	int getNoOfStands() {
		return noOfStands;
	}
	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}
	int getNoOfHelmets() {
		return noOfHelmets;
	}
	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}
	String getBikeCategory() {
		return bikeCategory;
	}
	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	void display() {
		super.display();
		System.out.println("No Of Stands : " + this.noOfStands);
        System.out.println("No Of Helmets : " + this.noOfHelmets);
        System.out.println("Bike Category : " + this.bikeCategory);

	}
	
}
class Car extends Vehicle{
	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;
	Car() {
		super();
		this.hasPowerSteering = false;
		this.driveMode ="na";
		this.parkingAssistSensors = 0;
	}
	Car(String vehicleNumber, String model, String companyName, int noOfWheels, double price,boolean hasPowerSteering, String driveMode, int parkingAssistSensors) {
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}
	boolean isHasPowerSteering() {
		return hasPowerSteering;
	}
	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}
	String getDriveMode() {
		return driveMode;
	}
	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}
	int getParkingAssistSensors() {
		return parkingAssistSensors;
	}
	void setParkingAssistSensors(int parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}
	void display() {
		super.display();
		 System.out.println("Has Power Steering : " + this.hasPowerSteering);
	        System.out.println("Drive Mode : " + this.driveMode);
	        System.out.println("Parking Assist Sensors : " + this.parkingAssistSensors);
	}
	
}
class Bus extends Vehicle{
	int passengerCapacity;
    int standingCapacity;
    Bus() {
        super();
        this.passengerCapacity = 0;
        this.standingCapacity = 0;
    }
    Bus(String vehicleNumber, String model, String companyName,int noOfWheels, double price,
            int passengerCapacity, int standingCapacity) {
            super(vehicleNumber, model, companyName, noOfWheels, price);
            this.passengerCapacity = passengerCapacity;
            this.standingCapacity = standingCapacity;
        }
	int getPassengerCapacity() {
		return passengerCapacity;
	}
	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	int getStandingCapacity() {
		return standingCapacity;
	}
	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	 void display() {
	        super.display();
	        System.out.println("Passenger Capacity : " + this.passengerCapacity);
	        System.out.println("Standing Capacity : " + this.standingCapacity);
	    }

}
class TestVehicle {

	public static void main(String[] args) {
		System.out.println("Vehicle Details");
        Vehicle v = new Vehicle("MH12AB1234","Generic","Tata", 4,500000);
        v.display();
        System.out.println();

        System.out.println("Bike Details");
        Bike b = new Bike("MH31CD5678","Activa 6G","Honda", 2,85000, 1,2, "Scooter");
        b.display();
        System.out.println();

        System.out.println("Car Details");
        Car c = new Car("MH12EF1234","Creta","Hyundai",4,1200000,true,"Automatic",4);
        c.display();
        System.out.println();

        System.out.println("Bus Details");
        Bus bus = new Bus("MH40GH5678","Starbus","Tata",6,2500000,50,20);
        bus.display();


	}

}

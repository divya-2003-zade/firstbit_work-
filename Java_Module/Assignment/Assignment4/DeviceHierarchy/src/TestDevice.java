class Device{
	String model;
	String brand;
	Device() {
		this.model = "NA";
		this.brand = "NA";
	}
	Device(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void display() {
		System.out.println("Model : "+this.model);
		System.out.println("Brand : "+this.brand);
		
	}
}
class Computer extends Device{
	String processor;
	int ram;
	Computer() {
		this.processor = "NA";
		this.ram =0;
	}
	
	Computer(String model, String brand,String processor, int ram) {
		super(model,brand);
		this.processor = processor;
		this.ram = ram;
	}

	String getProcessor() {
		return processor;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}

	int getRam() {
		return ram;
	}

	void setRam(int ram) {
		this.ram = ram;
	}
	void display() {
		super.display();
		System.out.println("Processor : "+this.processor);
		System.out.println("RAm : "+this.ram);
	}
}
class Laptop extends Computer{
	int batteryCapacity;
    double screenSize;
    Laptop() {
    	super();
		this.batteryCapacity = 0;
		this.screenSize = 0.0;
	}
	Laptop(String brand, String model,String processor, int ram,int batteryCapacity, double screenSize) {
		super(model,brand,processor,ram);
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
	}
	int getBatteryCapacity() {
		return batteryCapacity;
	}
	void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	double getScreenSize() {
		return screenSize;
	}
	void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
    void display() {
    	super.display();
    	System.out.println("Battery Capacity : "+this.batteryCapacity);
    	System.out.println("Screen Size : "+this.screenSize);
    }
}
class TestDevice {

	public static void main(String[] args) {
		System.out.println("Device Details ");
		Device d1= new Device("Pavilion","HP");
		d1.display();
		System.out.println();
		
		System.out.println("Computer Details ");
		d1=new Computer("HP","Pavilion","Intel Core i5",16);
		d1.display();
		System.out.println();
		
		System.out.println("Laptop Details ");
		d1=new Laptop("HP","Pavilion","Intel Core i5",16,10,15.6);
		d1.display();		

	}

}

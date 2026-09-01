class Calculator{
	//perform Additon 
	void add(int a,int b) {
		System.out.println("Addition of the two integer value is : "+(a+b));
	}
	void add(double a,double b) {
		System.out.println("Addition of the two double value  is : "+(a+b));
	}
	void add(int a,double b) {
		System.out.println("Addition of the one integer & one double is : "+(a+b));
	}
	void add(double a,int b) {
		System.out.println("Addition of the one double & one integer is : "+(a+b) + "\n");
	}
	//perform Substraction
	void sub(int a,int b) {
		System.out.println("Substraction of the two integer value is : "+(a-b));
	}
	void sub(double a,double b) {
		System.out.println("Substraction of the two double value  is : "+(a-b));
	}
	void sub(int a,double b) {
		System.out.println("Substraction of the one integer & one double is : "+(a-b));
	}
	void sub(double a,int b) {
		System.out.println("Substraction of the one double & one integer is : "+(a-b) + "\n");
	}
	//perform Multiplication
	void mul(int a,int b) {
		System.out.println("Multiplication of the two integer value is : "+(a*b));
	}
	void mul(double a,double b) {
		System.out.println("Multiplication of the two double value  is : "+(a*b));
	}
	void mul(int a,double b) {
		System.out.println("Multiplication of the one integer & one double is : "+(a*b));
	}
	void mul(double a,int b) {
		System.out.println("Multiplication of the one double & one integer is : "+(a*b) + "\n");
	}
	//perform Division
	void div(int a,int b) {
		System.out.println("Division of the two integer value is : "+(a/b));
	}
	void div(double a,double b) {
		System.out.println("Division of the two double value  is : "+(a/b));
	}
	void div(int a,double b) {
		System.out.println("Division of the one integer & one double is : "+(a/b));
	}
	void div(double a,int b) {
		System.out.println("Division of the one double & one integer is : "+(a/b));
	}
	
}

class ArithmeticOperation {

	public static void main(String[] args) {
		Calculator c = new Calculator();
			//addtion
			c.add(10, 20);
			c.add(10.5, 20.5);
			c.add(10, 20.5);
			c.add(10.6, 10);
			//substraction
			c.sub(20, 10);
			c.sub(30.5, 20.5);
			c.sub(30, 20.5);
			c.sub(20.6, 10);
			//multiplication
			c.mul(20, 5);
			c.mul(10.5, 5.5);
			c.mul(10, 10.5);
			c.mul(5.6, 10);
			//Division
			c.div(20, 5);
			c.div(10.5, 5.5);
			c.div(10, 10.5);
			c.div(5.6, 10);

	}

}

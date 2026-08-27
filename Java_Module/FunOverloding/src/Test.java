class Calculator{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(double a, int b) {
		System.out.println( a+b);
	}
	void add(int b,double a) {
		System.out.println(a+b);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}
	//Substraction 
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void sub(int a) {
		System.out.println(a);
	}
	void sub(double a, int b) {
		System.out.println( a-b);
	}
	void sub(int b,double a) {
		System.out.println(a-b);
	}
	void sub(double a, double b) {
		System.out.println(a-b);
	}
	//Multiplication
	void mul(int a,int b) {
		System.out.println(a*b);
	}
	void mul(int a) {
		System.out.println(a);
	}
	void mul(double a, int b) {
		System.out.println( a*b);
	}
	void mul(int b,double a) {
		System.out.println(a*b);
	}
	void mul(double a, double b) {
		System.out.println(a*b);
	}
	//Division
	void div(int a,int b) {
		System.out.println(a/b);
	}
	void div(int a) {
		System.out.println(a);
	}
	void div(double a, int b) {
		System.out.println( a/b);
	}
	void div(int b,double a) {
		System.out.println(a/b);
	}
	void div(double a, double b) {
		System.out.println(a/b);
	}
}
class Test {

	public static void main(String[] args) {
		Calculator c1= new Calculator();
		c1.add(10,20);
		c1.sub(20,10.5);
		c1.mul(10,2);
		c1.div(10,2);
	}

}

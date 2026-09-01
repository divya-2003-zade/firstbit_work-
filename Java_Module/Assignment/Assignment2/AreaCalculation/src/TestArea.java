class Shape{
	double area;
	//Default constructor
	Shape() {
		this.area = 0.0;
	}
	//Parameterized Constructor
	Shape(double area) {
		super();
		this.area = area;
	}
	//Setter and Getter method
	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	//display method 
	void display(String ShapeName) {
		System.out.println("Area of "+ ShapeName  +" " +this.area);
		System.out.println();
	}
	
}
class Triangle{
	double base;
	double height;
	//Default constructor
	Triangle() {
		super();
		this.base = 0.0;
		this.height = 0.0;

	}
	//Parameterized Constructor
	Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	//Setter and Getter method
	double getBase() {
		return base;
	}
	void setBase(double base) {
		this.base = base;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
}
class Rectangle{
	double length;
	double breadth;
	//Default constructor
	Rectangle() {
		this.length = 0.0;
		this.breadth = 0.0;
	}
	//Parameterized Constructor
	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	//Setter and Getter method
	double getLength() {
		return length;
	}
	void setLength(double length) {
		this.length = length;
	}
	double getBreadth() {
		return breadth;
	}
	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}
class Circle{
	double radius;
	//Default constructor
	Circle() {
		this.radius = 0.0;
	}
	//Parameterized Constructor
	Circle(double radius) {
		super();
		this.radius = radius;
	}
	//Setter and Getter method
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
}
class Area{
	Shape s = new Shape();
	void calculateArea(Triangle t) {
		s.area = (t.base * t.height)/2;
		s.display("triangle");
		//System.out.println("Area of Triangle : " + s.area);
			}
	void calculateArea(Rectangle r) {
		s.area = r.length * r.breadth;
		s.display("recangle");
		//System.out.println("Area of rectangle : " + s.area);
		
	}
	void calculateArea(Circle c) {
		s.area = 3.14 * c.radius * c.radius;
		s.display("circle");
		//System.out.println("Area of circle : " + s.area);
		
	}
}
class TestArea {

	public static void main(String[] args) {
		Area a = new Area();
		
		Triangle t = new Triangle(4,5);
		Rectangle r = new Rectangle(5,6);
		Circle c = new Circle(3);
		
		a.calculateArea(t);
		a.calculateArea(r);
		a.calculateArea(c);

	}

}

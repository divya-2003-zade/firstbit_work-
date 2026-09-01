
class Shape {

    double area;

    // Getter
    double getArea() {
        return area;
    }

    // Setter
    void setArea(double area) {
        this.area = area;
    }

    // Default constructor
    Shape() {
        this.area = 0.0;
    }

    // Parameterized constructor
    Shape(double area) {
        this.area = area;
    }
     double calculateArea() {
    	 return area;
     }
    void display() {
        System.out.println("Area : " + this.area);
    }
}


// Circle is-a Shape
class Circle extends Shape {

    double radius;

    // Default constructor
    Circle() {
       // super();
        this.radius = 0.0;
    }

    // Parameterized constructor
    Circle(double radius) {
        //super(area);
        this.radius = radius;
    }

    // Getter
    double getRadius() {
        return radius;
    }

    // Setter
    void setRadius(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
   	 return 3.14*this.radius*this.radius;
    }
    void display() {
       // super.display();
        System.out.println("Radius : " + this.radius);
    }
}


// Triangle is-a Shape
class Triangle extends Shape {

    double base;
    double height;

    // Default constructor
    Triangle() {
        //super();
        this.base = 0.0;
        this.height = 0.0;
    }

    // Parameterized constructor
    Triangle( double base, double height) {
        //super(area);
        this.base = base;
        this.height = height;
    }

    // Getter
    double getBase() {
        return base;
    }

    // Setter
    void setBase(double base) {
        this.base = base;
    }

    // Getter
    double getHeight() {
        return height;
    }

    // Setter
    void setHeight(double height) {
        this.height = height;
    }
    double calculateArea() {
   	 return this.base*this.height*0.5;
    }
    void display() {
       // super.display();
        System.out.println("Base : " + this.base);
        System.out.println("Height : " + this.height);
    }
}


// Rectangle is-a Shape
class Rectangle extends Shape {

    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        //super();
        this.length = 0.0;
        this.breadth = 0.0;
    }

    // Parameterized constructor
    Rectangle(double length, double breadth) {
       // super(area);
        this.length = length;
        this.breadth = breadth;
    }

    // Getter
    double getLength() {
        return length;
    }

    // Setter
    void setLength(double length) {
        this.length = length;
    }

    // Getter
    double getBreadth() {
        return breadth;
    }

    // Setter
    void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    double calculateArea() {
   	 return this.length*this.breadth;
    }
    void display() {
        //super.display();
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}


// Main class
class TestShape {

    public static void main(String[] args) {

        System.out.println("Shape Details");
        Shape s = new Shape(100.0);
        //s.display();
        System.out.println("Shape Area : "+s.calculateArea());
        System.out.println();

        System.out.println("Circle Details");
        s = new Circle(5.0);
        s.display();
        System.out.println("Area of circle : "+s.calculateArea());
        System.out.println();

        System.out.println("Triangle Details");
        s = new Triangle(10.0, 10.0);
        s.display();
        System.out.println("Area of triangle : "+s.calculateArea());
        System.out.println();

        System.out.println("Rectangle Details");
        s = new Rectangle(20.0, 10.0);
        s.display();
        System.out.println("Area of rectangle : "+s.calculateArea());
        
    }
}


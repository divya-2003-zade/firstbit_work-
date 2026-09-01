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
        super();
        this.area = area;
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
        super();
        this.radius = 0.0;
    }

    // Parameterized constructor
    Circle(double area, double radius) {
        super(area);
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

    void display() {
        super.display();
        System.out.println("Radius : " + this.radius);
    }
}


// Triangle is-a Shape
class Triangle extends Shape {

    double base;
    double height;

    // Default constructor
    Triangle() {
        super();
        this.base = 0.0;
        this.height = 0.0;
    }

    // Parameterized constructor
    Triangle(double area, double base, double height) {
        super(area);
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

    void display() {
        super.display();
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
        super();
        this.length = 0.0;
        this.breadth = 0.0;
    }

    // Parameterized constructor
    Rectangle(double area, double length, double breadth) {
        super(area);
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

    void display() {
        super.display();
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}


// Main class
class TestShape {

    public static void main(String[] args) {

        System.out.println("Shape Details");
        Shape s = new Shape(100.0);
        s.display();

        System.out.println();

        System.out.println("Circle Details");
        Circle c = new Circle(78.5, 5.0);
        c.display();

        System.out.println();

        System.out.println("Triangle Details");
        Triangle t = new Triangle(50.0, 10.0, 10.0);
        t.display();

        System.out.println();

        System.out.println("Rectangle Details");
        Rectangle r = new Rectangle(200.0, 20.0, 10.0);
        r.display();
    }
}


class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    String category;

    // Default Constructor
    Product() {
        System.out.println("Default Constructor called");

        this.productId = 101;
        this.productName = "Laptop";
        this.price = 55000;
        this.quantity = 2;
        this.category = "Electronics";
    }

    // Parameterized Constructor
    Product(int id, String name, double p, int q, String c) {
        System.out.println("Parameterized Constructor called");

        this.productId = id;
        this.productName = name;
        this.price = p;
        this.quantity = q;
        this.category = c;
    }

    // Setter methods
    void setProductId(int id) {
        this.productId = id;
    }

    void setProductName(String name) {
        this.productName = name;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }

    void setCategory(String c) {
        this.category = c;
    }

    // Display method
    void display() {
        System.out.println("Product Id : " + this.productId);
        System.out.println("Product Name : " + this.productName);
        System.out.println("Price : " + this.price);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Category : " + this.category);
    }
}

class ProductDetails {
    public static void main(String args[]) {

        System.out.println("Product Details");

        Product p1, p2;   // reference

        // Default Constructor
        p1 = new Product();
        p1.display();

        // Parameterized Constructor
        p2 = new Product(102, "Mobile", 25000, 3, "Electronics");
        p2.display();
    }
}
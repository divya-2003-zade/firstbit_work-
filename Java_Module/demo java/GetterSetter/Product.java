class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    String category;

    // SET methods
    void setProductId(int p) {
        this.productId = p;
    }

    void setProductName(String n) {
        this.productName = n;
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

    // GET methods
    int getProductId() {
        return this.productId;
    }

    String getProductName() {
        return this.productName;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

    String getCategory() {
        return this.category;
    }

    // DISPLAY method using GET methods
    void display() {
        System.out.println("Product Id : " + getProductId());
        System.out.println("Product Name : " + getProductName());
        System.out.println("Price : " + getPrice());
        System.out.println("Quantity : " + getQuantity());
        System.out.println("Category : " + getCategory());
    }
}

class ProductDetails {
    public static void main(String args[]) {

        System.out.println("Product Details");

        Product p1, p2;

        p1 = new Product();
        p2 = new Product();

        // First product details using SET
        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setPrice(55000);
        p1.setQuantity(2);
        p1.setCategory("Electronics");

        // Second product details using SET
        p2.setProductId(102);
        p2.setProductName("Mobile");
        p2.setPrice(25000);
        p2.setQuantity(3);
        p2.setCategory("Electronics");

        // Display
        p1.display();
        p2.display();
    }
}
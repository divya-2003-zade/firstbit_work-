import java.util.Scanner;

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

	Scanner s=new Scanner(System.in);
	
	Product p1=new Product();
	System.out.println("Enter a Prodct Id: ");
	int i=s.nextInt();
	p1.setProductId(i);
	
	System.out.println("Enter a Product Name : ");
	s.nextLine();
	String n=s.nextLine();
	p1.setProductName(n); 
	
	System.out.println("Enter a Product Price :");
	double p=s.nextDouble();
	p1.setPrice(p);

	System.out.println("Enter a Product Quantity :");
	int q=s.nextInt();
	p1.setQuantity(q);

	System.out.println("Enter a Category :");
	s.nextLine();
	String c=s.nextLine();
	p1.setCategory(c);
	
	p1.display();



            }
}
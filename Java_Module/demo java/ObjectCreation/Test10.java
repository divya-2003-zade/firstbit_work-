class Product
{
    int productId;
    String productName;
    double price;
    int quantity;
    String category;
}

class ProductDetails{
    public static void main(String args[])
    {
        System.out.println("Product Details");

        Product p1,p2;   // reference

        p1=new Product();
        p2=new Product();

        // first product details
        p1.productId=101;
        p1.productName="Laptop";
        p1.price=55000;
        p1.quantity=2;
        p1.category="Electronics";

        // second product details
        p2.productId=102;
        p2.productName="Mobile";
        p2.price=25000;
        p2.quantity=3;
        p2.category="Electronics";

        // first product details print
        System.out.println("Product Id : "+p1.productId);
        System.out.println("Product Name : "+p1.productName);
        System.out.println("Price : "+p1.price);
        System.out.println("Quantity : "+p1.quantity);
        System.out.println("Category : "+p1.category);

        // second product details print
        System.out.println("Product Id : "+p2.productId);
        System.out.println("Product Name : "+p2.productName);
        System.out.println("Price : "+p2.price);
        System.out.println("Quantity : "+p2.quantity);
        System.out.println("Category : "+p2.category);

        System.out.println(p1);
    }
}
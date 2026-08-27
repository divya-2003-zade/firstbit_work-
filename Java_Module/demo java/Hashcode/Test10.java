class Product
{
     int productId;
     String productName;
     double price;
     int quantity;
     String category;
}class ProductDetails{
	public static void main(String args[])
	{
	System.out.println("Product Details");
	Product p1;//reference
	p1=new Product();
	System.out.println(p1);
	}
}
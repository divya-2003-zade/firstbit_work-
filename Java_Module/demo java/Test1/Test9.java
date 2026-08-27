class Book
{
     int bookId;
     String bookName;
    String authorName;
     double price;
     String publication;
}
class BookDetails{
	public static void main(String args[])
	{
	System.out.println("Book Details");
	Book b1;//reference
	b1=new Book();
	System.out.println(b1);
	}
}
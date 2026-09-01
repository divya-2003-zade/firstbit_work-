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

        Book b1,b2;   // reference

        b1=new Book();
        b2=new Book();

        // first book details
        b1.bookId=101;
        b1.bookName="Java Programming";
        b1.authorName="James Gosling";
        b1.price=500;
        b1.publication="Pearson";

        // second book details
        b2.bookId=102;
        b2.bookName="C Programming";
        b2.authorName="Dennis Ritchie";
        b2.price=450;
        b2.publication="McGraw Hill";

        // first book details print
        System.out.println("Book Id : "+b1.bookId);
        System.out.println("Book Name : "+b1.bookName);
        System.out.println("Author Name : "+b1.authorName);
        System.out.println("Price : "+b1.price);
        System.out.println("Publication : "+b1.publication);

        // second book details print
        System.out.println("Book Id : "+b2.bookId);
        System.out.println("Book Name : "+b2.bookName);
        System.out.println("Author Name : "+b2.authorName);
        System.out.println("Price : "+b2.price);
        System.out.println("Publication : "+b2.publication);

        System.out.println(b1);
    }
}
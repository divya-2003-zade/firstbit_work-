import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String authorName;
    double price;
    String publication;

    // SET methods
    void setBookId(int b) {
        this.bookId = b;
    }

    void setBookName(String n) {
        this.bookName = n;
    }

    void setAuthorName(String a) {
        this.authorName = a;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setPublication(String pub) {
        this.publication = pub;
    }

    // GET methods
    int getBookId() {
        return this.bookId;
    }

    String getBookName() {
        return this.bookName;
    }

    String getAuthorName() {
        return this.authorName;
    }

    double getPrice() {
        return this.price;
    }

    String getPublication() {
        return this.publication;
    }

    // DISPLAY method using GET methods
    void display() {
        System.out.println("Book Id : " + this.bookId);
        System.out.println("Book Name : " + this.bookName);
        System.out.println("Author Name : " + this.authorName);
        System.out.println("Price : " + this.price);
        System.out.println("Publication : " + this.publication);
    }
}

class BookDetails {
    public static void main(String args[]) {

        System.out.println("Book Details");

       Scanner s= new Scanner(System.in);
	
	Book b1=new Book();

	System.out.println("Enter Book FRN : ");
	int b=s.nextInt();
	b1.setBookId(b);
	
	System.out.println("Enter Book Name :");
	s.nextLine();
	String n=s.nextLine();
	b1.setBookName(n);

	System.out.println("Enter Author Name :");
	//s.nextLine();
	String a=s.nextLine();
	b1.setAuthorName(a);

	
	System.out.println("Enter Book Price:");
	double p=s.nextDouble();
	b1.setPrice(p);
	
	System.out.println("Enter Publication :");
	s.nextLine();
	String pub=s.nextLine();
	b1.setPublication(pub);

	b1.display();


    }
}
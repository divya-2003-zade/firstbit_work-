class Book {
    int bookId;
    String bookName;
    String authorName;
    double price;
    String publication;

    // Default Constructor
    Book() {
        System.out.println("Default Constructor called");

        this.bookId = 101;
        this.bookName = "Java Programming";
        this.authorName = "James Gosling";
        this.price = 500;
        this.publication = "Pearson";
    }

    // Parameterized Constructor
    Book(int id, String name, String author, double p, String pub) {
        System.out.println("Parameterized Constructor called");

        this.bookId = id;
        this.bookName = name;
        this.authorName = author;
        this.price = p;
        this.publication = pub;
    }

    // Setter methods
    void setBookId(int id) {
        this.bookId = id;
    }

    void setBookName(String name) {
        this.bookName = name;
    }

    void setAuthorName(String author) {
        this.authorName = author;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setPublication(String pub) {
        this.publication = pub;
    }

    // Display method
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

        Book b1, b2;   // reference

        // Default Constructor
        b1 = new Book();
        b1.display();

        // Parameterized Constructor
        b2 = new Book(102, "C Programming", "Dennis Ritchie",
                      450, "McGraw Hill");
        b2.display();
    }
}
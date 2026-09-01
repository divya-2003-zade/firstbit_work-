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
        System.out.println("Book Id : " + getBookId());
        System.out.println("Book Name : " + getBookName());
        System.out.println("Author Name : " + getAuthorName());
        System.out.println("Price : " + getPrice());
        System.out.println("Publication : " + getPublication());
    }
}

class BookDetails {
    public static void main(String args[]) {

        System.out.println("Book Details");

        Book b1, b2;

        b1 = new Book();
        b2 = new Book();

        // First book details using SET
        b1.setBookId(101);
        b1.setBookName("Java Programming");
        b1.setAuthorName("James Gosling");
        b1.setPrice(500);
        b1.setPublication("Pearson");

        // Second book details using SET
        b2.setBookId(102);
        b2.setBookName("C Programming");
        b2.setAuthorName("Dennis Ritchie");
        b2.setPrice(450);
        b2.setPublication("McGraw Hill");

        // Display
        b1.display();
        b2.display();
    }
}
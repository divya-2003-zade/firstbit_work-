#include <stdio.h>

typedef struct Book
{
    int id;
    char bname[30];
    char author[30];
    float price;
} Book;

// Function Declarations
void storeBooks(Book[], int);
void displayBooks(Book[], int);

int main()
{
    Book books[100];
    int n;

    printf("How many books do you want to add? ");
    scanf("%d", &n);

    storeBooks(books, n);
    displayBooks(books, n);

    return 0;
}

// Function to store book details
void storeBooks(Book books[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("\nEnter Details of Book %d\n", i + 1);

        printf("\nEnter Book ID: ");
        scanf("%d", &books[i].id);
         getchar();
        printf("\nEnter Book Name: ");
        fgets(books[i].bname, sizeof(books[i].bname), stdin);

        printf("\nEnter Author Name: ");
        fgets(books[i].author, sizeof(books[i].author), stdin);

        printf("\nEnter Book Price: ");
        scanf("%f", &books[i].price);
    }
}

// Function to display book details
void displayBooks(Book books[], int n)
{
    printf("\n========== BOOK DETAILS ==========\n");

    for (int i = 0; i < n; i++)
    {
        printf("\nBook %d\n", i + 1);
        printf("Book ID    : %d\n", books[i].id);
        printf("Book Name  : %s\n", books[i].bname);
        printf("Author     : %s\n", books[i].author);
        printf("Book Price : %.2f\n", books[i].price);
    }
}
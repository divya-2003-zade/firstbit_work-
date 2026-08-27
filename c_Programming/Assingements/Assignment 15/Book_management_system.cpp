#include <stdio.h>
#include <string.h>

typedef struct Book
{
    int id;
    char bname[30];
    char author[30];
    float price;
} Book;

void addBooks(Book[], int *);
void displayBooks(Book[], int);

int main()
{
    Book books[100];
    int currentSize = 0;
    int choice;
    
    printf("\n===== BOOK MANAGEMENT SYSTEM =====");

    do
    {
        
        printf("\n1. Add Books");
        printf("\n2. Display Books");
        printf("\n3. Exit");
        printf("\nEnter Your Choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                addBooks(books, &currentSize);
                break;

            case 2:
                displayBooks(books, currentSize);
                break;

            case 3:
                printf("Thank You!\n");
                break;

            default:
                printf("Invalid Choice!\n");
        }

    } while(choice != 3);

    return 0;
}

// Add Book Details
void addBooks(Book *books, int *currentSize)
{
    int n;

    printf("How many books do you want to add? ");
    scanf("%d", &n);

    for(int i = 0; i < n; i++)
    {
        printf("\nEnter Details of Book %d\n", *currentSize + 1);

        printf("Enter Book ID: ");
        scanf("%d", &books[*currentSize].id);

        printf("Enter Book Name: ");
        scanf("%s", books[*currentSize].bname);

        printf("Enter Author Name: ");
        scanf("%s", books[*currentSize].author);

        printf("Enter Book Price: ");
        scanf("%f", &books[*currentSize].price);

        (*currentSize)++;
    }

    printf("\nBooks Added Successfully!\n");
}

// Display Book Details
void displayBooks(Book books[], int currentSize)
{
    if(currentSize == 0)
    {
        printf("\nNo Books Available!\n");
        return;
    }

    printf("\n========== BOOK DETAILS ==========\n");

    for(int i = 0; i < currentSize; i++)
    {
        printf("\nBook %d", i + 1);
        printf("\nBook ID    : %d", books[i].id);
        printf("\nBook Name  : %s", books[i].bname);
        printf("\nAuthor     : %s", books[i].author);
        printf("\nBook Price : %.2f\n", books[i].price);
    }
}
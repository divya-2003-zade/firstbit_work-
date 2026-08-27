#include <stdio.h>
#include <string.h>

typedef struct Product
{
    char name[30];
    float price;
    int quantity;
} Product;

// Function to accept product details
void addProduct(Product *p)
{
    printf("\nEnter Product Name: ");
    scanf(" %[^\n]", p->name);

    printf("Enter Price: ");
    scanf("%f", &p->price);

    printf("Enter Quantity: ");
    scanf("%d", &p->quantity);
}

// Function to display product details
void displayProduct(Product *p)
{
    printf("\nProduct Name : %s", p->name);
    printf("\nPrice        : %.2f", p->price);
    printf("\nQuantity     : %d\n", p->quantity);
}

// Function to calculate total cost
float calculateTotal(Product *p, int n)
{
    int i;
    float total = 0;

    for(i = 0; i < n; i++)
    {
        total = total + (p[i].price * p[i].quantity);
    }

    return total;
}

int main()
{
    Product cart[10];
    int n;
    int i;
    float total;

    printf("Enter number of products: ");
    scanf("%d", &n);

    // Add products to cart
    for(i = 0; i < n; i++)
    {
        printf("\n--------- Product %d ---------\n", i + 1);
        addProduct(&cart[i]);
    }

    // Display cart
    printf("\n\n========= SHOPPING CART =========\n");

    for(i = 0; i < n; i++)
    {
        printf("\nProduct %d", i + 1);
        displayProduct(&cart[i]);
    }

    // Calculate total
    total = calculateTotal(cart, n);

    printf("\n\n===============================\n");
    printf("Total Cost : %.2f\n", total);
    printf("===============================\n");

    return 0;
}
#include<stdio.h>

struct Product
{
    int id;
    char name[20];
    int quantity;
    double price;
};

void main()
{
    struct Product p1;
    double total;

    printf("Enter Product Id, Name, Quantity and Price: ");
    scanf("%d %s %d %lf", &p1.id, p1.name, &p1.quantity, &p1.price);

    total = p1.quantity * p1.price;

    printf("\nProduct Id : %d", p1.id);
    printf("\nProduct Name : %s", p1.name);
    printf("\nQuantity : %d", p1.quantity);
    printf("\nPrice : %.2lf", p1.price);
    printf("\nTotal Cost : %.2lf", total);
}
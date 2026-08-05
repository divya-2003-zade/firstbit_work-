#include<stdio.h>

typedef struct Product
{
    int id;
    char name[20];
    int quantity;
    double price;
}Product;
Product storeproduct(Product);
void display(Product );
void main()
{
    struct Product p1,p2;
    p1=storeproduct(p1);
    display(p1);

     p2=storeproduct(p2);
     display(p2);
   
    
}
Product storeproduct(Product p)
{
	 printf("\nEnter Product Id, Name, Quantity and Price: ");
    scanf("%d %s %d %lf", &p.id, p.name, &p.quantity, &p.price);
     return p;
}
void display(Product p)
{
	double total;
	total = p.quantity * p.price;

    printf("\nProduct Id : %d", p.id);
    printf("\nProduct Name : %s", p.name);
    printf("\nQuantity : %d", p.quantity);
    printf("\nPrice : %.2lf", p.price);
    printf("\nTotal Cost : %.2lf", total);
}
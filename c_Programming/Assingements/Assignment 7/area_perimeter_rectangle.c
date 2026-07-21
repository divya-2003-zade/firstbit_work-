#include<stdio.h>
void find_area_perimeter(int*,int*);
void main()
{
	int l,b;
	printf("Enter a lenght and breadth : ");
	scanf("%d%d",&l,&b);
	find_area_perimeter(&l,&b);	
}
void find_area_perimeter(int*l,int*b)
{
	int R = (*l)*(*b);
	int P = 2*(*l)+2*(*b);
	printf("Area of a Recangle is %d \n",R);
	printf("Perimeter of a Rectangle is %d",P);
	 
}
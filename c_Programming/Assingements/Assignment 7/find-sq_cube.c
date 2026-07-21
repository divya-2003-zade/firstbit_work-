#include<stdio.h>
void find_sq_cube(int*);
void main()
{
	
	int num;
	printf(" Enter a number : ");
	scanf("%d",&num);
	find_sq_cube(&num);
	
}
void find_sq_cube(int*num)
{

		int sq=(*num)*(*num);
		int cu=(*num)*(*num)*(*num);
	printf("Square of %d is %d \n",*num,sq);
	printf("Cube of %d is %d",*num,cu);
}
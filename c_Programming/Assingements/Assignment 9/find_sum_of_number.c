#include<stdio.h>
void input(int *arr,int size);
void display(int*arr,int size);
void findsumofno(int*arr,int size);
void main()
{
	int arr[10];
	input(arr,10);
	display(arr,10);
	findsumofno(arr,10);
}
void input(int *arr,int size)
{
    	printf("Enter 10 elements:\n");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);
    }
}
void display(int*arr,int size)
{
    	printf("Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
}
void findsumofno(int*arr,int size)
{
    	int sum=0;
    for(int i=0; i<10; i++)
    {
    	sum=sum+arr[i];
	}
	printf("sum= %d ",sum);
}

    
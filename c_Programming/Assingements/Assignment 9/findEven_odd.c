#include<stdio.h>
void input(int*arr,int size);
void display(int*arr,int size);
void findEven_Odd(int*arr,int size);
void main()
{
	int arr[10];
	input(arr,10);       
	display(arr,10);
	findEven_Odd(arr,10);
}
	
void input(int*arr,int size)
{
    	printf("Enter 10 elements:\n");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
}
void display(int*arr,int size)
{
	printf("\nArray = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",arr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n");
}
void findEven_Odd(int*arr,int size)
{
	printf("\neven number :  [ ");
    for(int i=0; i<10; i++)
    {
    	if(arr[i]%2==0)               //even number  code
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    printf("\nodd number :  [ ");             
    for(int i=0; i<10; i++)
    {
    	if(arr[i]%2 !=0)               //odd  number code 
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
}   
    
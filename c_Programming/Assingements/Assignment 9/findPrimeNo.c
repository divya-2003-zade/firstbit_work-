#include<stdio.h>
void input(int *arr,int size);
void display(int*arr,int size);
void findPrimeNo(int*arr,int size);
void main()
{
	int arr[10];
	input(arr,10);
	display(arr,10);
	findPrimeNo(arr,10);
}	
void input(int *arr,int size)
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
void findPrimeNo(int*arr,int size)
{
	printf("\nPrime number = [ ");
    for(int i=0; i<10; i++)
    {
    	int flag=0;
        for(int j=2; j<arr[i]; j++)
    	{
    		if(arr[i]%j==0)
    	{
    		flag=1;                      //not prime number
    		break;
		}
		}
		if(flag==0)
		{
			printf("%d ,",arr[i]);           //prime number
		}
		
	}
	printf("\b]\n");
}

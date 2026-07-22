#include<stdio.h>
void main()
{
	int arr[10];

    printf("Enter 10 elements:\n");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",arr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n");
    printf("even number :  [ ");
    for(int i=0; i<10; i++)
    {
    	if(arr[i]%2==0)               //even number  code
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    printf("odd number :  [ ");             
    for(int i=0; i<10; i++)
    {
    	if(arr[i]%2 !=0)               //odd  number code 
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    
}
#include<stdio.h>
void main()
{
	int arr[10];

    printf("Enter 10 elements:");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",arr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    
    printf("Reserving the array :\n");
    int brr[10];
    for(int i=0; i<10; i++)
    {
    	brr[i]=arr[10-1-i];              //Reservising array
	}
	printf("Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",brr[i]);  ///printing the reversing array like array=[3,2,1....]
    }
    printf("\b]\n");
}
#include<stdio.h>
void main()
{
	int arr[10];
      printf("Enter 10 elements:\n");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    
    printf(" Alternate Array = [ ");
    for(int i=0; i<10; i+=2)
    {
        printf("%d ,",arr[i]);  ///printing the alternate array like array=[1,3,5....]
    }
    printf("\b]\n");
}
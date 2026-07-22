#include<stdio.h>
void main()
{
	int arr[5];

    printf("1.Enter 5 elements:");
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("Array 1 = [ ");
    for(int i=0; i<5; i++)
    {
		 printf("%d ,",arr[i]); ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    
    int brr[5];
    printf("2.Enter 5 elements:\n");
    for(int i=0; i<5; i++)
    {           
        scanf("%d",&brr[i]);       // print the value given from the user 
    }
     printf("Array 2 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ,",brr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    
    int crr[10];
    
    for(int i=0; i<5; i++)
    {
    	crr[i]=arr[i];
	}
	for(int i=0; i<5; i++)
	{
		crr[i+5]=brr[i];
	}
	printf("Merge Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",crr[i]);  ///printing the merge array like array=[1,2,3....]
    }
    printf("\b]\n");
	
}
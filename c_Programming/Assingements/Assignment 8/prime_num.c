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
    printf("Prime number = [ ");
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
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int *arr;
    int size=10;
    arr=(int*)malloc(size*sizeof(int));
    if(arr==NULL)
    {
    	printf("memory allocation failed");
    	return;
	}

    printf("Enter 10 elements:\n");
    for(int i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("Array = [ ");
    for(int i=0; i<size; i++)
    {
        printf("%d ,",arr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n");
    printf("Prime number = [ ");
    for(int i=0; i<size; i++)
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
	free(arr);
}
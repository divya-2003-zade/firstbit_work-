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

    printf("Enter 10 elements:");
    for(int i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("Array = [ ");
    for(int i=0; i<size; i++)
    {
        printf("%d ,",arr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    
    printf("Reserving the array :\n");
    int *brr = (int*)malloc(size * sizeof(int));
    if(brr==NULL)
    {
    	printf("memory allocation failed");
    	return;
	}

    for(int i=0; i<size; i++)
    {
    	brr[i]=arr[size-1-i];              //Reservising array
	}
	printf("Array = [ ");
    for(int i=0; i<size; i++)
    {
        printf("%d ,",brr[i]);  ///printing the reversing array like array=[3,2,1....]
    }
    printf("\b]\n");
    free(arr);
    free(brr);
}
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
    printf("even number :  [ ");
    for(int i=0; i<size; i++)
    {
    	if(arr[i]%2==0)               //even number  code
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    printf("odd number :  [ ");             
    for(int i=0; i<size; i++)
    {
    	if(arr[i]%2 !=0)               //odd  number code 
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    free(arr);
    
}
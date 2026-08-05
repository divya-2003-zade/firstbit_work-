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
        scanf("%d",&arr[i]);
    }
    printf("Array = [ ");
    for(int i=0; i<size; i++)
    {
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    int sum=0;
    for(int i=0; i<size; i++)
    {
    	sum=sum+arr[i];
	}
	printf("sum= %d ",sum);
	free(arr);
}
    
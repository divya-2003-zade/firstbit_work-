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
    
    printf(" Alternate Array = [ ");
    for(int i=0; i<size; i+=2)
    {
        printf("%d ,",arr[i]);  ///printing the alternate array like array=[1,3,5....]
    }
    printf("\b]\n");
    free(arr);
}
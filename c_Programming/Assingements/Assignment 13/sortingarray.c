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
     int temp;
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
    for(int i=0; i<size; i++)
    {
    	for(int j=i+1; j<size; j++)
    	{
    		if(arr[i]>arr[j])
    		{
    		temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
			}
    		
		} 
	}
	printf("sorting an array :  [ ");             
    for(int i=0; i<size; i++)
    {               
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
    free(arr);
	
}
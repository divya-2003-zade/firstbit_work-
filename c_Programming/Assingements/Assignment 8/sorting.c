#include<stdio.h>
void main()
{
	int arr[10];
     int temp;
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
    for(int i=0; i<10; i++)
    {
    	for(int j=i+1; j<10; j++)
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
    for(int i=0; i<10; i++)
    {               
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
	
}
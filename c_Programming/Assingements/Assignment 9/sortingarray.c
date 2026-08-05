#include<stdio.h>
void input(int*arr,int size);
void display(int*arr,int size);
void sortingArray(int*arr,int temp,int size);
void main()
{
	int arr[10];
	int temp;
     input(arr,10);
     display(arr,10);
     sortingArray(arr,temp,10);
}
void input(int*arr,int size)
{
	printf("Enter 10 elements:\n");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
}
void display(int*arr,int size)
{
	printf("\nArray = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",arr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n");
}
void sortingArray(int*arr,int temp,int size)
{
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
	printf("\nsorting an array :  [ ");             
    for(int i=0; i<10; i++)
    {               
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
}

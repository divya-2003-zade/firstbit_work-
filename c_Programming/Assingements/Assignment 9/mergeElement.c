#include<stdio.h>
void input(int *arr,int *brr,int size);
void display(int *arr,int *brr,int size);
void MergeElement(int *arr,int*brr,int size);
void main()
{
	int arr[5];
	int brr[5];
	input(arr,brr,5);
	display(arr,brr,5);
	MergeElement(arr,brr,5);
}
void input(int *arr,int *brr,int size)
{
	printf("1.Enter 5 elements:");
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("2.Enter 5 elements:\n");
    for(int i=0; i<5; i++)
    {           
        scanf("%d",&brr[i]);       // print the value given from the user 
    }
}
void display(int*arr,int*brr,int size)
{
	printf("\nArray 1 = [ ");
    for(int i=0; i<5; i++)
    {
		 printf("%d ,",arr[i]); ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    printf("\nArray 2 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ,",brr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
}
void MergeElement(int*arr,int*brr,int size)
{
	int crr[10];
    
    for(int i=0; i<5; i++)
    {
    	crr[i]=arr[i];
	}
	for(int i=0; i<5; i++)
	{
		crr[i+5]=brr[i];
	}
	printf("\nMerge Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",crr[i]);  ///printing the merge array like array=[1,2,3....]
    }
    printf("\b]\n");
}
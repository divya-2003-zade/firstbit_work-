#include<stdio.h>
void input(int *arr,int size);
void display(int *arr,int size);
void searchElement(int *arr,int size);
void main()
{
	int arr[10];
	input(arr,10);
	display(arr,10);	
	searchElement(arr,10);
}
void input(int *arr,int size)
{
    	printf("Enter 10 elements:\n");
    for(int i=0; i<10; i++)
     {
        scanf("%d",&arr[i]);
     }
}
void display(int *arr,int size)	
{
    	printf("Array = [ ");
    for(int i=0; i<10; i++)
     {
        printf("%d ,",arr[i]); 
     }
     printf("\b]\n");
}
void searchElement(int *arr,int size)	
{
		int ele;
	int flag=-1;
	printf("Enter a element :");
	scanf("%d",&ele);
	
	for(int i=0; i<10; i++)
	{
		if(arr[i]==ele)
		{
			flag=i;
			break;
		}
	}
	if(flag !=-1)
	printf("found");
	else 
	printf("not found");
}

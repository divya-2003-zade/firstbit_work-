#include<stdio.h>
void displayArray(int*,int*);
void addElement(int*,int*, int);
void main()
{
	int arr[5];
	int ele=10; 
	int ci=0;
	while(1)
	{
		printf("\nEnter 1 to add element \nEnter 2 to dispaly \nEnter 3 to exit ");
		int choice;
		scanf("%d",&choice);
		if(choice==1)
		{
			int ele;
			printf("Enter a element :");
			scanf("%d",&ele);
			addElement(arr,&ci,ele);
		}
		 else if(choice==2)
		   displayArray(arr,ci);
	   	 else if(choice==3)
		  break;
		 else
		  printf("INVALID CHOICE\n");
	}
	
	
}
void displayArray(int*arr, int*ci)
{
	//printf("In display\n");
	printf("\n[");
	for(int i=0; i<ci; i++)
	printf("%d ",arr[i]);
	printf("]");
}
void addElement(int *arr,int *ci, int ele)
{
	arr[*ci]=ele;
	(*ci)++;
	printf("Element added \n");
}
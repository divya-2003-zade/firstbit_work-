#include<stdio.h>
void displayArray(int*,int*);
void addElememt(int*,int*, int);
void main()
{
	int arr[5];
	int ele=10; int ci=0;
	addElement(arr,&ci,ele);
	displayArray(arr,ci);
}
void displayArray(int*arr, int*ci)
{
	printf("In display\n");
	for(int i=0; i<ci; i++)
	printf("%d",arr[i]);
}
void addElement(int *arr,int *ci, int ele)
{
	arr[*ci]=ele;
	(*ci)++;
	printf("Element added \n");
}
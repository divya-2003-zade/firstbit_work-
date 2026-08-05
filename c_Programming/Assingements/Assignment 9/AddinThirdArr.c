#include<stdio.h>
void input(int*arr1,int *arr2,int size);
void display(int*arr1,int *arr2,int size);
void AddinThirdArr(int*arr1,int *arr2,int size);
void main()
{
	int arr1[5];
	int arr2[5];
	input(arr1,arr2,5);
	display(arr1,arr2,5);
	AddinThirdArr(arr1,arr2,5);
}
void input(int*arr1,int *arr2,int size)
{
	printf("Enter 5 elements:");
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr1[i]);       // print the value given from the user 
    }

    printf("\nEnter 5 elements:");
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr2[i]);       // print the value given from the user 
    }
}
void display(int*arr1,int*arr2,int size)
{
	printf("Array1 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ,",arr1[i]);  ///printing the array like array1=[1,2,3....]
    }
    printf("\b]\n\n");
    printf("Array2 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ,",arr2[i]);  ///printing the array like array2=[1,2,3....]
    }
    printf("\b]\n\n");
}
void AddinThirdArr(int *arr1, int *arr2, int size)
{
    int arr3[5];
    for(int i=0; i<5; i++)
    {
        arr3[i] = arr1[i] + arr2[i];    //two array add in third array
    }
    printf("\naddition of two array in third array is :\n");
    printf("\nArray3 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ",arr3[i]);            //printing of third arry
    }
    printf("]");
}

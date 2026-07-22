#include<stdio.h>
void main()
{
	int arr1[5];
	int i;

    printf("Enter 5 elements:");
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr1[i]);       // print the value given from the user 
    }
    printf("Array1 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ,",arr1[i]);  ///printing the array like array1=[1,2,3....]
    }
    printf("\b]\n\n\n");
    int arr2[5];

    printf("Enter 5 elements:");
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr2[i]);       // print the value given from the user 
    }
    printf("Array2 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ,",arr2[i]);  ///printing the array like array2=[1,2,3....]
    }
    printf("\b]\n\n\n");
    int arr3[5];
    for(int i=0; i<5; i++)
    {
        arr3[i] = arr1[i] + arr2[i];    //two array add in third array
    }
    printf("addition of two array in third array is :\n");
    printf("Array3 = [ ");
    for(int i=0; i<5; i++)
    {
        printf("%d ",arr3[i]);            //printing of third arry
    }
    printf("]");
}
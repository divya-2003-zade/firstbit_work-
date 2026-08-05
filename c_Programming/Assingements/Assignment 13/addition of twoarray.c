#include<stdio.h>
#include<stdlib.h>
void main()
   {
		int *arr1;
	    int size=5;
	    arr1=(int*)malloc(size*sizeof(int));
	    if(arr1==NULL)
	    {
	    	printf("memory allocation failed");
	    	return;
		}
	
	    printf("Enter 5 elements:");
	    for(int i=0; i<size; i++)
	    {
	        scanf("%d",&arr1[i]);       // print the value given from the user 
	    }
	    printf("Array1 = [ ");
	    for(int i=0; i<size; i++)
	    {
	        printf("%d ,",arr1[i]);  ///printing the array like array1=[1,2,3....]
	    }
	    printf("\b]\n\n\n");
	    int *arr2;
	    arr2=(int*)malloc(size*sizeof(int));
	    if(arr2==NULL)
	    {
	    	printf("memory allocation failed");
	    	return;
		}
	
	
	    printf("Enter 5 elements:");
	    for(int i=0; i<size; i++)
	    {
	        scanf("%d",&arr2[i]);       // print the value given from the user 
	    }
	    printf("Array2 = [ ");
	    for(int i=0; i<size; i++)
	    {
	        printf("%d ,",arr2[i]);  ///printing the array like array2=[1,2,3....]
	    }
	    printf("\b]\n\n\n");
	    int *arr3;
	    arr3=(int*)malloc(size*sizeof(int));
	    if(arr3==NULL)
	    {
	    	printf("memory allocation failed");
	    	return;
		}
	
	    for(int i=0; i<size; i++)
	    {
	        arr3[i] = arr1[i] + arr2[i];    //two array add in third array
	    }
	    printf("addition of two array in third array is :\n");
	    printf("Array3 = [ ");
	    for(int i=0; i<size; i++)
	    {
	        printf("%d ",arr3[i]);            //printing of third arry
	    }
	    printf("]");
	    free(arr1);
	    free(arr2);
	    free(arr3);
	}
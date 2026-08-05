#include<stdio.h>
#include<stdlib.h>
void main()
{
	int *arr;
    int size=5;
    arr=(int*)malloc(size*sizeof(int));
    if(arr==NULL)
    {
    	printf("memory allocation failed");
    	return;
	}

    printf("1.Enter 5 elements:");
    for(int i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);       // print the value given from the user 
    }
    printf("Array 1 = [ ");
    for(int i=0; i<size; i++)
    {
		 printf("%d ,",arr[i]); ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    
    int *brr = (int*)malloc(size * sizeof(int));
    if(brr==NULL)
    {
    	printf("memory allocation failed");
    	return;
	}
    printf("2.Enter 5 elements:\n");
    for(int i=0; i<size; i++)
    {           
        scanf("%d",&brr[i]);       // print the value given from the user 
    }
     printf("Array 2 = [ ");
    for(int i=0; i<size; i++)
    {
        printf("%d ,",brr[i]);  ///printing the array like array=[1,2,3....]
    }
    printf("\b]\n\n");
    
    int *crr = (int*)malloc(2 * size * sizeof(int));
    if(crr==NULL)
    {
    	printf("memory allocation failed");
    	return;
	}
    for(int i=0; i<size; i++)
    {
    	crr[i]=arr[i];
	}
	for(int i=0; i<size; i++)
	{
		crr[i+size]=brr[i];
	}
	printf("Merge Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",crr[i]);  ///printing the merge array like array=[1,2,3....]
    }
    printf("\b]\n");
    free(arr);
    free(brr);
    free(crr);
	
}
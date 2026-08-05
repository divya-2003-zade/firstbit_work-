#include<stdio.h>
#include<stdlib.h>
void main()
{
    int *arr;
    int size=10;
    arr=(int*)malloc(size*sizeof(int));
    if(arr==NULL)
    {
    	printf("memory allocation failed");
    	return;
	}

    printf("Enter 10 numbers:\n");

    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Array = [ ");
    for(int i=0; i<10; i++)
    {
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");

    int max = arr[0];
    int min = arr[0];

    for(int i=1; i<10; i++)
    {
        if(arr[i] > max)
            max = arr[i];

        if(arr[i] < min)
            min = arr[i];
    }

    printf("The maximum number in the array is %d\n", max);
    printf("The minimum number in the array is %d\n", min);
    free(arr);
}
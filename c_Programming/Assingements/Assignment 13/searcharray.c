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

    printf("Enter 10 elements:\n");
    for(int i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Array = [ ");
    for(int i=0; i<size; i++)
    {
        printf("%d ,",arr[i]); 
    }
    printf("\b]\n");
	int ele;
	int flag=-1;
	printf("Enter a element :");
	scanf("%d",&ele);
	
	for(int i=0; i<size; i++)
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
	free(arr);
}
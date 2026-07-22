#include<stdio.h>
void main()
{
	int arr[10];

    printf("Enter 10 elements:\n");
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
    int sum=0;
    for(int i=0; i<10; i++)
    {
    	sum=sum+arr[i];
	}
	printf("sum= %d ",sum);
}
    
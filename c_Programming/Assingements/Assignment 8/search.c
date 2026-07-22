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
#include<stdio.h>

void input(int *arr, int size);
void display(int *arr, int size);            //fuction declaration
void findMaxMin(int *arr, int size);

int main()
{
    int arr[10];                       //function call

    input(arr, 10);
    display(arr, 10);
    findMaxMin(arr, 10);

    return 0;
}

void input(int *arr, int size)              //input
{
    printf("Enter 10 numbers:\n");

    for(int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
}

void display(int *arr, int size)          //display
{
    printf("Array = [ ");

    for(int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);

        //if(i != size - 1)
            //printf(", ");
    }

    printf("]\n");
}

void findMaxMin(int *arr, int size)           //function defination
{
    int max = arr[0];
    int min = arr[0];

    for(int i = 1; i < size; i++)
    {
        if(arr[i] > max)
            max = arr[i];

        if(arr[i] < min)
            min = arr[i];
    }

    printf("The maximum number in the array is %d\n", max);
    printf("The minimum number in the array is %d\n", min);
}
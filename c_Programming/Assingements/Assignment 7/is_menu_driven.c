#include<stdio.h>
void is_menu_driven(int*,int*);
void main()
{
	int no,choice;
	printf("enter a number :");
	scanf("%d",&no);
	printf("\nMenu");
    printf("\n1. Check Even or Odd");
    printf("\n2. Check Prime or Not");
    printf("\n3. Check Palindrome or Not");
    printf("\n4. Check Positive, Negative or Zero");
    printf("\n5. Reverse a Number");
    printf("\n6. Sum of Digits");

    printf("\n\nEnter your choice: ");
    scanf("%d", &choice);
    is_menu_driven(&no,&choice);
}
void is_menu_driven(int*no,int*choice)
{
	if (*choice==1)
    {
         if(*no % 2 == 0)
           printf("%d is Even.", *no);
            else
			{
				printf("%d is Odd.", *no);
			}
            
    }
    else if(*choice == 2)
    {
        
           int flag = 1, i;

            for(i = 2; i < *no; i++)
            {
                if(*no % i == 0)
                {
                    flag = 0;
                    break;
                }
            }

            if(flag == 1)
                printf("%d is Prime.", *no);
            else
                printf("%d is Not Prime.", *no);
        
    }
    else if(*choice == 3)
    {
        int temp = *no;
        int rev = 0;

        while(temp != 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if(rev == *no)
            printf("%d is Palindrome.", *no);
        else
            printf("%d is Not Palindrome.", *no);
    }
    else if(*choice == 4)
    {
        if(*no > 0)
            printf("%d is Positive.", *no);
        else if(*no < 0)
            printf("%d is Negative.", *no);
        else
            printf("Number is Zero.");
    }
    else if(*choice == 5)
    {
        int temp = *no;
        int rev = 0;

        while(temp != 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        printf("Reverse = %d", rev);
    }
    else if(*choice == 6)
    {
        int temp = *no;
        int sum = 0;

        while(temp != 0)
        {
           int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        printf("Sum of Digits = %d", sum);
    }
    else
    {
        printf("Invalid Choice.");
    }

}
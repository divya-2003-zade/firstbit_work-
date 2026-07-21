#include<stdio.h>
void is_amstrong(int*);
void main()
{
	
	int no;
	printf("Enter a number :");
	scanf("%d",&no);
	is_amstrong(&no);
	
	
}
void is_amstrong(int*no)
{
	int rem, sum=0, org=*no;;
	while(*no !=0 )
	{
		
		rem=*no%10;
		sum=sum+rem*rem*rem;
		*no=*no/10;
	}
    if(sum==org)
		    printf(" %d is Amstrong number ",org);
	    else
	    	printf("%d is not amstrong number ",org);
}
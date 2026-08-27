#include<stdio.h>
int main()
{
	int no;
	printf("Enter a Number :");
	scanf("%d",&no);
	for (int i=2; i<no; i++)
 {
	  int flag=1;
   	 for(int j=2; j<i; j++)
   {
		if(i%j==0)
		{
			flag=0;
			break;
		}
	}
	    if(flag==1)
	    {
		    printf("%d  ",i);
	    }
  }
}

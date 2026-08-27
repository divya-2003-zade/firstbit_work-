#include<stdio.h>
void main()
{
	
 int no ;
 printf("enter a number :");
 scanf("%d",&no);
 int rem,sum=0;
  int org=no;
  int count=0;
  int base;
  while(no>0)
  {
  	count++;
  	no=no/10;
  }
  no=org;
 while(no!=0)
 {
	rem=no%10;
	no=no/10;
	     base=1;
	     int i=1;
	 while(i<=count){
	
	 	base=base*rem;
	 	i++;
	 }
	 sum=sum+base;
 }
 
 if(sum==org)
 {
 	printf("amstrong=%d",sum);
 }
 else
 {
 	printf("not amstrong");
 }

	 
}
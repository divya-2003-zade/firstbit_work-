void main()
{
	int no=999;
	int r1,r2,r3,q1,sum;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	sum=r1+r2+r3;
	printf("addition of three number is %d\n",sum);
	printf("addition of the three number is %d\n",q1);
	printf("addition of the three number is %d\n",r1);
	
	printf("addition of the three number is %d\n",r2);
	printf("addition of the three number is %d\n",r3);
	printf("addition of %d , %d,and %d is \n",sum);
	printf("addition of %d , %d,and %d,%d is %d \n",r1,q1,r2,r3,sum);
	printf("addition of %d , %d,and %d is%d \n",r1,r2,r3,sum);
	
}
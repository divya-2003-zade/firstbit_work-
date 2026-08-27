void main()
{
	printf("start \n");
	for(int i=1; i<=50; i++)
	 somefun();
	printf("\nend");
}
void somefun()
{
	int*p =malloc(5000000);
	p[0]=10;
	printf("%d %u \n",p[0],p);
	free(p);
}
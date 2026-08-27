void main()
{
	for(int i=1; i<=5; i++)
	 somefun();
}
void somefun()
{
	int*p =malloc(50);
	p[0]=10;
	printf("%d \n",p[0]);
}
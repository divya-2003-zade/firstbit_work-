void main()
{
	int basic=4500,da,ta,hra,total;
	if(basic<= 5000)
	{
		da=basic * 10 /100;
		ta=basic * 20 /100;
		hra= basic *25/100;
	}
	else
	{
		da=basic * 15 /100;
		ta=basic * 25 /100;
		hra= basic *30/100;
	}
	total= basic+da+ta+hra;
	printf("total salary based on the basic is %d",total);
}
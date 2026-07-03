void main()
{
	double price=600;
	char is_student='n';
	double fprice , discount;
	
	if(is_student == 'y')
	{
		if(price>=500)
		{
			discount=price*0.20;
		}
		else
		{
			discount=price*0.10;    
		}
	}
	else
	{
		if(price>=600)
		{
			discount=price*0.15;
		}
	}
	fprice=price-discount;
	printf("final price in actual price %lf with discount %lf is %lf ",price,discount,fprice);
}
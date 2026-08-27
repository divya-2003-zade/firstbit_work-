class price
{
public static void main(String args[])
{
	double price=600;
	char is_student='n';
	double fprice ;
        double discount=0;
	
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
	fprice=price - discount;
	System.out.printf("final price in actual price %f with discount %f is %f ",price,discount,fprice);
}
}
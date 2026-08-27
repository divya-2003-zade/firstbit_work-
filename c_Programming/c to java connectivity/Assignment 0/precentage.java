class precentage
{
	public static void main(String args[])
	{
	int eng=80 , math=70, hindi=75, sci=65, mar=80;
	double sum;
	double per;
	sum=eng+math+hindi+sci+mar;
	per=sum/500*100;
	System.out.printf("Total marks will be %f \n",sum);
	System.out.printf("Percentage will be %f",per);
	}
}
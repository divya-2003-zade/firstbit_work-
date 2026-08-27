class time
{
	public static void main(String args[])
	{
	int min,Hr,rea_min;  
	min = 150;
	Hr = min / 60;
	rea_min = min % 60;
	System.out.printf("%d minutes means %d hours \n",min,Hr);
	System.out.printf("Remaining minutes in the %d minutes is %d minutes \n",min,rea_min);
	System.out.printf("Total time will be %d minute = %d hours and %d remaining minutes \n",min,Hr,rea_min);
	}
}

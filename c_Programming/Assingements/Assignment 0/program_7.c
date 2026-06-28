void main()
{
	int min;  
	int Hr; 
	int rea_min;
	 min = 150;
	Hr = min / 60;
	rea_min = min % 60;
	printf("%d minutes means %d hours \n",min,Hr);
	printf("Remaining minutes in the %d minutes is %d minutes \n",min,rea_min);
	printf("Total time will be %d minute = %d hours and %d remaining minutes \n",min,Hr,rea_min);
}


//Sum of numbers in given range.Find sum of numbers from start to end.
//Input: start = 1, end = 5
//sum of start and end number
void main()
{
	int start=1, end=5;
	int sum=0;
	while ( start <= end)
	{
		sum=sum+start;
		start++;
	}
	printf("sum = %d ", sum);
}
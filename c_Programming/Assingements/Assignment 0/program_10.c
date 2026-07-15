//Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.
void main()
{
	int eng=80 , math=70, hindi=75, sci=65, mar=80;
	float sum;
	float per;
	sum=eng+math+hindi+sci+mar;
	per=sum/500*100;
	printf("Total marks will be %d \n",sum);
	printf("Percentage will be %f",per);
}
void main()
{
	int hr,min,sec;
	printf("Enter an hr, min and sec :");
	scanf("%d%d%d",&hr,&min,&sec);
	
	printf("%d-%d-%d",hr,min,sec);
	int tsec=hr*60*60+min*60+sec;
	printf("\n%d",tsec);
	hr=tsec/3600;
	min=tsec%3600;
	sec=min%60;
	min=min/60;
	printf("\n%d-%d-%d",hr,min,sec);
	
}
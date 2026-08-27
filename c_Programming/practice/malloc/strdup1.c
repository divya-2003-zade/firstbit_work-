void main()
{
	char str[]="firstbit";
	char*ptr=strdup(str);
	printf("str = %s %u \n",str,str);
	printf("ptr = %s %u \n",ptr,str);
}

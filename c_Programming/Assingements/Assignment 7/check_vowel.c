#include<stdio.h>
void check_vowel(char*);
void main()
{
	char ch;
	printf("Enter a character :");
	scanf("%c",&ch);
	check_vowel(&ch);
}
void check_vowel(char*ch)
{
	if(*ch=='A'|| *ch=='E'|| *ch=='I' || *ch=='O' || *ch=='U' || 
	*ch=='a' || *ch=='e' || *ch=='i' || *ch=='o' || *ch=='u')
		printf("%c is an vowel",*ch);
	else
		printf("%c is a consonant",*ch);
}
//without parameter and with return type
#include<stdio.h>
int even_odd();
int palindrome();  
int leap_year();
char vowel();                //function declaration
int age();
char check_case();
float salary();
int main()
{
	int res1,res2,res3,res5;
	char res4,res6;
	float res7;
	res1=even_odd();                       //function call
	if(res1== 1)
        printf("Even Number");
    else
        printf("Odd Number");
        
	res2=palindrome();
	if(res2 == 1)
    printf("Palindrome Number\n");
     else
    printf("Not a Palindrome Number\n");
    
	res3=leap_year();
	   if(res3 == 1)
    printf("Leap Year\n");
      else
    printf("Not a Leap Year\n");
    
	res4=vowel();    
    	if(res4 == 'V')
    printf("Vowel\n");
      else
    printf("Consonant\n");
	                                                
	res5=age();
	 if(res5 == 1)
    printf("Person is eligible for voting.\n");
     else
    printf("Person is not eligible for voting.\n");

	res6=check_case();
	if(res6 == 'U')
    printf("Character is in uppercase\n");
     else if(res6 == 'L')
    printf("Character is in lowercase\n");
     else
    printf("Character is not an alphabet\n");
    
	res7=salary();
     printf("Total Salary = %f", res7);
}
//even_odd
int even_odd()             //function defination
{
	 int no;
    printf("1.Enter a number: ");
    scanf("%d",&no);
    if(no % 2 == 0)
        return 1;
    else
        return 0;
}
// palindrome number
int palindrome()
{
	int n;
    int first,last;
    printf("\n\n2.Enter a three digit number: ");
    scanf("%d",&n);
    first = n/100;
    last = n%10;
    if(first == last)
        return 1;
    else
        return 0;
}
// leap year
int leap_year()                  
{
	int year;
    printf("\n\n3.Enter year: ");
    scanf("%d",&year);
    if((year%400==0) || (year%4==0 && year%100!=0))
        return 1;
    else
        return 0;
}
// vowel
char vowel()
{
	 char ch;
    printf("\n\n4.Enter character: ");
    scanf(" %c",&ch);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
       ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return 'V';
    else
        return 'C';
}
//age
int age()
{
	int a;
    printf("\n\n5.Enter age: ");
    scanf("%d",&a);

    if(a >= 18)
        return 1;
    else
        return 0;
}
//uppercase and lowercase
char check_case()
{
	char ch;
    printf("\n\n6.Enter character: ");
    scanf(" %c",&ch);
    if(ch>='A' && ch<='Z')
        return 'U';
    else if(ch>='a' && ch<='z')
        return 'L';
    else
        return 'N';
}
//salary
float salary()
{
    float basic=4500,da,ta,hra,total;
    if(basic<=5000)
    {
        da=basic*10/100;
        ta=basic*20/100;
        hra=basic*25/100;
    }
    else
    {
        da=basic*15/100;
        ta=basic*25/100;
        hra=basic*30/100;
    }
    total = basic + da + ta + hra;
     return total;
}
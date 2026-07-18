// With Parameter and With Return Type
#include<stdio.h>
int is_even_odd(int);               //function declaration
int is_palindrome(int);
int is_leap_year(int);
char check_vowel(char);
int find_age(int);
char check_case(char);
float find_salary(float);
int main()
{
	int res1,res2,res3,res5;
	int no,year,Age;
	char res4, res6,ch;
	float res7,sal;
	printf("1. Enter a number: ");
    scanf("%d", &no);
    res1=is_even_odd(no);
     if(res1==1)
	 printf("%d is an Even Number\n", no);
	 else
	 printf("%d is an Odd Number\n", no);  //function call
    
    printf("\n2. Enter a three digit number: ");
    scanf("%d", &no);
    res2=is_palindrome(no);
    if(res2==1)
    printf("%d is a Palindrome Number\n", no);
    else
        printf("%d is not a Palindrome Number\n", no);
        
        printf("\n3. Enter a year: ");
    scanf("%d", &year);
    res3=is_leap_year(year);
    if(res3==1)
    printf("%d is a Leap Year\n", year);
    else
    printf("%d is not a Leap Year\n", year);
    
    printf("\n4. Enter a character: ");
    scanf(" %c", &ch);
    res4=check_vowel(ch);
    if(res4=='v')
    printf("%c is a Vowel\n", ch);
    else
    printf("%c is a Consonant\n", ch);
    
     printf("\n5. Enter age: ");
    scanf("%d", &Age);
    res5=find_age(Age);
    if(res5==1)
    printf("Person is eligible for voting.\n");
    else
     printf("Person is not eligible for voting.\n");
    
    printf("\n6. Enter a character: ");
    scanf(" %c", &ch);
    res6=check_case(ch);
    if(res6=='U')
    printf("%c is in Uppercase\n", ch);
    else if(res6=='L')
     printf("%c is in Lowercase\n", ch);
    else
    printf("%c is not an Alphabet\n", ch);
    
    printf("\n7.Enter a salary : ");
    scanf("%f",&sal);
    res7=find_salary(sal);
    printf("Total Salary = %f\n", res7);
}
// Even or Odd
int is_even_odd(int x)                     //function defination
{
    
    if(x % 2 == 0)
        return 1;
    else
       return 0; 
}
// Palindrome Number (Three Digit)
int is_palindrome(int y)
{
    int first, last;
    
    first = y / 100;
    //rev=rev*10+y;
    last = y % 10;
    if(first == last)
      return 1;
    else
        return 0;
}
// Leap Year
int is_leap_year(int yr)
{   
    if((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0))
        return 1;
    else
        return 0;
}

// Vowel or Consonant
char check_vowel(char v)
{

    if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U'||
       v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
        return 'v';
    else
        return 'c';
}

// Voting Eligibility
int find_age(int age)
{
    if(age >= 18)
        return 1;
    else
       return 0;
}
// Uppercase or Lowercase
char check_case(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
        return 'U';
    else if(ch >= 'a' && ch <= 'z')
       return 'L';
    else
        return 'd';
}
// Salary Calculation
float find_salary(float basic)
{
    float da, ta, hra,total;
    if(basic <= 5000)
    {
        da = basic * 10 / 100;
        ta = basic * 20 / 100;
        hra = basic * 25 / 100;
    }
    else
    {
        da = basic * 15 / 100;
        ta = basic * 25 / 100;
        hra = basic * 30 / 100;
    }
    total = basic + da + ta + hra;
    return total;
}
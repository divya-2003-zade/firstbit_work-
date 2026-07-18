// With Parameter and With Return Type
#include<stdio.h>
void is_even_odd(int);               //function declaration
void is_palindrome(int);
void is_leap_year(int);
void check_vowel(char);
void find_age(int);
void check_case(char);
void find_salary(float);
void main()
{
	int no,year,Age;
	char ch;
	float sal;
	printf("1. Enter a number: ");
    scanf("%d", &no);
    is_even_odd(no);
	                               //function call
    
    printf("\n2. Enter a three digit number: ");
    scanf("%d", &no);
    is_palindrome(no);

    printf("\n3. Enter a year: ");
    scanf("%d", &year);
    is_leap_year(year);
    
    printf("\n4. Enter a character: ");
    scanf(" %c", &ch);
    check_vowel(ch);
    
     printf("\n5. Enter age: ");
    scanf("%d", &Age);
    find_age(Age);
    
    printf("\n6. Enter a character: ");
    scanf(" %c", &ch);
    check_case(ch);
    
    printf("\n7.Enter a salary : ");
    scanf("%f",&sal);
    find_salary(sal);
    
}
// Even or Odd
void is_even_odd(int x)                     //function defination
{
    
    if(x % 2 == 0)
     printf("%d is an Even Number\n", x);
    else
       printf("%d is an Odd Number\n", x);
}
// Palindrome Number (Three Digit)
void is_palindrome(int y)
{
    int first, last;
    
    first = y / 100;
    //rev=rev*10+y;
    last = y % 10;
    if(first == last)
     printf("%d is a Palindrome Number\n", y);
    else
         printf("%d is not a Palindrome Number\n",y);
}
// Leap Year
void is_leap_year(int yr)
{   
    if((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0))
        printf("%d is a Leap Year\n", yr);
    else
       printf("%d is not a Leap Year\n", yr);
}

// Vowel or Consonant
void check_vowel(char v)
{

    if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U'||
       v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
       printf("%c is a Vowel\n", v);
    else
        printf("%c is a Consonant\n", v);
}

// Voting Eligibility
void find_age(int age)
{
    if(age >= 18)
        printf("Person is eligible for voting.\n");
    else
      printf("Person is not eligible for voting.\n");
}
// Uppercase or Lowercase
void check_case(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
        printf("%c is in Uppercase\n", ch);
    else if(ch >= 'a' && ch <= 'z')
       printf("%c is in Lowercase\n", ch);
    else
         printf("%c is not an Alphabet\n", ch);
}
// Salary Calculation
void find_salary(float basic)
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
    printf("Total Salary = %f\n",total);
}
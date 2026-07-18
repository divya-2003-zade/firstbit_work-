// Without Parameter and Without Return Type
#include<stdio.h>
void even_odd();               //function declaration
void palindrome();
void leap_year();
void vowel();
void age();
void check_case();
void salary();
int main()
{
    even_odd();                    //function call
    palindrome();
    leap_year();
    vowel();
    age();
    check_case();
    salary();
}
// Even or Odd
void even_odd()                     //function defination
{
    int no;
    printf("1. Enter a number: ");
    scanf("%d", &no);
    if(no % 2 == 0)
        printf("%d is an Even Number\n", no);
    else
        printf("%d is an Odd Number\n", no);
}
// Palindrome Number (Three Digit)
void palindrome()
{
    int n, first, last;
    printf("\n2. Enter a three digit number: ");
    scanf("%d", &n);
    first = n / 100;
    last = n % 10;
    if(first == last)
        printf("%d is a Palindrome Number\n", n);
    else
        printf("%d is not a Palindrome Number\n", n);
}
// Leap Year
void leap_year()
{
    int year;
    printf("\n3. Enter a year: ");
    scanf("%d", &year);
    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        printf("%d is a Leap Year\n", year);
    else
        printf("%d is not a Leap Year\n", year);
}

// Vowel or Consonant
void vowel()
{
    char ch;

    printf("\n4. Enter a character: ");
    scanf(" %c", &ch);

    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
       ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        printf("%c is a Vowel\n", ch);
    else
        printf("%c is a Consonant\n", ch);
}

// Voting Eligibility
void age()
{
    int a;

    printf("\n5. Enter age: ");
    scanf("%d", &a);

    if(a >= 18)
        printf("Person is eligible for voting.\n");
    else
        printf("Person is not eligible for voting.\n");
}
// Uppercase or Lowercase
void check_case()
{
    char ch;

    printf("\n6. Enter a character: ");
    scanf(" %c", &ch);

    if(ch >= 'A' && ch <= 'Z')
        printf("%c is in Uppercase\n", ch);
    else if(ch >= 'a' && ch <= 'z')
        printf("%c is in Lowercase\n", ch);
    else
        printf("%c is not an Alphabet\n", ch);
}
// Salary Calculation
void salary()
{
    float basic = 4500, da, ta, hra, total;
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
    printf("\n7. Total Salary = %f\n", total);
}
#include<stdio.h>

struct Date
{
    int day;
    int month;
    int year;
};

struct Date store(struct Date);
void  display(struct Date);
void main()
{
    struct Date d1, d2;
     d1=store(d1);
     display(d1);
     
     d2=store(d2);
     display(d2);
}
struct Date store(struct Date date)
{
    do
    {
        printf("\nEnter Day Month Year: ");
        scanf("%d%d%d", &date.day, &date.month, &date.year);

        if(date.month < 1 || date.month > 12)
        {
            printf("Invalid Month!\n");
        }
        else if(date.month == 2 && (date.day < 1 || date.day > 28))
        {
            printf("February has only 28 days!\n");
        }
        else if((date.month == 4 || date.month == 6 ||
                 date.month == 9 || date.month == 11) &&
                 (date.day < 1 || date.day > 30))
        {
            printf("This month has only 30 days!\n");
        }
        else if(date.day < 1 || date.day > 31)
        {
            printf("Invalid Day!\n");
        }

    }while(date.month < 1 || date.month > 12 ||
           (date.month == 2 && (date.day < 1 || date.day > 28)) ||
           ((date.month == 4 || date.month == 6 ||
             date.month == 9 || date.month == 11) &&
            (date.day < 1 || date.day > 30)) ||
           date.day < 1 || date.day > 31);

    return date;
}
void  display(struct Date date)
{
	printf("\nDate  : %d/%d/%d", date.day, date.month, date.year);

}
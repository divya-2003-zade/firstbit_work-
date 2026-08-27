
#include<stdio.h>
typedef struct to-do_list{
	int task ID;
	char description[100];
	int status;
}to-do_list;
int Addto-do_list(to-do_list*T,int *ci)
{
	for(int i = 0; i < n; i++)
    {
        printf("\nEnter Task ID: ");
        scanf("%d", &T[*ci].task ID);

        printf("Enter Description : ");
        getchar();
        fgets(T[*ci].name,sizeof(T[*ci].description),stdin);
        T[*ci].name[strcspn(T[*ci].description, "\n")] = '\0';


        printf("Enter status: ");
        scanf("%d", &T[*ci].status);

        (*ci)++;
    }
    return T;

}
int displayto-do_list(to-do_list *T, int ci)
{
    if(ci== 0)
    {
        printf("\n-----TO-Do LIST not found-----\n");
        return;
    }

    printf("\n------ To-Do list Details ------\n");

    for(int i = 0; i < ci; i++)
    {
        printf("\nto-do_list %d", i + 1);
        printf("\nTask Id : %d", T[i].task ID);
        printf("\nDescription   : %s", T[i].description);
        printf("\nStatus          : %d", T[i].status);
    }

}
void main()
{
	printf("-----------------TO-DO List-----------------");
	int size=5;
	int n;
	int choice=0;
	int ci=0;
	printf("How many to-do list you have to add:");
	scanf("%d",&n);
	to-do_list* T=(to-do_list)malloc(size*sizeof(to-do_list));

	while(choice!=4)
	{
		    printf("\n\t 1. Add players");
		    printf("\n\t 2. Update players");
			printf("\n\t 3. Display palyers");
			
			printf("\nEnter a choice: ");
			scanf("%d",&choice);
			
			switch(choice)
			{
				case 1:{
				T=Addto-do_list(T,&ci);
					break;
				}
				case 2:{
					T=updateto-do_list(T,ci )
					break;
				}
				case 3:{
					T=displayto-do_list(T,ci)
					break;
				}
				case 4:{
					printf("\n\t------------Program Exiting!------------");
					break;
				}
				default :{
					printf("\n\n\t----------INVALID CHOICE!-----------");
					break;
				}
			}
			
	}
	
	
}
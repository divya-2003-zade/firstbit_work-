#include<stdio.h>
typedef struct players
{
	int jersey_no;
	char name[20];
	int runs;
	int wickets;
	int matches_played;
}players;
void Addplayer(players*p,int count)
{
	
	//for(int i=0; i<count; i++)
	//{
		printf("\nEnter Jersey Number:");
		scanf("%d",&p[count].jersey_no);
		printf("\nEnter Player Name:");
		scanf("%s",p[count].name);
		printf("\nEnter Runs:");
		scanf("%d",&p[count].runs);
		printf("\nEnter Wickets:");
		scanf("%d",&p[count].wickets);
		printf("\nEnter Number of Matches Played:");
		scanf("%d",&p[count].matches_played);
		printf("\n----- Player Added Successfully -----\n");
	//}
	
}
void displayplayers(players *p, int count)
{
    if(count == 0)
    {
        printf("\nNo Players Found!\n");
        return;
    }

    printf("\n------ Player Details ------\n");

    for(int i = 0; i < count; i++)
    {
        printf("\nPlayer %d", i + 1);
        printf("\nJersey Number : %d", p[i].jersey_no);
        printf("\nPlayer Name   : %s", p[i].name);
        printf("\nRuns          : %d", p[i].runs);
        printf("\nWickets       : %d", p[i].wickets);
        printf("\nMatches Played: %d\n", p[i].matches_played);
    }
}
void main()
{
    	players p[10];
		int count=0;
		int choice,size;
		printf("                       PLAYER MANAGEMENT SYSTEM                                ");
		printf("\nHow many player do you want to store: ");
		scanf("%d",&size);
		
		while(1)
		{
			printf("\n 1. Add players");
			printf("\n 2. Display palyers");
			printf("\n 3. search players");
			printf("\n 4. Update players");
			printf("\n 5. Delete players");
			printf("\n 6. Sorting players");
			printf("\n 7. Exit");
			
			printf("\nEnter a choice :");
			scanf("%d",&choice);
		
		if(choice==1)
		{
		Addplayer(p,count);
		count++;
		}
		else if(choice==2)
		{
			displayplayers(p,count);
		}
		else if(choice==3)
		{
			int id;
		printf("Enter id you want search");
		scanf("%d",&id);
	//	int index=searchEmployeeById(p,10,id);
	//	if(index!=-1)
		//{
		//	printf("%s found at %d index",p[index].name,index);
		//}
		//else
	//	{
		//	printf("Not found");
		//}
		}
		else if(choice==4)
		{
			//update players
		}
		else if(choice==5)
		{
			//delete players
		}
		else if(choice==6)
		{
			//sorting players
		}
		else if(choice==7)
		{
			//exit
		}
		else
		{
			printf("\nPlayer not found ");
		}
	}
}

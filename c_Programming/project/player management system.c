#include<stdio.h>
#include<stdlib.h>
typedef struct players
{
	int jersey_no;
	char name[20];
	int runs;
	int wickets;
	int matches_played;
}players;
// ADD PLAYERS 
void Addplayer(players*p,int size)
{
	
	for(int i=0; i<size; i++)
	{
		printf("Enter Jersey Number:");
		scanf("%d",&p[i].jersey_no);
		printf("Enter Player Name:");
		scanf("%s",p[i].name);
		p[*currentIndex].name[strcspn(p[*currentIndex].name, "\n")] = '\0';

		printf("Enter Runs:");
		scanf("%d",&p[i].runs);
		printf("Enter Wickets:");
		scanf("%d",&p[i].wickets);
		printf("Enter Number of Matches Played:");
		scanf("%d",&p[i].matches_played);
		
	}
	printf("\n----- Player Added Successfully -----\n");
}
// DISPLAY PLAYERS
void displayplayers(players *p, int size)
{
    if(size == 0)
    {
        printf("\nNo Players Found!\n");
        return;
    }

    printf("\n------ Player Details ------\n");

    for(int i = 0; i < size; i++)
    {
        printf("\nPlayer %d", i + 1);
        printf("\nJersey Number : %d", p[i].jersey_no);
        printf("\nPlayer Name   : %s", p[i].name);
        printf("\nRuns          : %d", p[i].runs);
        printf("\nWickets       : %d", p[i].wickets);
        printf("\nMatches Played: %d\n", p[i].matches_played);
    }
   // printf("\n\t-------players %d Details,i=i+1-------");
}
//MAIN START HERE
void main()
{
    	int size, choice;
    	printf("                             PLAYER MANAGEMENT SYSTEM                                        ");
		printf("\nHow many players do you want to store: ");
		scanf("%d",&size);
		players* p=(players*)malloc(size*sizeof(players));
		
		while(choice!=7)
		{
			printf("\n\t 1. Add players");
			printf("\n\t 2. Display palyers");
			printf("\n\t 3. search players");
			printf("\n\t 4. Update players");
			printf("\n\t 5. Delete players");
			printf("\n\t 6. Sorting players");
			printf("\n\t 7. Exit");
			
			printf("\nEnter a choice :");
			scanf("%d",&choice);
			
			switch(choice)
			{
				case 1:{
					Addplayer(p,size);
					break;
				}
				case 2:{
					displayplayers(p, size);
					break;
				}
			}
		}
}
		
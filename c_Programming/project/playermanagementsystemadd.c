#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct players
{
	int jersey_no;
	char name[20];
	int runs;
	int wickets;
	int matches_played;
}players;
void storePlayersHardcoded(players *p, int *currentIndex)
{
    p[*currentIndex].jersey_no = 7;
    strcpy(p[*currentIndex].name, "MS Dhoni");
    p[*currentIndex].matches_played = 350;
    p[*currentIndex].wickets = 0;
    p[*currentIndex].runs = 10773;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 18;
    strcpy(p[*currentIndex].name, "Virat Kohli");
    p[*currentIndex].matches_played = 292;
    p[*currentIndex].wickets = 4;
    p[*currentIndex].runs = 13848;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 45;
    strcpy(p[*currentIndex].name, "Rohit Sharma");
    p[*currentIndex].matches_played = 265;
    p[*currentIndex].wickets = 9;
    p[*currentIndex].runs = 10831;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 10;
    strcpy(p[*currentIndex].name, "Sachin Tendulkar");
    p[*currentIndex].matches_played = 463;
    p[*currentIndex].wickets = 154;
    p[*currentIndex].runs = 18426;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 12;
    strcpy(p[*currentIndex].name, "Yuvraj Singh");
    p[*currentIndex].matches_played = 304;
    p[*currentIndex].wickets = 111;
    p[*currentIndex].runs = 8701;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 1;
    strcpy(p[*currentIndex].name, "KL Rahul");
    p[*currentIndex].matches_played = 199;
    p[*currentIndex].wickets = 0;
    p[*currentIndex].runs = 7247;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 17;
    strcpy(p[*currentIndex].name, "Rishabh Pant");
    p[*currentIndex].matches_played = 135;
    p[*currentIndex].wickets = 3;
    p[*currentIndex].runs = 3500;
    (*currentIndex)++;

    p[*currentIndex].jersey_no = 33;
    strcpy(p[*currentIndex].name, "Hardik Pandya");
    p[*currentIndex].matches_played = 200;
    p[*currentIndex].wickets = 181;
    p[*currentIndex].runs = 4000;
    (*currentIndex)++;
}
// ADD PLAYERS 
players* Addplayer(players *p, int *currentIndex, int *size)
{
    int n;

    printf("\nHow many players do you want to add: ");
    scanf("%d", &n);

    if(*currentIndex + n > *size)
    {
    	int choice;
    	 printf("\n------- Array is full -------\n");
    	 
    	 printf("Are you increase the size of array");
    	 
    	 printf("\n\t1.yes");
    	 printf("\n\t2.No");
    	 
    	 printf("\nEnter a choice:");
    	 scanf("%d",&choice);
    	 
    	 if(choice==1)
          {
		  
        int newsize = *size * 2;

        players *temp = realloc(p, newsize * sizeof(players));

        if(temp != NULL)
        {
            p = temp;
            *size = newsize;
        }
    
        else
        {
            printf("\n----Memory allocation failed!----");
            return p;
        }
    }
       else if(choice==2)
        {
        	printf("\n----Memory not allocate!----");
        	return p;
		}
	
    }

    // Add players
    for(int i = 0; i < n; i++)
    {
        printf("\nEnter Jersey Number: ");
        scanf("%d", &p[*currentIndex].jersey_no);

        printf("Enter Player Name: ");
        getchar();
        fgets(p[*currentIndex].name,sizeof(p[*currentIndex].name),stdin);

        printf("Enter Runs: ");
        scanf("%d", &p[*currentIndex].runs);

        printf("Enter Wickets: ");
        scanf("%d", &p[*currentIndex].wickets);

        printf("Enter Number of Matches Played: ");
        scanf("%d", &p[*currentIndex].matches_played);

        (*currentIndex)++;
    }

    return p;
}
void displayplayers(players *p, int currentIndex)
{
    if(currentIndex == 0)
    {
        printf("\n-----No Players Found!-----\n");
        return;
    }

    printf("\n------ Player Details ------\n");

    for(int i = 0; i < currentIndex; i++)
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
void main()
{

    	printf("                                                               PLAYER MANAGEMENT SYSTEM                                        ");
		
		int size=10;
		int choice;
    	int currentIndex=0;
		players* p=(players*)malloc(size*sizeof(players));
		//STORE PLAYER HARDCODED
		storePlayersHardcoded(p, &currentIndex);
		printf("\n\n========== INITIAL PLAYER DATA ==========\n");
		displayplayers(p, currentIndex);
		
		
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
					Addplayer(p,&currentIndex,&size);
					
					break;
				}
				case 2:{
					displayplayers(p, currentIndex);
					break;
				}
			}
		}
	}
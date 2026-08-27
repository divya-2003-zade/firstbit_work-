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
//STORE HARDCODE DATA OF PLAYERS
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
int isJerseyExists(players *p, int currentIndex, int jersey)
{
    for(int i = 0; i < currentIndex; i++)
    {
        if(p[i].jersey_no == jersey)
        {
            return 1;
        }
    }

    return 0;
}
// ADD PLAYERS code
players* Addplayer(players *p, int *currentIndex, int *size)
{
    int n;

    printf("\nHow many players do you want to add: ");
    scanf("%d", &n);
    
// realloc the memory if size is ful
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
                while(1)
        {
            printf("\nEnter Jersey Number: ");
            scanf("%d", &p[*currentIndex].jersey_no);

            if(p[*currentIndex].jersey_no <= 0)
            {
                printf("\n---- Jersey Number must be positive! ----\n");
                continue;
            }

            if(isJerseyExists(p, *currentIndex,
                              p[*currentIndex].jersey_no))
            {
                printf("\n---- Jersey Number already exists! ----\n");
                continue;
            }

            break;
        }

        printf("Enter Player Name: ");
        getchar();
        fgets(p[*currentIndex].name,sizeof(p[*currentIndex].name),stdin);
        p[*currentIndex].name[strcspn(p[*currentIndex].name, "\n")] = '\0';


        while(1)
        {
            printf("Enter Runs: ");
            scanf("%d", &p[*currentIndex].runs);

            if(p[*currentIndex].runs < 0)
            {
                printf("\n---- Runs cannot be negative! ----\n");
                continue;
            }

            break;
        }
        
        while(1)
        {
            printf("Enter Wickets: ");
            scanf("%d", &p[*currentIndex].wickets);

            if(p[*currentIndex].wickets < 0)
            {
                printf("\n---- Wickets cannot be negative! ----\n");
                continue;
            }

            break;
        }
        
        while(1)
        {
            printf("Enter Number of Matches Played: ");
            scanf("%d", &p[*currentIndex].matches_played);

            if(p[*currentIndex].matches_played < 0)
            {
                printf("\n---- Matches Played cannot be negative! ----\n");
                continue;
            }

            break;
        }

        (*currentIndex)++;
        printf("\n----- Player Added Successfully -----\n");
    }

    return p;
}
// DISPLAY PLAYERS
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
// SEARCHING THE  PLAYERS CODE
void searchplayer(players *p, int currentIndex)
{
    int choice=0;
    int jersey;
    char name[20];
    int found = 0;

    printf("\n1. Search by Jersey Number");
    printf("\n2. Search by Player Name");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);
// search player by the jersey number
    if(choice == 1)
    {
        printf("\nEnter Jersey Number: ");
        scanf("%d", &jersey);

        for(int i = 0; i < currentIndex; i++)
        {
            if(p[i].jersey_no == jersey)
            {
                printf("\n----- Player Found -----\n");
                printf("Jersey Number : %d\n", p[i].jersey_no);
                printf("Player Name   : %s\n", p[i].name);
                printf("Runs          : %d\n", p[i].runs);
                printf("Wickets       : %d\n", p[i].wickets);
                printf("Matches Played: %d\n", p[i].matches_played);

                found = 1;
                break;
            }
        }
    }
    //search player by the player name
    else if(choice == 2)
    {
        printf("\nEnter Player Name: ");
        getchar();
        fgets(name, sizeof(name), stdin);
        name[strcspn(name, "\n")] = '\0';
        
        for(int i = 0; i < currentIndex; i++)
        {
            if(strcasecmp(p[i].name, name) == 0)
            {
                printf("\n----- Player Found -----\n");
                printf("Jersey Number : %d\n", p[i].jersey_no);
                printf("Player Name   : %s\n", p[i].name);
                printf("Runs          : %d\n", p[i].runs);
                printf("Wickets       : %d\n", p[i].wickets);
                printf("Matches Played: %d\n", p[i].matches_played);

                found = 1;
                break;
            }
        }
    }
   //user Enter the invalid choice
    else
    {
        printf("\n----Invalid Choice!----\n");
        return;
    }
 //search not found
    if(found == 0)
    {
        printf("\n-----Player Not Found!-----\n");
    }
}
//UPDATED PLAYERS
void updateplayer(players *p, int currentIndex)
{
    int jersey;
    int choice;
    int run;
    int wicket;
    int matches_play;
    int found = 0;

    printf("\nEnter Jersey Number of Player: ");
    scanf("%d", &jersey);

    for(int i = 0; i < currentIndex; i++)
    {
    	//player is found then update runs,wickets and matched_played by players
        if(p[i].jersey_no == jersey)
        {
            found = 1;

            printf("\n----- Player Found -----\n");
            printf("Jersey Number : %d\n", p[i].jersey_no);
            printf("Player Name   : %s\n", p[i].name);
            printf("Runs          : %d\n", p[i].runs);
            printf("Wickets       : %d\n", p[i].wickets);
            printf("Matches Played: %d\n", p[i].matches_played);

            printf("\n\t1. Update Runs");
            printf("\n\t2. Update Wickets");
            printf("\n\t3. Update Matches Played");

            printf("\nEnter your choice: ");
            scanf("%d", &choice);
             //update the runs 
            if(choice == 1)
            {
                printf("\nEnter New Runs: ");
                scanf("%d", &run);

                p[i].runs = run;
            }
            //update the wickets
            else if(choice == 2)
            {
                printf("\nEnter New Wickets: ");
                scanf("%d", &wicket);

                p[i].wickets = wicket;
            }
            //update the matches played
            else if(choice == 3)
            {
                printf("\nEnter New Matches Played: ");
                scanf("%d", &matches_play);

                p[i].matches_played = matches_play;
            }
            //user enter the invalid choice
            else
            {
                printf("\n----Invalid Choice!----\n");
                return;
            }
            //print the updation is successfully
            printf("\n----- Player Updated Successfully -----\n");

            printf("\nJersey Number : %d\n", p[i].jersey_no);
            printf("Player Name   : %s\n", p[i].name);
            printf("Runs          : %d\n", p[i].runs);
            printf("Wickets       : %d\n", p[i].wickets);
            printf("Matches Played: %d\n", p[i].matches_played);

            break;
        }
    }
      //not update if the player is not found
    if(found == 0)
    {
        printf("\n-----Player Not found!-----\n");
    }
}
//DELETE PLAYERS
void deleteplayers(players*p,int *currentIndex)
{
	int jersey;
	int found=0;
	
	printf("\nEnter jersey number to delete :");
	scanf("%d",&jersey);
	
	for(int i=0; i<*currentIndex; i++)
	{
		if(p[i].jersey_no==jersey)
		{
			found=1;
			//shift the player to left
			for(int j=i; j<*currentIndex-1; j++)
			{
				p[j]=p[j+1];
			}
			//decrease valid palyer count 
			(*currentIndex)--;
			
			printf("\n---------------player Deleted successfully!-----------");
			
			break;
		}
	}
	if(found==0)
	{
		printf("\n------palyer not found!-----\n");
	}
}
//SORTING THE PLAYERS FOR THEIR RUNS 0R WICKETS IN THE ASCENDING OR DECENDING ORDER
void sortPlayers(players *p, int currentIndex)
{
    int choice;
    int order;
    players temp;

    printf("\n\t1. Sort by Runs");
    printf("\n\t2. Sort by Wickets");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);

	if(choice != 1 && choice != 2)
    {
	    printf("\n----Invalid choice!----");
	    return;
	}
    
    printf("\n\t1. Ascending Order");
    printf("\n\t2. Descending Order");

    printf("\nEnter order: ");
    scanf("%d", &order);
    
    if(order != 1 && order != 2)
    {
        printf("\n----Invalid order!----");
        return;
    }

    for(int i = 0; i < currentIndex - 1; i++)
    {
        for(int j = 0; j < currentIndex - 1 - i; j++)
        {
            if(choice == 1)
            {
                // Sort by Runs
                if(order == 1)
                {
                    // Ascending
                    if(p[j].runs > p[j + 1].runs)
                    {
                        temp = p[j];
                        p[j] = p[j + 1];
                        p[j + 1] = temp;
                    }
                }
                else if(order == 2)
                {
                    // Descending
                    if(p[j].runs < p[j + 1].runs)
                    {
                        temp = p[j];
                        p[j] = p[j + 1];
                        p[j + 1] = temp;
                    }
                }
            }
            else if(choice == 2)
            {
                // Sort by Wickets
                if(order == 1)
                {
                    // Ascending
                    if(p[j].wickets > p[j + 1].wickets)
                    {
                        temp = p[j];
                        p[j] = p[j + 1];
                        p[j + 1] = temp;
                    }
                }
                else if(order == 2)
                {
                    // Descending
                    if(p[j].wickets < p[j + 1].wickets)
                    {
                        temp = p[j];
                        p[j] = p[j + 1];
                        p[j + 1] = temp;
                    }
                }
            }
        }
    }

    printf("\n----- Players Sorted Successfully -----\n");
}
//MAIN START HERE
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
					p=Addplayer(p,&currentIndex,&size);
					
					break;
				}
				case 2:{
					displayplayers(p, currentIndex);
					break;
				}
				case 3:{
					searchplayer(p,currentIndex);
					break;
				}
				case 4:{
					updateplayer(p,currentIndex);
					break;
				}
				case 5:{
					deleteplayers(p,&currentIndex);
					break;
				}
				case 6:{
					sortPlayers(p, currentIndex);
					break;
				}
				case 7:{
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
		
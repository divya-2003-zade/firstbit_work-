#include <stdio.h>
#include <string.h>

typedef struct Player
{
    char name[30];
    int matches;
    int runs;
    int wickets;
} Player;

// a. Function to accept player information
void acceptPlayers(Player *p, int n)
{
    int i;

    for(i = 0; i < n; i++)
    {
        printf("\nEnter details of Player %d\n", i + 1);

        printf("Enter Name: ");
        fgets(p[i].name,sizeof(p[i].name),stdin);
        p[i].name[strcspn(p[i].name,"\n")]='\0';

        printf("Enter Matches Played: ");
        scanf("%d", &p[i].matches);

        printf("Enter Runs: ");
        scanf("%d", &p[i].runs);

        printf("Enter Wickets: ");
        scanf("%d", &p[i].wickets);
        
        while(getchar() != '\n');
    }
}

// b. Function to display all players
void displayPlayers(Player *p, int n)
{
    int i;

    printf("\n--------- PLAYER INFORMATION ---------\n");

    for(i = 0; i < n; i++)
    {
        printf("\nPlayer %d\n", i + 1);
        printf("Name            : %s\n", p[i].name);
        printf("Matches Played  : %d\n", p[i].matches);
        printf("Runs            : %d\n", p[i].runs);
        printf("Wickets         : %d\n", p[i].wickets);
    }
}

// c. Function to find maximum runs and maximum wickets
void findMaximum(Player *p, int n)
{
    int i;
    int maxRuns = 0;
    int maxWickets = 0;
    int runIndex = 0;
    int wicketIndex = 0;

    for(i = 0; i < n; i++)
    {
        if(p[i].runs > maxRuns)
        {
            maxRuns = p[i].runs;
            runIndex = i;
        }

        if(p[i].wickets > maxWickets)
        {
            maxWickets = p[i].wickets;
            wicketIndex = i;
        }
    }

    printf("\n--------- MAXIMUM RUNS ---------\n");
    printf("Name           : %s\n", p[runIndex].name);
    printf("Matches Played : %d\n", p[runIndex].matches);
    printf("Runs           : %d\n", p[runIndex].runs);
    printf("Wickets        : %d\n", p[runIndex].wickets);

    printf("\n--------- MAXIMUM WICKETS ---------\n");
    printf("Name           : %s\n", p[wicketIndex].name);
    printf("Matches Played : %d\n", p[wicketIndex].matches);
    printf("Runs           : %d\n", p[wicketIndex].runs);
    printf("Wickets        : %d\n", p[wicketIndex].wickets);
}

int main()
{
    Player p[10];

    acceptPlayers(p, 10);
    displayPlayers(p, 10);
    findMaximum(p, 10);

    return 0;
}
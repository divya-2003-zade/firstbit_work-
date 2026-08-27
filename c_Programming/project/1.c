void sortPlayers(players *p, int currentIndex)
{
    int choice;
    int order;
    players temp;

    // Create temporary array
    players *tempPlayers = malloc(currentIndex * sizeof(players));

    if(tempPlayers == NULL)
    {
        printf("\n---- Memory allocation failed! ----\n");
        return;
    }

    // Copy original players into temporary array
    for(int i = 0; i < currentIndex; i++)
    {
        tempPlayers[i] = p[i];
    }

    printf("\n\t1. Sort by Runs");
    printf("\n\t2. Sort by Wickets");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);

    if(choice != 1 && choice != 2)
    {
        printf("\n----Invalid choice!----\n");
        free(tempPlayers);
        return;
    }

    printf("\n\t1. Ascending Order");
    printf("\n\t2. Descending Order");

    printf("\nEnter order: ");
    scanf("%d", &order);

    if(order != 1 && order != 2)
    {
        printf("\n----Invalid order!----\n");
        free(tempPlayers);
        return;
    }

    // Sort temporary array
    for(int i = 0; i < currentIndex - 1; i++)
    {
        for(int j = 0; j < currentIndex - 1 - i; j++)
        {
            if(choice == 1)   // Sort by Runs
            {
                if(order == 1)   // Ascending
                {
                    if(tempPlayers[j].runs > tempPlayers[j + 1].runs)
                    {
                        temp = tempPlayers[j];
                        tempPlayers[j] = tempPlayers[j + 1];
                        tempPlayers[j + 1] = temp;
                    }
                }
                else             // Descending
                {
                    if(tempPlayers[j].runs < tempPlayers[j + 1].runs)
                    {
                        temp = tempPlayers[j];
                        tempPlayers[j] = tempPlayers[j + 1];
                        tempPlayers[j + 1] = temp;
                    }
                }
            }
            else                 // Sort by Wickets
            {
                if(order == 1)   // Ascending
                {
                    if(tempPlayers[j].wickets > tempPlayers[j + 1].wickets)
                    {
                        temp = tempPlayers[j];
                        tempPlayers[j] = tempPlayers[j + 1];
                        tempPlayers[j + 1] = temp;
                    }
                }
                else              // Descending
                {
                    if(tempPlayers[j].wickets < tempPlayers[j + 1].wickets)
                    {
                        temp = tempPlayers[j];
                        tempPlayers[j] = tempPlayers[j + 1];
                        tempPlayers[j + 1] = temp;
                    }
                }
            }
        }
    }

    // Display sorted temporary array
    printf("\n----- Sorted Players -----\n");

    for(int i = 0; i < currentIndex; i++)
    {
        printf("\nPlayer %d", i + 1);
        printf("\nJersey Number : %d", tempPlayers[i].jersey_no);
        printf("\nPlayer Name   : %s", tempPlayers[i].name);
        printf("\nRuns          : %d", tempPlayers[i].runs);
        printf("\nWickets       : %d", tempPlayers[i].wickets);
        printf("\nMatches Played: %d\n", tempPlayers[i].matches_played);
    }

    // Free temporary memory
    free(tempPlayers);
}
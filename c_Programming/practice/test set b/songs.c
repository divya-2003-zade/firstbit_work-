#include <stdio.h>
#include <string.h>


typedef struct Song
{
    int songId;
    char title[100];
    char artist[100];
    float duration;
} Song;


void addSong(Song *songs, int *ci)
{
    printf("\nEnter Song ID: ");
    scanf("%d", &songs[*ci].songId);

    getchar();

    printf("Enter Song Title: ");
    fgets(songs[*ci].title,sizeof(songs[*ci].title),stdin);
     songs[*ci].title[strcspn(songs[*ci].title, "\n") ] = '\0';



    printf("Enter Artist Name: ");
    fgets(songs[*ci].artist, sizeof(songs[*ci].artist), stdin);
    songs[*ci].artist[strcspn(songs[*ci].artist, "\n")] = '\0';


    printf("Enter Duration (in minutes): ");
    scanf("%f", &songs[*ci].duration);

    (*ci)++;

    printf("\n----- Song added successfully! -----\n");
}


void displaySongs(Song *songs, int ci)
{
    if(ci == 0)
    {
        printf("\n----- No songs available! -----\n");
        return;
    }

    printf("\n========== MUSIC LIBRARY ==========\n");

    for(int i = 0; i < ci; i++)
    {
        printf("\nSong ID   : %d", songs[i].songId);
        printf("\nTitle     : %s", songs[i].title);
        printf("\nArtist    : %s", songs[i].artist);
        printf("\nDuration  : %f minutes", songs[i].duration);

        printf("\n-----------------------------------\n");
    }
}


int main()
{
    Song songs[5];

    int ci = 0;
    int choice;

    do
    {
        printf("\n\n========== MUSIC MENU ==========");
        printf("\n1. Add Song");
        printf("\n2. Display Songs");
        printf("\n3. Exit");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                addSong(songs, &ci);
                break;

            case 2:
                displaySongs(songs, ci);
                break;

            case 3:
                printf("\n------- Program exited. -------\n");
                break;

            default:
                printf("\n------- Invalid choice! -------\n");
        }

    } while(choice != 3);

    return 0;
}
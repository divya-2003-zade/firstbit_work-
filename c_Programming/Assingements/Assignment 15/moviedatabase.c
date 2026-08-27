#include <stdio.h>
#include <string.h>

typedef struct Movie
{
    char title[50];
    char director[50];
    int releaseYear;
    char genre[30];
} Movie;

// Add movie
void addMovie(Movie *m)
{
    printf("\nEnter Movie Title: ");
    scanf(" %[^\n]", m->title);

    printf("Enter Director: ");
    scanf(" %[^\n]", m->director);

    printf("Enter Release Year: ");
    scanf("%d", &m->releaseYear);

    printf("Enter Genre: ");
    scanf(" %[^\n]", m->genre);

    printf("\nMovie added successfully!\n");
}

// Display all movies
void displayMovies(Movie *m, int n)
{
    int i;

    if(n == 0)
    {
        printf("\nNo movies available.\n");
        return;
    }

    printf("\n========== MOVIE DATABASE ==========\n");

    for(i = 0; i < n; i++)
    {
        printf("\nMovie %d\n", i + 1);
        printf("Title       : %s\n", m[i].title);
        printf("Director    : %s\n", m[i].director);
        printf("Release Year: %d\n", m[i].releaseYear);
        printf("Genre       : %s\n", m[i].genre);
    }
}

// Search movie by title
void searchMovie(Movie *m, int n)
{
    char searchTitle[50];
    int i;
    int found = 0;

    printf("\nEnter movie title to search: ");
    scanf(" %[^\n]", searchTitle);

    for(i = 0; i < n; i++)
    {
        if(strcasecmp(m[i].title, searchTitle) == 0)
        {
            printf("\nMovie Found!\n");
            printf("Title       : %s\n", m[i].title);
            printf("Director    : %s\n", m[i].director);
            printf("Release Year: %d\n", m[i].releaseYear);
            printf("Genre       : %s\n", m[i].genre);

            found = 1;
            break;
        }
    }

    if(found == 0)
    {
        printf("\nMovie not found.\n");
    }
}

// Update movie
void updateMovie(Movie *m, int n)
{
    char searchTitle[50];
    int i;
    int found = 0;

    printf("\nEnter movie title to update: ");
    scanf(" %[^\n]", searchTitle);

    for(i = 0; i < n; i++)
    {
        if(strcmp(m[i].title, searchTitle) == 0)
        {
            printf("\nEnter new Director: ");
            scanf(" %[^\n]", m[i].director);

            printf("Enter new Release Year: ");
            scanf("%d", &m[i].releaseYear);

            printf("Enter new Genre: ");
            scanf(" %[^\n]", m[i].genre);

            printf("\nMovie updated successfully!\n");

            found = 1;
            break;
        }
    }

    if(found == 0)
    {
        printf("\nMovie not found.\n");
    }
}

int main()
{
    Movie movies[10];
    int count = 0;
    int choice;

    do
    {
        printf("\n\n========== MOVIE DATABASE ==========");
        printf("\n1. Add Movie");
        printf("\n2. Display Movies");
        printf("\n3. Search Movie");
        printf("\n4. Update Movie");
        printf("\n5. Exit");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                if(count < 10)
                {
                    addMovie(&movies[count]);
                    count++;
                }
                else
                {
                    printf("\nMovie database is full!");
                }
                break;

            case 2:
                displayMovies(movies, count);
                break;

            case 3:
                searchMovie(movies, count);
                break;

            case 4:
                updateMovie(movies, count);
                break;

            case 5:
                printf("\nExiting program...\n");
                break;

            default:
                printf("\nInvalid choice!");
        }

    } while(choice != 5);

    return 0;
}
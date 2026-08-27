#include <stdio.h>
#include <string.h>


typedef struct Task
{
    int taskId;
    char description[100];
    char status[20];
}Task;

void addTask( Task *tasks, int *ci)
{
    printf("\nEnter Task ID: ");
    scanf("%d", &tasks[*ci].taskId);
    
    getchar();

    printf("Enter Task Description: ");
    fgets(tasks[*ci].description,sizeof(tasks[*ci].description),stdin);
    tasks[*ci].description[strcspn(tasks[*ci].description, "\n")]='\0';

    printf("Enter Task Status: ");
    scanf("%s", tasks[*ci].status);

    (*ci)++;

    printf("\nTask added successfully!\n");
}

void updateTask(Task *tasks, int ci)
{
    int id;
    int found = 0;

    printf("\nEnter Task ID to update: ");
    scanf("%d", &id);

    for(int i = 0; i < ci; i++)
    {
        if(tasks[i].taskId == id)
        {
            printf("Enter new description: ");
            getchar();
            fgets(tasks[i].description,sizeof(tasks[i].description),stdin);
            tasks[i].description[strcspn(tasks[i].description, "\n")]='\0';

            printf("Enter new status: ");
            scanf("%s", tasks[i].status);

            found = 1;

            printf("\n-----Task updated successfully!------\n");
            break;
        }
    }

    if(found == 0)
    {
        printf("\n----Task not found!-----\n");
    }
}

void displayTasks(Task *tasks, int ci)
{
    if(ci == 0)
    {
        printf("\n------No tasks available!-------\n");
        return;
    }

    printf("\n----------- TO-DO LIST -----------\n");

    for(int i = 0; i < ci; i++)
    {
        printf("\nTask ID     : %d", tasks[i].taskId);
        printf("\nDescription : %s", tasks[i].description);
        printf("\nStatus      : %s", tasks[i].status);
        printf("\n----------------------------------");
    }
}

int main()
{
    Task tasks[5];
    int ci = 0;
    int choice;

    do
    {
        printf("\n\n========== TO-DO MENU ==========");
        printf("\n1. Add Task");
        printf("\n2. Update Task");
        printf("\n3. Display Tasks");
        printf("\n4. Exit");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                addTask(tasks, &ci);
                break;

            case 2:
                updateTask(tasks, ci);
                break;

            case 3:
                displayTasks(tasks, ci);
                break;

            case 4:
                printf("\n-------Program exited.--------\n");
                break;

            default:
                printf("\n------Invalid choice!--------\n");
        }

    } while(choice != 4);

    return 0;
}
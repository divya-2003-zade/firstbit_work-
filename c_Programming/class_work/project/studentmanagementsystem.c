#include<stdio.h>
#include<stdlib.h>
typedef struct student
{
	int roll_no;
	char name[30];
	float marks;
}student;
	void Insertstudentdata(student*ptr,int size)
	{
		for(int i=0; i<size; i++)
		{
			printf("Enter Roll No:");
			scanf("%d",&ptr[i].roll_no);
			printf("Enter Student Name :");
			scanf("%s",ptr[i].name);
			printf("Enter a Student Mark :");
			scanf("%f",&ptr[i].marks);
		}
		printf("\n\t------Student Added!-------");
	}
	void displayAll(student*ptr,int size)
	{
		for(int i=0; i<size; i++)
		{
			printf("Roll Number :%d ",ptr[i].roll_no);
			printf("Name :%s",ptr[i].name);
			printf("Marks :%f",ptr[i].marks);
		}
		printf("\n\t-------Student %d Details,i+1-------");
	}
	void searchstudentdata(student*ptr,int size,int id)
	{
		int found=0;
		for(int i=0; i<size; i++)
		{
			if(ptr[i].roll_no==id)
			{
				printf("\n\t-------studend found!------");
				printf("Roll No :%d ",ptr[i].roll_no);
				found=1;
				break;
			}
		}
		if(found==0)
		{
			printf("\nStudent not found :");
		}
	}
	void updatestudentdata(student*ptr,int size,int id)
   {
		int index=-1,ch;
		for(int i=0; i<size; i++)
		{
			if(id==ptr[i].roll_no)
			{
				printf("\n\t-----student found-------");
				printf("\nRoll Number :%d",ptr[i].roll_no);
				printf("\n Name :%s",ptr[i].name);
				printf("\nMarks :%f",ptr[i].marks);
				index=i;
				break;
			}
		}
			if(index==-1)
			{
				printf("\n\t------student Not found-------");
			}
			else
			{
				printf("\t1.Name \n\t2.Roll no \n\t3.Marks \nEnter your choice:");
				scanf("%d",&ch);
				if(ch==1)
				{
					printf("Enter New name :");
					gets(ptr[index].name);
					printf("\n\t-------Name update------");
				}
				else if(ch==2)
				{
					printf("Enter new marks:");
					scanf("%f",&ptr[index].marks);
				}
				else{
					printf("\n\t-------INVALID INPUT!------");
				}
				printf("\n\t------student Data updated-------");
			}
	}
	void main()
	{
		int size, choice;
		printf("How many student do you want to store: ");
		scanf("%d",&size);
		student* studs=(student*)malloc(size*sizeof(student));
		do
	{
		printf("\n\t1.Add");
		printf("\n\t2.Remove");
		printf("\n\t3.Search");
		printf("\n\t4.Update");
		printf("\n\t5.DisplayAll");
		printf("\n\t0.Exit");
		printf("\nEnter your choice :");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1:{
				Insertstudentdata(studs,size);
				break;
			}
			case 2:{
				int id;
				printf("\nEnter roll_no you want to delete :");
				scanf("%d",&id);
				//removestudentdata(studs,size,id);
				break;
			}
			case 3:{
				int id;
				printf("\nEnter roll_no you want to search :");
				scanf("%d",&id);
				searchstudentdata(studs,size,id);
				break;
			}
			case 4:{
				int id;
				printf("\nEnter roll_no you want to Update :");
				scanf("%d",&id);
				updatestudentdata(studs,size,id);
				break;
			}
			case 5:{
				displayAll(studs,size);
				break;
			}
			case 0:{
				printf("\n\t------------Program Exiting!------------");
				break;
			}
			default :{
				printf("\n\n\t----------INVALID CHOICE!-----------");
				break;
			}
		}
			
	}while(1);
		
	}
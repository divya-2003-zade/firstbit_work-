#include<stdio.h>
void addArray(int *, int* ,int ,int ,int*);
void main()
{
		int arr[10]={1,2,3,4,5,6,7,8,9,10};
		int brr[15]={11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		 int s1=sizeof(arr)/sizeof(int);
		 int s2=sizeof(brr)/sizeof(int);
		 
		 int minsize=s1<s2? s1 :s2;
		 int maxsize=s1>s2? s1 :s2;
		 
		 int crr[maxsize];
		addArray(arr,brr,s1,s2,crr);
}
 void addArray(int *arr, int* brr,int s1,int s2,int*crr)
{
	    int minsize=s1<s2? s1 :s2;
		 int maxsize=s1>s2? s1 :s2;
	
	
		for(int i=0; i<minsize; i++)
		 crr[i]=arr[i]+brr[i];
		 
		 int *p;
		 if(s1==maxsize) ///int*p=s1==maxsize:i<maxsize;i++;
		    p=arr;
		 else 
		   p=brr;
		 
		 for(int i=minsize; i<maxsize; i++)
		 {
		 	crr[i]=p[i];
		 }
		  
		 
		 for(int i=0; i<maxsize; i++)
		 printf("%d ",crr[i]);
}
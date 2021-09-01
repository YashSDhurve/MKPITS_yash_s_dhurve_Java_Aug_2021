#include<stdio.h>

//5- Write a program in C to display the n terms of even natural number and their sum
//for eg
//Input number of terms : 5
//Expected Output :
//The even numbers are :2 4 6 8 10
//The Sum of even Natural Number upto 5 terms : 30


int main()
{
     int num[7]={2,4,6,8,10,12,14};
     int i;
     printf(" The even numbers are");
     for(i=0;i<7;i++){
	 
     printf(" %d",num[i]);
     
 }
 sum(num);
}
 
 void sum(int n[])
 {      
 int sum=0,i;
 	     for(i=0;i<7;i++)
		  {
	 
            sum=sum+n[i];	 
     
          }
          printf("\n sum of even Natural Number upto 7 terms : %d",sum);
 
 
 
 
 
 }

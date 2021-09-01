#include<stdio.h>

//6 	Write a program in C to display the n terms of square natural number and their sum.
//	1 4 9 16 ... n Terms
//	Test Data :
//	Input the number of terms : 5
//	Expected Output :
//	The square natural upto 5 terms are :1 4 9 16 25
//	The Sum of Square Natural Number upto 5 terms = 55


int main()
{
     int num[5]={1,4,9,16,25};
     int i;
     printf(" The 5 square natural numbers are");
     for(i=0;i<5;i++){
	 
     printf(" %d",num[i]);
     
 }
 sum(num);
}
 
 void sum(int n[])
 {      
 int sum=0,i;
 	     for(i=0;i<5;i++)
		  {
	 
            sum=sum+n[i];	 
     
          }
          printf("\n The Sum of Square Natural Number upto 5 terms =  %d",sum);
 
 
 
 
 
 }

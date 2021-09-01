#include<stdio.h>

//3	Write a c program to check whether a given number is a perfect number or not.
//	Input the number : 56
//	Expected Output :
//	The positive divisor : 1 2 4 7 8 14 28
//	The sum of the divisor is : 64
//	So, the number is not perfect.



int main()
{    int given_num=56,i;
     int num[7]={1,2,4,7,8,14,28};

     printf("\n Given_number is %d",given_num);
     
     printf("\n The positive divisor :");
     
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
          printf("\n The sum of the divisor is  =  %d",sum);
 
        if(sum==56)
        {
        	printf("\n The given number is the perfect number");
		}
	    if(sum!=56)
        {
        	printf("\n The given number is not perfect number");
		}
 
 
 
 }

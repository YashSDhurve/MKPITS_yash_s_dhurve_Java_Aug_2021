//4-assignment :
//wap to accept a 3 digit no. and print the reverse of that no.
//for eg num =123
//then reverse of no. is 321

#include<stdio.h>


int main()
{
  int num;
  int rem;
  int reversed_no;
  
  printf(" enter any 3 digit no. ");
  scanf("%d",&num);
  printf("\n original no.=%d \n",num);
  printf("\n reversed no.-\n ");
  while(num>0)
  {
  	rem=num%10;
  	printf("%d",rem);
  	num=num/10;


  }
  
}
  



#include<stdio.h>

//3-wap to print strong no. between 100 and 50000
int main()
{  
  int num;
  int originalno;
  int rem;
  int fact;
  int sum=0;
  int i;
  
  for(i=100;i<50000;i++)
{
  num=i;
  sum=0;
  originalno=num;
  
  while(num !=0)
  {
  	rem=num%10;
  	num=num/10;
  	fact=factorial(rem);  //passing reminder to the function factorial
  	sum=sum+fact;
  }

 // printf("\n sum =%d",sum);

  
  if(originalno == sum)
  {
  	printf("\n given no[%d] is strong number",originalno);
  }
  
}
}
//calculating factorials of the reminder
int factorial(int reminder)
{ 
int facto=1;
while(reminder>0)
{
  facto=facto*reminder;
  reminder=reminder-1;
}

return facto;

}



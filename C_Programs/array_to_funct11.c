//12	wap to accept empname and designation and salary calculate bonus

#include<stdio.h>

int main()
{
	char empname[20];
	char desig[10];
	int salary;
	
	printf("\n enter employee name-  ");
	gets(empname);
	printf("\n enter employee designation- ");
	gets(desig);
	printf("\n enter salary= ");
	fflush(stdin);
	scanf("%d",&salary);
	
   cal_bonus(salary);
	
}

void cal_bonus(int sal)
{   
 float bonus;
 fflush(stdin);
 bonus=(float)(sal)+(sal*0.4f);
printf("\n bonus = %f",bonus); 
    

	
	
	
}

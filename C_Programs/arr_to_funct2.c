#include<stdio.h>
//3- create a program to accept 3 subject marks in array and then pass this array to function calculate_result to
// calculate total,percentage and grade.



int main()
{
	
	int marks[3];
	int i;
	for(i=0;i<3;i++)
	{
		printf("\n enter marks of subject=");
		scanf("%d",&marks[i]);
	}

calculate_result(marks);	

}

void calculate_result(int marks[])
{
	int total=0,i;
	
	for(i=0;i<3;i++){
		
	total=total+marks[i];

	
}
}


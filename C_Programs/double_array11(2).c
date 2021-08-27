#include<stdio.h>
//11-multiplication of row of arr1 and col of arr2 into arr3
int main()
{   
	int arr1[3][3]={{1,2,3} , {4,5,6} , {7,8,9}};
	int arr2[3][3]={{1,2,3} , {4,5,6} , {7,8,9}};
	int arr3[3][3];
	int row,col;
printf("\n arr1[3][3]\n");
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t %d",arr1[row][col]);
		}
		printf("\n");
	}
printf("\n arr2[3][3]\n");
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t %d",arr2[row][col]);
		}
		printf("\n");
	}
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
		arr3[row][col]= arr1[row][col] * arr2[col][row];
		}
	}
	
	printf("\n arr3[3][3]\n");
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t %d",arr3[row][col]);
		}
		printf("\n");
	}		




	
	
	
	
}

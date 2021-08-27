#include<stdio.h>
//3 create a 2d of 2 rows and 2cols and accept the values from the user and store it in an array
//and then display it.
int main()
{int arr[2][2];
//accepting values of rows and columns from the user
int row,col;
for(row=0;row<2;row++)
{
	for(col=0;col<2;col++)
	{
		printf("\n enter no");
		scanf("%d",&arr[row][col]);
	}
}
//displaying the stored values in the rows and columns	

for(row=0;row<2;row++)
{
	for(col=0;col<2;col++)
	{
		printf("\t%d",arr[row][col]);
	}
	printf("\n");
}
	
}


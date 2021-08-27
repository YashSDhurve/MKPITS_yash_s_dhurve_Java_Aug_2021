#include<stdio.h>
//7 create a 2d array of 2 rows and 4 columns and by accepting values from user and
// store it in an array and display the values
int main()
{
int arr[3][4];
int row,col;

for(row=0;row<2;row++)
{
for(col=0;col<4;col++)
{
	printf("\n enter number");
	scanf("%d",&arr[row][col]);
	}
}

for(row=0;row<2;row++)
{
for(col=0;col<4;col++)
{
	printf("\t %d",arr[row][col]);
}
	printf("\n");
	
}
}


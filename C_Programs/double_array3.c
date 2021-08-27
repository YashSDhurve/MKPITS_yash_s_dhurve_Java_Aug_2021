#include<stdio.h>
//4 create a 2d array of 3 rows and 3 columns and store some value in it and display the values
int main()
{
int arr[3][3]={{1,2,3} , {4,5,6} , {7,8,9}};
int row,col;

for(row=0;row<3;row++)
{
for(col=0;col<3;col++)
{
	printf("\t %d",arr[row][col]);
	}	
	
	
printf("\n");
}
}

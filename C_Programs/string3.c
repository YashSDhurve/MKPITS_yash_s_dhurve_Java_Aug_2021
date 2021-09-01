#include<stdio.h>

//4-wap to create a string using string literal.
int main()
{
	
	char str[15];
	int i=0,cnt=0;
	printf("\n enter a string ");
	scanf("%s",str);

	
	while(i<15 )
	{

		if(str[i]=='a'|| str[i]=='e'|| str[i]=='i'|| str[i]=='o'|| str[i]=='u')
		{
	
				cnt=cnt+1;
	
	    }
	    i++;

	

	}
	printf("\n no. of vowels in string = %d",cnt);
							
			
	
}

#include<stdio.h>

//2- wap to accept a string and count the no. of vowels in it .
int main()
{
	
	char ch[15];
	int i=0,cnt=0;
	printf("\n enter a string ");
	scanf("%s",ch);

	
	while(i<15 )
	{

		if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
		{
	
				cnt=cnt+1;
	
	    }
	    i++;

	

	}
	printf("\n no. of vowels in string = %d",cnt);
							
			
	
}

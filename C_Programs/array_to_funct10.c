//11	wap to accept character and print whether it is vowel or not.

#include<stdio.h>

int main()
{
	char ch;
	
	printf("\n enter character ");
	scanf("%c",&ch);
	
   check_vowel(ch);
	
}

void check_vowel(char c)
{   
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
{
	printf("\n character is vowel");
}
else
{
	printf("\n character is not vowel");
}
    

	
	
	
}

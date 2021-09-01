//6 -repeating above program displaying corrupted value of i and j


union data
{
	int i;
	float j;
	char name[10];
};

int main()
{   
     union data d1;
     printf("print value of memory occupied by data = %dbytes\n",sizeof(d1));

	printf("\n enter value of i=");
	scanf("%d",&d1.i);
	printf(" int value =%d",d1.i);
    printf("\n enter value of j=");
	scanf("%f",&d1.j);
	printf("\n float value =%f",d1.j);
	printf("\n enter name--");
	scanf("%s",&d1.name);
	printf("\n int value =%d",d1.i);     //displaying corrupted value of i 
	printf("\n float value =%f",d1.j);	 //displaying corrupted value of j 	
	printf("\n name-%s",d1.name);
	printf("\n int value =%d",d1.i);     //displaying corrupted value of i 
	printf("\n float value =%f",d1.j);	 //displaying corrupted value of j 

   
	
	
}

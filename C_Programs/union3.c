//4 -example of union displaying corrupted values of i an j  

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

	d1.i=50;
	printf(" int value =%d",d1.i);
		d1.j=50.50;
	printf("\n float value =%f",d1.j);
		strcpy(d1.name,"yash");
	printf("\n name-%s",d1.name);
	printf("\n int value =%d",d1.i);        // union displaying currupted value of i
	printf("\n float value =%f",d1.j);    // union displaying currupted value of j
   
	
	
}

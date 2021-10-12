import java.util.*;

class TestArray7{
	public static void main(String[] arg){

int[] marks=new int[5];

Scanner scan=new Scanner(System.in);

for(int i=0;i<marks.length;i++){
	System.out.println("Enter Subject marks");
	marks[i]=scan.nextInt();
	}
	    Calculate(marks);
}

// calling Calculate method by passing marks to it

static void Calculate(int marks[]){
int total=0;
float per;
for(int i : marks){
      System.out.println("marks = "+i);
      total=total+i;
         }

         System.out.println("Total marks = "+total);

         per=(float) (total/500.0f)*100.0f;
         System.out.println("Percentage = "+per);
}

}

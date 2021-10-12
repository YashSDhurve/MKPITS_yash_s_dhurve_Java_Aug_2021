import java.util.*;

class TestArray4{
	public static void main(String[] arg){
		int[] marks=new int[5];
		int total=0;
		float per;

		Scanner scan=new Scanner(System.in);

		for(int i=0;i<marks.length;i++){
			System.out.println("Enter marks");
			 marks[i] =scan.nextInt();
			}

	//displaying

	   for(int i : marks){
		   System.out.println("Marks = "+i);
		    total= total + i;
	       }

          System.out.println("Total marks = "+total);

          per=(float) (total/500.0f)*100.0f;
          System.out.println("Percentage = "+per);

		}
	}
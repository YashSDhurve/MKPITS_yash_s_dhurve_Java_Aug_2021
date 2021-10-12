import java.util.*;

class TestArray5{
	public static void main(String[] arg){
		int[] marks=new int[5];
		int total=0;
		float per;
		String grade;

		Scanner scan=new Scanner(System.in);

		for(int i=0;i<marks.length;i++){
			System.out.println("Enter marks");
			 marks[i] =scan.nextInt();
			}

	//displaying result

	   for(int i : marks){
		   System.out.println("Marks = "+i);
		    total= total + i;
	       }

          System.out.println("Total marks = "+total);

          per=(float) (total/500.0f)*100.0f;
          System.out.println("Percentage = "+per);

          if(per>=75){
			  System.out.println("Grade : Distinction");
			  }

		else if(per<75 && per>65){
			  System.out.println("Grade : First class");
			  }

		else if(per<65 && per>=35){
			  System.out.println("Grade : Second class");
			  }

		else{
			  System.out.println("Grade : Fail");
			  }


		}

	}
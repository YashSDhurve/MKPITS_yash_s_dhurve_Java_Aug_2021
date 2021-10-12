import java.util.*;

class TestArray3{
	public static void main(String[] arg){

		int[] marks=new int[5];
		int total=0;
		float per;

		Scanner s=new Scanner(System.in);

		//taking marks from th user

		for(int i=0;i<marks.length;i++){
					System.out.println("Enter marks");
		            marks[i] = s.nextInt();
		            }

	 //displaying marks

		for(int i=0;i<marks.length;i++){
					System.out.println("marks = "+marks[i]);
                    total=total+marks[i];
			        }

			        System.out.println("total marks = "+total);

			        per=(float) (total/500.0f)*100.0f;
			        System.out.println("Percentage = "+per);

		}
}
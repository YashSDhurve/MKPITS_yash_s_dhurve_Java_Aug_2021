//6 - wap to accept 5 subject marks and print total , percentage and grade.

import java.util.*;

class IfElse6
  {
   static public void main(String[] arg)
    {
     int s1,s2,s3,s4,s5,total;
     float percentage;
     Scanner s = new Scanner(System.in);
     System.out.println("enter 5 subject marks");
     s1= s.nextInt();
     s2= s.nextInt();
     s3= s.nextInt();
     s4= s.nextInt();
     s5= s.nextInt();

     total=s1+s2+s3+s4+s5;
     System.out.println("total="+total);
     percentage=(float) (total/500.0f) * 100.0f;
      System.out.println("percentage="+percentage);


     if(percentage >= 75 ){
	 		System.out.println("\n grade = distinction");
	 	}
	 	else if(percentage >= 60 && percentage < 75) {
	 	System.out.println("\n grade = first ");
	 	}
	 	else if (percentage >= 45 && percentage <60 ) {
	 	System.out.println("\n grade =second");
	 	}
	 	else
	 	{
	 		System.out.println("\n fail");
	 	}

    }

   }

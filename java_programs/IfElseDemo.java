//The following program, IfElseDemo, assigns a grade based on the value of a
//test score: an A for a score of 90% or above, a B for a score of 80% or above, and so on.

import java.util.*;

class IfElseDemo
{
 public static void main(String[] arg)
 {
  int testscore;

  Scanner s = new Scanner(System.in);
  System.out.println("enter test score");
  testscore= s.nextInt();

  if(testscore>=90)
  {
	  System.out.println("grade=A");
  }
  else   if(testscore>=80)
  {
	  System.out.println("grade=B");
  }
   else  if(testscore>=70)
     {
   	  System.out.println("grade=C");
  }
   else if(testscore>=60)
    {
  	  System.out.println("grade=D");
  }

  else{
	  System.out.println("grade=E");
  }






  }
  }
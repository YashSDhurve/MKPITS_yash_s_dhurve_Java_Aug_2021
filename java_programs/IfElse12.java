//12- Write a java program to check whether a given number is positive or negative

import java.util.*;

class IfElse12
  {
   static public void main(String[] arg)
    {
     int num;

     Scanner s = new Scanner(System.in);

     System.out.println("enter a number");
     num=s.nextInt();



     if(num>0 )
     {
	  System.out.println("given no. is positive no.");
	 }
	 else
	 {
		 System.out.println("given no. is negarive no.");
	 }


    }

   }

//13-Write a java program to find whether a given year is a leap year or not.

import java.util.*;

class IfElse13
  {
   static public void main(String[] arg)
    {
     int year;

     Scanner s = new Scanner(System.in);

     System.out.println("enter a number");
     year=s.nextInt();



     if(year%4==0 )
     {
	  System.out.println("given year is leap year");
	 }
	 else
	 {
		 System.out.println("given year is not a leap year");
	 }


    }

   }

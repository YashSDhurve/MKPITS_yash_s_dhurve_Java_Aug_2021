//11- Write a C program to check whether a given number is even or odd.

import java.util.*;

class IfElse11
  {
   static public void main(String[] arg)
    {
     int num;

     Scanner s = new Scanner(System.in);

     System.out.println("enter a number");
     num=s.nextInt();



     if(num%2==0 )
     {
	  System.out.println("given no. is even no.");
	 }
	 else
	 {
		 System.out.println("given no. is odd no.");
	 }


    }

   }

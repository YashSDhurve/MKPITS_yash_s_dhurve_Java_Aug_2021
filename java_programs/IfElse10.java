//10. Write a java program to accept two integers and check whether they are equal or not.

import java.util.*;

class IfElse10
  {
   static public void main(String[] arg)
    {
     int n1,n2;

     Scanner s = new Scanner(System.in);

     System.out.println("enter 2 no.");
     n1=s.nextInt();
     n2=s.nextInt();


     if(n1-n2==0 )
     {
	  System.out.println("given no. are equal");
	 }
	 else{
		 System.out.println("given no. are not equal");
	 }


    }

   }

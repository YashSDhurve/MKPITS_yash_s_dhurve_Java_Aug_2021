//15-Write a C program to find the largest of three numbers

import java.util.*;

class IfElse15
  {
   static public void main(String[] arg)
    {
     int n1,n2,n3;
     Scanner s = new Scanner(System.in);
     System.out.println("enter 3 no.");
     n1= s.nextInt();
     n2= s.nextInt();
     n3= s.nextInt();

     if(n1>n2 && n1>n3)
     {
     System.out.println("n1 is largest");
     }
else if(n2>n1 && n2>n3)
     {
      System.out.println("n2 is largest");
     }
    else{
	    System.out.println("n3 is largest");
	    }

    }

   }

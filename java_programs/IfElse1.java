//1- wap to accept 2 no. and display the greater no.

import java.util.*;

class IfElse1
  {
   static public void main(String[] arg)
    {
     int n1,n2;
     Scanner s = new Scanner(System.in);
     System.out.println("enter 2 no.");
     n1= s.nextInt();
     n2= s.nextInt();
     
     if(n1>n2)
     {
     System.out.println("n1 is greater");
     }
     else
     {
      System.out.println("n2 is greater");
     }
    }
    
   } 
    
//3 -  wap to accept 2 no and operator like +,- * and display the result.

import java.util.*;

class IfElse3
  {
   static public void main(String[] arg)
    {
     int n1,n2,result;
     char op;
     Scanner s = new Scanner(System.in);
     System.out.println("enter 2 no.");
     n1= s.nextInt();
     n2= s.nextInt();
     System.out.println("enter operator like +,-,* ");
     op= s.next().charAt(0);

     if(op=='+')
        {
		 result=n1+n2;
           System.out.println("result="+result);

       }
     else if(op=='-')
        {
		 result=n1-n2;
         System.out.println("result="+result);

        }
     else if(op=='*')
	      {
	 		 result=n1*n2;
             System.out.println("result="+result);

          }
     else{
	      System.out.println("invalid operator");
	      }
    }

   }

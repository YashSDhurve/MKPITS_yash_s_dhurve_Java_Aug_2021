//5- wap to accept 2 no. and then print addition of 2 no.


import java.util.*;

class Sum
{
  
 public static void main(String[] arg)
  {
   int num1,num2,sum;  
   Scanner s = new Scanner(System.in);
   System.out.println(" enter 2 no.");
   num1 = s.nextInt();
   num2 = s.nextInt();
   sum=num1+num2;
   System.out.println("sum= " + sum);


  }

}
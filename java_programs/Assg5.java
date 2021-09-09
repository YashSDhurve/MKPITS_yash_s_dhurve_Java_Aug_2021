//8- wap to accept 3 subject marks and then print total marks


import java.util.*;

class Totalmarks
{
  
 public static void main(String[] arg)
  {
   int s1,s2,s3,totalmarks;  
   Scanner s = new Scanner(System.in);
   System.out.println(" enter marks of 3 subjects ");
   s1 = s.nextInt();
   s2 = s.nextInt();
   s3 = s.nextInt();
   
   totalmarks=s1+s2+s3;
   System.out.println("total marks = " + totalmarks);


  }

}
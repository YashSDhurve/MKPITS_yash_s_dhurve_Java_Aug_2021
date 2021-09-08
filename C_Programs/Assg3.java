//6- wap to accept length and breadht of rectangle and then print area of rectangle.


import java.util.*;

class Area
{
  
 public static void main(String[] arg)
  {
   int length,breadth,area;  
   Scanner s = new Scanner(System.in);
   System.out.println(" enter length and breadth of rectangle ");
   length = s.nextInt();
   breadth = s.nextInt();
   area=length*breadth;
   System.out.println("area of rectangle = " + area);


  }

}
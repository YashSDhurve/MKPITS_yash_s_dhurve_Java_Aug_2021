//7- wap to accept to length , breadth, height and then print volume


import java.util.*;

class Volume
{
  
 public static void main(String[] arg)
  {
   int length,breadth,height,volume;  
   Scanner s = new Scanner(System.in);
   System.out.println(" enter length,breadth and height of cube ");
   length = s.nextInt();
   breadth = s.nextInt();
   height = s.nextInt();
   
   volume=length*breadth*height;
   System.out.println("volume of cube = " + volume);


  }

}
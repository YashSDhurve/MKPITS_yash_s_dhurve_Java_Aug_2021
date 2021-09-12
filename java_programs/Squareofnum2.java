//3 -wap to accept a number from the user and then print the square of a number.
import java.util.*;
class Squareofnum2
{
 static public void main(String[] arg)
 {
  int num,square;
  Scanner s= new Scanner(System.in);
  System.out.println("enter number");
  num= s.nextInt();
  square=num*num;
  System.out.println("square of number="+square);
 }
}


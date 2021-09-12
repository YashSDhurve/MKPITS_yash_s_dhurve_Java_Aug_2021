//3- wap to accept customer name , productname,productprice and quantity
//and then print customername , productname,price, quantity and totalamount

import java.util.*;

class Productdetails
{
 static public void main(String[] arg)
 {
   String custname;
   String prodname;
   float prodprice;
   int prodqty;
   float total_amount;
   Scanner s = new Scanner(System.in);
   System.out.println("enter customer name");
   custname=s.next();
   System.out.println("enter product name");
   prodname=s.next();
   System.out.println("enter product price");
   prodprice=s.nextFloat();
   System.out.println("enter product quantity");
   prodqty=s.nextInt();

   //displaying product details and total amount

    System.out.println("customer name="+custname);
    System.out.println("product name="+prodname);
    System.out.println("product price="+prodprice);
    System.out.println("product quantity="+prodqty);
    total_amount=(float) (prodprice *prodqty);
     System.out.println("total amount="+total_amount);
    total_amount=s.nextFloat();




   }
   }
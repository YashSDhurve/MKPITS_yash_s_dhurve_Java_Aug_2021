//create a class product and create 2 objects

class Product{

int productId;
String productName;
double productPrice;

            }

 class TestProduct{

 public static void main(String[] arg)
   {
   Product p1 = new Product();
   p1.productId=122;
   p1.productName="mobile";
   p1.productPrice=20000;

   System.out.println("productId="+p1.productId);
   System.out.println("productName="+p1.productName);
   System.out.println("productPrice="+p1.productPrice);

   Product p2 = new Product();
      p2.productId=123;
      p2.productName="laptop";
      p2.productPrice=50000;

      System.out.println("productId="+p2.productId);
      System.out.println("productName="+p2.productName);
      System.out.println("productPrice="+p2.productPrice);
   }

 }

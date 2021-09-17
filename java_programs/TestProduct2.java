//create a class product and initilize it with method.
//Defining a Product class.


class Product{

int productId;
String productName;
double productPrice;

 void insertProduct(int id,String name,double price){
               productId=id;
               productName=name;
               productPrice=price;
		   }
 void displayProduct(){
	System.out.println("product id="+productId);
	System.out.println("product name="+productName);
	System.out.println("product price="+productPrice);
           }

		    }

class TestProduct2{

	public static void main(String[] arg){

		Product p1=new Product();
		p1.insertProduct(1,"pen",50);
		p1.displayProduct();

		Product p2=new Product();
		p2.insertProduct(2,"pencil",20);
		p2.displayProduct();

		Product p3=new Product();
		p3.insertProduct(3,"rubber",10);
		p3.displayProduct();
}

		 }


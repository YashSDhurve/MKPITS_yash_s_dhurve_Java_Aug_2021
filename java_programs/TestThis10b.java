//calling constructor with 2 parameter  using this keyword

class Book{

String title;
String company;
int price;

//creating constructor with 2 parameter

Book(String title,String company,int price){

	System.out.println("invoking constructor with 2 parameter");

this.title=title;
this.company=company;
this.price=price;


}

//creating constructor with one paramter

Book(String title,String company,int price){

this(title,company,price);//this will call constructor with 2 parameter

}

void display(){

System.out.println("title:"+title);
System.out.println("company:"+company);
System.out.println("price="+price);
}

}

class TestThis10b{

public static void main(String[] arg){

Book b= new Book("Ec-II","xyz",230);// this will call constructor with 1 parameter

b.display();
}

}

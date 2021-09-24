//calling constructor with one parameter  using this keyword

class Book{

String title;
String company;
int price;

//creating constructor with no parameter

Book(String title){

System.out.println("invoking constructor with one parameter");

this.title=title;

}

//creating constructor with 2 parameter

Book(String title,String company,int price){

	this(title);//this will call constructor with one parameter

this.company=company;
this.price=price;


}

void display(){

System.out.println("title:"+title);
System.out.println("company:"+company);
System.out.println("price="+price);
}

}

class TestThis10a{

public static void main(String[] arg){

Book b= new Book("Ec-II","xyz",230);// this will call constructor with 2 parameter

b.display();
}

}

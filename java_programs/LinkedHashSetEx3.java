import java.util.*;

class Book{
	int id;
	String name;
	int quantity;
	float price;

	Book(int id,String name,int quantity,float price){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		}
	}

class LinkedHashSetEx3{
public static void main(String[] arg){

	Book b1=new Book(23,"abc",57,230.54f);
	Book b2=new Book(21,"abcdef",17,530.54f);

LinkedHashSet<Book> lhs=new LinkedHashSet<Book>();

lhs.add(b1);
lhs.add(b2);

System.out.println("Book details:-");

for(Book b:lhs){
	System.out.println("Book id = "+b.id);
	System.out.println("Book name : "+b.name);
	System.out.println("Book quantity = "+b.quantity);
	System.out.println("Book price = "+b.price);

	System.out.println("-------------------");
	}




}
}
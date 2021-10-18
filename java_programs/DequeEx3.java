import java.util.*;

class Book{
	int id;
	String name;

	Book(int id,String name){
		this.id=id;
		this.name=name;
		}
	}

class DequeEx3{
	public static void main(String[] arg){

		Book b1=new Book(1,"java");

		ArrayDeque<Book> ad = new ArrayDeque<Book>();

		ad.add(b1);

        for(Book b:ad)
		System.out.println(b.id+" "+b.name);

}}
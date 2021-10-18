import java.util.*;
import java.io.*;

class Book{
	int bookId;
	String name,author;
	int quantity;

	Book(int bookId,String name,String author,int quantity){
		this.bookId=bookId;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
		}
	}

class HashSetEx5{
public static void main(String[] arg){

	Book b1=new Book(23,"abc","cde",5);
	Book b2=new Book(3,"abcd","cdef",57);
	Book b3=new Book(2,"abcde","cdefg",15);

HashSet<Book> hs=new HashSet<Book>();

hs.add(b1);
hs.add(b2);
hs.add(b3);

for(Book b:hs){
	System.out.println(b.bookId+" "+b.name+" "+b.author+" "+b.quantity);
	}



}
}
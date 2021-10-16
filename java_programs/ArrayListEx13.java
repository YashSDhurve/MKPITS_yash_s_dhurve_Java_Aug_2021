 import java.util.*;

  class Book{
	 int id;
	 String name;
	 int quantity;

	 Book(int id,String name,int quantity){
		 this.id=id;
		 this.name=name;
		 this.quantity=quantity;
		 }
	 }


    class ArrayListEx13{

     public static void main(String args[]){

		 List<Book> listOfBook=new ArrayList<Book>();        //creating list of book

		 //creating  books

		 Book b1=new Book(1,"java",30);
		 Book b2=new Book(65,"Oracle",40);
		 Book b3=new Book(5,"c/c++",10);

		//adding book to the list

		listOfBook.add(b1);
		listOfBook.add(b2);
		listOfBook.add(b3);

		//displaying list of books

		for(Book b : listOfBook){
			System.out.println(b.id+" "+b.name+" "+b.quantity);
			}










  }}
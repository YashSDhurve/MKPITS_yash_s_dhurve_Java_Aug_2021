    import java.util.*;
    class Book {
    int id;
    String name;
    int quantity;
    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    }


    class LinkedListEx5{

     public static void main(String args[]){

		        List<Book> list=new LinkedList<Book>();

		        Book b1=new Book(101,"Let us C",8);
		        Book b2=new Book(102,"Data Communications & Networking",4);

		        list.add(b1);
		        list.add(b2);

		        for(Book b:list){
		        System.out.println(b.id+" "+b.name+" "+b.quantity);
		        }
		    }
		    }

import java.util.*;

    class Book implements Comparable<Book>{
    int id;
    String name,author;
    int quantity;
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
        return 0;
        }
    }
    }


class PriorityQueueEx2{
	public static void main(String[] arg){

		 Book b1=new Book(121,"Let us C","Yashwant Kanetkar",8);
        Book b2=new Book(233,"Operating System","Galvin",6);

        Queue<Book> queue=new PriorityQueue<Book>();

        queue.add(b1);
        queue.add(b2);

        System.out.println("Traversing the queue elements:");

        for(Book b:queue){
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
        }

        queue.remove();

        System.out.println("After removing one book record:");

        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
            }







 }}
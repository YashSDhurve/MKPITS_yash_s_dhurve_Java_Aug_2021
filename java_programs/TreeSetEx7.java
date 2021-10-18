import java.util.*;

    class Book implements Comparable<Book>{
    int id;
    String name;
    int quantity;

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
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

    public class TreeSetEx7 {
    public static void main(String[] args) {

        TreeSet<Book> ts=new TreeSet<Book>();

        Book b1=new Book(121,"Let us C",8);
        Book b2=new Book(233,"Operating System",6);
        Book b3=new Book(101,"Data Communications & Networking",4);

        ts.add(b1);
        ts.add(b2);
        ts.add(b3);

        for(Book b:ts){
        System.out.println(b.id+" "+b.name+" "+b.quantity);
        }
    }
    }

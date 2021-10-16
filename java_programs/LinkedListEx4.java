 import java.util.*;

    class LinkedListEx4{

     public static void main(String args[]){

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ajay");
		ll.add("Vijay");
		ll.add("Sanjay");
		ll.add("jayesh");

	System.out.println(ll);

    Iterator itr=ll.descendingIterator();

    while(itr.hasNext()){
		System.out.println(itr.next());
		}









  }}
 import java.util.*;

    class LinkedListEx3{

     public static void main(String args[]){

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ajay");
		ll.add("Vijay");
		ll.add("Sanjay");
		ll.add("jayesh");

	System.out.println(ll);

	ll.remove("Vijay");

	System.out.println(ll);

			LinkedList<String> ll2=new LinkedList<String>();

		ll2.add("Vijay");
		ll2.add("raj");

	System.out.println(ll2);

	ll.addAll(ll2);

	System.out.println(ll);

	ll.remove(3);

	System.out.println(ll);

	ll.removeFirst();

	System.out.println(ll);

		ll.removeLast();

	System.out.println(ll);

	ll.removeFirstOccurrence("Vijay");

	System.out.println(ll);

		ll.removeLastOccurrence("jayesh");

	System.out.println(ll);

		ll.clear();

	System.out.println(ll);










  }}
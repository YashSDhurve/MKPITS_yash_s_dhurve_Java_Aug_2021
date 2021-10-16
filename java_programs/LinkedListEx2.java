 import java.util.*;

    class LinkedListEx2{

     public static void main(String args[]){

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ajay");
		ll.add("Vijay");
		ll.add("Sanjay");
		ll.add("jayesh");

	System.out.println(ll);

	LinkedList<String>ll2=new LinkedList<String>();

	ll2.add("mangesh");
	ll2.add("Suresh");

   System.out.println(ll2);

   ll.addAll(ll2);

   System.out.println(ll);

 ll.add(3,"Swapnil");

  System.out.println(ll);

  	LinkedList<String>ll3=new LinkedList<String>();

  	ll3.add("mangesh");
  	ll3.add("Suresh");

     System.out.println(ll3);

   ll.addAll(ll3);

System.out.println(ll);

ll.addFirst("Yash");
ll.addLast("Zakir");

System.out.println(ll);









  }}
 import java.util.*;

    class LinkedListEx1{

     public static void main(String args[]){

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ajay");
		ll.add("Vijay");
		ll.add("Sanjay");
		ll.add("jayesh");

Iterator<String> itr= ll.iterator();

while(itr.hasNext()){
	System.out.println(itr.next());
	}








  }}
import java.util.*;

class PriorityQueueEx1{
	public static void main(String[] arg){

		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("ajay");
		pq.add("sanjay");
		pq.add("abhishek");
		pq.add("vijay");
		pq.add("jay");
		pq.add("jaya");

        System.out.println("head : "+pq.element());
        System.out.println("head : "+pq.peek());

    System.out.println("After iterating :- ");

    Iterator<String> itr=pq.iterator();

    while(itr.hasNext()){
		System.out.println(itr.next());
		}

		pq.remove();

		pq.poll();

		  System.out.println("after removing 2 elements ");


          Iterator<String> itr2=pq.iterator();

	      while(itr2.hasNext()){
	  		System.out.println(itr2.next());
		}






 }}
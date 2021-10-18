import java.util.*;

class DequeEx2{
	public static void main(String[] arg){
		ArrayDeque<String> d = new ArrayDeque<String>();

		d.add("ajay");
		d.add("vijay");
		d.offer("sanjay");
		d.offer("raj");
		d.add("yash");
		d.offer("mahesh");

			System.out.println(d);

		d.offerFirst("rajesh");

     System.out.println(d);

     d.pollLast();

     System.out.println(d);

		}
	}
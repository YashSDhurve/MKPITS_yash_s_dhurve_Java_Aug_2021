import java.util.*;

class DequeEx1{
	public static void main(String[] arg){
		ArrayDeque<String> d = new ArrayDeque<String>();

		d.add("ajay");
		d.add("vijay");
		d.offer("sanjay");
		d.offer("raj");
		d.add("yash");
		d.offer("mahesh");

		Iterator<String> itr=d.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
			}

		}
	}
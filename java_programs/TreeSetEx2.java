import java.util.*;

class TreeSetEx2{
public static void main(String[] arg){

TreeSet<String> ts=new TreeSet<String>();

ts.add("ajay");
ts.add("vijay");
ts.add("sanjay");
ts.add("jayesh");
ts.add("jay");

Iterator<String> itr=ts.descendingIterator();

while(itr.hasNext()){
	System.out.println(itr.next());
	}




}
}
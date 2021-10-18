import java.util.*;

class TreeSetEx3{
public static void main(String[] arg){

TreeSet<Integer> ts=new TreeSet<Integer>();

ts.add(12);
ts.add(34);
ts.add(76);
ts.add(89);
ts.add(11);


	System.out.println("Highest value = "+ts.pollFirst());
	System.out.println("Lowest value = "+ts.pollLast());





}
}
import java.util.*;

class HashSetEx4{
public static void main(String[] arg){

ArrayList<String> al=new ArrayList<String>();

al.add("one");
al.add("two");
al.add("three");
al.add("four");
al.add("five");

HashSet<String> hs=new HashSet<String>(al);

hs.add("ten");

Iterator<String> itr=hs.iterator();

while(itr.hasNext()){
	System.out.println(itr.next());
	}



}
}
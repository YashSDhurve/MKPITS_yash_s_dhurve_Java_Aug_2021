import java.util.*;

class LinkedHashSetEx2{
public static void main(String[] arg){

LinkedHashSet<String> lhs=new LinkedHashSet<String>();

lhs.add("one");
lhs.add("two");
lhs.add("three");
lhs.add("four");
lhs.add("five");
lhs.add("one");

Iterator<String> itr=lhs.iterator();

while(itr.hasNext()){
	System.out.println(itr.next());
	}




}
}
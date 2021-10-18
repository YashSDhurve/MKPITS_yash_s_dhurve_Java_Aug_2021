import java.util.*;

class HashSetEx2{
public static void main(String[] arg){

//creating HashSet and adding elements to it

HashSet<String> hs=new HashSet<String>();

hs.add("one");
hs.add("two");
hs.add("three");
hs.add("four");
hs.add("five");
hs.add("two");

Iterator<String> itr=hs.iterator();

while(itr.hasNext()){
System.out.println(itr.next());
}










}
}
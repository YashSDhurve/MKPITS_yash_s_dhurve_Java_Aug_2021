import java.util.*;

class HashSetEx3{
public static void main(String[] arg){

//creating HashSet and adding elements to it

HashSet<String> hs=new HashSet<String>();

hs.add("one");
hs.add("two");
hs.add("three");
hs.add("four");
hs.add("five");

System.out.println(hs);

hs.remove("three");

System.out.println(hs);

HashSet<String> hs2=new HashSet<String>();

hs2.add("six");
hs2.add("seven");

System.out.println(hs2);

hs.addAll(hs2);

System.out.println(hs);

hs.removeAll(hs2);

System.out.println(hs);

hs.removeIf(str->str.contains("one"));

System.out.println(hs);

hs.clear();

System.out.println(hs);




}
}
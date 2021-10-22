import java.util.*;

class HashMapEx4{
public static void main(String[] arg){

Map<Integer,String> hm =new HashMap<Integer,String>();

hm.put(243,"raj");
hm.put(54,"rajesh");
hm.put(898,"raju");
hm.put(234,"rajan");

hm.entrySet()
.stream()
.sorted(Map.Entry.comparingByValue())
.forEach(System.out::println);




}
}
import java.util.*;

class HashMapEx2{
public static void main(String[] arg){

Map<Integer,String> hm =new HashMap<Integer,String>();

hm.put(243,"raj");
hm.put(54,"rajesh");
hm.put(898,"raju");
hm.put(234,"rajan");
hm.put(120,"rakesh");
hm.put(890,"ram");

for(Map.Entry m:hm.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
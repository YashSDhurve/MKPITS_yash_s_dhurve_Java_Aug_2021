import java.util.*;

class HashMapEx1{
public static void main(String[] arg){

Map<Integer,String> hm= new HashMap<Integer,String>();

hm.put(1,"ajay");
hm.put(2,"vijay");
hm.put(3,"sanjay");
hm.put(4,"jay");
hm.put(5,"ajaya");
hm.put(6,"jayesh");

for(Map.Entry m : hm.entrySet()){
System.out.println(m.getKey()+ " : "+m.getValue());
}

}
}
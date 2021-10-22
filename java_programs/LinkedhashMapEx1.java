import java.util.*;

class LinkedhashMapEx1{
public static void main(String[] arg){

LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();

lhm.put(123,"ajay");
lhm.put(124,"vijay");
lhm.put(12,"jay");
lhm.put(126,"sanjay");
lhm.put(127,"jaya");

for(Map.Entry m : lhm.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}





}
}
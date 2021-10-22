import java.util.*;

class HashMapEx6{
public static void main(String[] arg){

Map<Integer,String> batch =new HashMap<Integer,String>();

batch.put(2017,"raju");
batch.put(2018,"shyam");
batch.put(2019,"baburao");
batch.put(2020,"kabira");

batch.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);



}
}
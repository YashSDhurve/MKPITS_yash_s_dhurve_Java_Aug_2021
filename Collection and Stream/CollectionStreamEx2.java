import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamEx2 {
    public static void main(String arg[]){
        ArrayList<Integer> obj1=new ArrayList<Integer>();
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        obj1.add(12);
        obj1.add(23);
        obj1.add(5);
        obj1.add(72);
        obj1.add(78);
        obj1.add(65);
        obj1.add(1);

        System.out.println(obj1);

//        for (int i:obj1) {
//            if(i%2==0){
//                obj2.add(i);
//            }
//        }
//
//        System.out.println(obj2);

        List<Integer> evenNumbers= obj1.stream().filter(m->m%2==0).collect(Collectors.toList());

        System.out.println(evenNumbers);

    }
}

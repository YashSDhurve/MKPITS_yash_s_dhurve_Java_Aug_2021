import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamEx3 {
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

//        List<Integer> evenNumbers= obj1.stream().filter(m->m%2==0).collect(Collectors.toList());
//
//        System.out.println(evenNumbers);

                for (int i:obj1) {
          obj2.add(i+5);
        }

        System.out.println(obj2);

        List<Integer> numbers= obj1.stream().map(m->m+3).collect(Collectors.toList());

        System.out.println(numbers);

        //Instead of sout we can also use this

        obj1.stream().forEach(System.out::print);

    }
}

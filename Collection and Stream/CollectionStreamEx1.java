import java.util.ArrayList;

public class CollectionStreamEx1 {
    public static void main(String arg[]){
        ArrayList<Integer> obj1=new ArrayList<Integer>();
        obj1.add(12);
        obj1.add(23);
        obj1.add(5);
        obj1.add(72);
        obj1.add(78);
        obj1.add(65);
        obj1.add(1);

        System.out.println(obj1);

        ArrayList<Integer> obj2=new ArrayList<Integer>();

        for (int i:obj1) {
           if(i%2==0){
               obj2.add(i);
           }
        }

        System.out.println(obj2);

    }
}

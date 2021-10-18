import java.util.*;

class TreeSetEx4{
public static void main(String[] arg){

TreeSet<Character> ts=new TreeSet<Character>();

ts.add('a');
ts.add('b');
ts.add('c');
ts.add('d');
ts.add('e');


	System.out.println("intial set : "+ts);

		System.out.println("reverse set : "+ts.descendingSet());

			System.out.println("head set : "+ts.headSet('c',true));

            	System.out.println("tail set : "+ts.tailSet('d',false));

           System.out.println("head set : "+ts.subSet('a',false,'c',true));



}
}
import java.util.*;

class ArrayListEx6{
	public static void main(String[] arg){

ArrayList<String> al=new ArrayList<String>();

//adding object to ArrayList

al.add("pen");
al.add("pencil");
al.add("Eraser");
al.add("Ruler");
al.add("Calculator");

al.get(1);

System.out.println("Returning element :"+al.get(1));    //it will return the 2nd element, because index starts from 0

al.set(2,"highlighter");               //it will replace the eraser with highlighter

//traversing list through for each loop

Collections.sort(al);

for(String stationary : al){
	System.out.println(stationary);
	}

	List<Integer> al2=new ArrayList<Integer>();

	al2.add(8);
	al2.add(38);
	al2.add(18);
	al2.add(81);
	al2.add(85);

	Collections.sort(al2);

	System.out.println("Sorting Numbers using Iterator");

	Iterator itr=al2.iterator();

	while(itr.hasNext()){
		System.out.println(itr.next());
		}




}}
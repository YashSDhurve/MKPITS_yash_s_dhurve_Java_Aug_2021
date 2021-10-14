import java.util.*;

class ArrayListEx7{
	public static void main(String[] arg){

ArrayList<String> al=new ArrayList<String>();

//adding object to ArrayList

al.add("pen");
al.add("pencil");
al.add("Eraser");
al.add("Ruler");
al.add("Calculator");

 System.out.println("traversing list through for each loop");    //traversing list through for each loop

for(String stationary : al){
	System.out.println(stationary);
	}


 System.out.println("traversing list through Iterator");    //traversing list through iterator

	Iterator itr=al.iterator();

	while(itr.hasNext()){
		System.out.println(itr.next());
		}

		 System.out.println("traversing list through list Iterator");    //traversing list through list iterator

			ListIterator<String> Litr=al.listIterator(al.size());

			while(Litr.hasPrevious()){
				String str=Litr.previous();
				System.out.println(str);
		}

 System.out.println("traversing list through for loop");    //traversing list through for loop

for(int i=0;i<al.size();i++){
	System.out.println(al.get(i));
	}



}}
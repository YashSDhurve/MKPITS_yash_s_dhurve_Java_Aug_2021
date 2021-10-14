import java.util.*;

class ArrayListEx2{
	public static void main(String[] arg){

		ArrayList<String> al=new ArrayList<String>();    //Creating arraylist

		//Adding object in arraylist

		al.add("Apple");
		al.add("Mango");
		al.add("Grapes");
		al.add("Watermelon");

//Traversing list through Iterator

Iterator itr=al.iterator();

while(itr.hasNext()){
	System.out.println("Fruits : "+itr.next());
	}



	}}
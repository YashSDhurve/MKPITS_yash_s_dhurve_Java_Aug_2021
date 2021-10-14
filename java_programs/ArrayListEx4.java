import java.util.*;

class ArrayListEx4{
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

for(String stationary : al){
	System.out.println(stationary);
	}




}}
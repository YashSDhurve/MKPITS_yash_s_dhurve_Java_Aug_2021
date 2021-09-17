//Program of counter by static variable

class Counter1{

static int count=0;             //static variable

Counter1(){

count++;

System.out.println("count="+count);

}

//creating objects of instance variable

public static void main(String[] arg){

Counter1 c1= new Counter1();
Counter1 c2= new Counter1();
Counter1 c3= new Counter1();

}

}

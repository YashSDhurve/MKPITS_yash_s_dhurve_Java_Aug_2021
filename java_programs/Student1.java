//Example of static method

class Student1{

int rno;
String name;
static String college="kdk";

//static method to change college name

static void change(){

college=" ghrc";

}

Student1(int r,String n){

rno=r;
name=n;

}

void display(){

System.out.println(rno+""+name+""+college);

}

}
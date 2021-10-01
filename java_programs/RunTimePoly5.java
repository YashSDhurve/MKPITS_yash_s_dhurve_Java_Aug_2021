class Shape{

void draw(){
System.out.println("drawing.........");
}
}

class Rectangle extends Shape{

void draw(){
System.out.println("drawing rectangle.........");
}
}

class Triangle extends Shape{

void draw(){
System.out.println("drawing Triangle.........");
}
}

class RunTimePoly5{

public static void main(String[] arg){

Shape s;

s=new Rectangle();
s.draw();
s=new Triangle();
s.draw();
}
}
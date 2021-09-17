class Book{

String title;
float price;
int availability;

Book(String title,float price,int availability){

this.title=title;
this.price=price;
this.availability=availability;
}

void display(){

System.out.println("title:"+title);
System.out.println("price="+price);
System.out.println("title:"+availability);
}

}

class TestThis3{

public static void main(String[] arg){

Book b1=new Book("oracle",230.80f,3);
Book b2=new Book("java",300.80f,4);

b1.display();
b2.display();
}

}
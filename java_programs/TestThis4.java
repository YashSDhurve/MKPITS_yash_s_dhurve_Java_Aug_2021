class Book{

String title;
float price;
int availability;

void insert (String title,float price,int availability){

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

class TestThis4{

public static void main(String[] arg){

Book b1=new Book();
Book b2=new Book();

b1.insert("oracle",230.80f,3);
b1.display();

b2.insert("java",300.80f,4);
b2.display();
}

}
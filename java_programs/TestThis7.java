class Book{
String title;
int price;
void insert(String title,int price){

this.title=title;
this.price=price;

this.display();

}

void display(){

System.out.println(title+""+price);

}
}

class TestThis7{

public static void main(String[] arg){

Book b = new Book();

b.insert("java",300);

}
}

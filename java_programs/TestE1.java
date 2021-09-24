//create a class Book having private fields title and author and methods(setter and getter methods) setTitle(),setAuthor and
//getTitle() and getAuthor();

class Book{

private String title;
private String Author;

public void setTitle(String title){

this.title=title;

}

public String getTitle(){

return title;

}

public void setAuthor(String Author){

this.Author=Author;

}

public String getAuthor(){

return Author;

}

}

class TestE1{

public static void main(String[] arg){

Book b=new Book();

 b.setTitle("java");
System.out.println("Title of the Book is "+b.getTitle());

 b.setAuthor("Tony Stark");
System.out.println("Author of the Book is "+b.getAuthor());

}

}
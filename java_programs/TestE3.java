//1- It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only,
//you can write the logic inside the setter method.
//You can write the logic not to store the negative numbers in the setter methods.

class Book{

private int id;
private String title;
private String author;

public void setId(int id){

if(id>0){
           this.id=id;
          }
      else{
       System.out.println("the id must be a positive number ");
          }

          }

public int getId(){

     return id;

     }

public void setTitle(String title){

	this.title=title;

}

public String getTitle(){

     return title;

     }

     public void setAuthor(String author){

	 	this.author=author;

	 }

	 public String getAuthor(){

	      return author;

     }



     }

     class TestE3{

     public static void main(String[] arg){

     Book b=new Book();

     b.setId(-99);
     System.out.println("Book id = "+b.getId());

     b.setTitle("Java");
     System.out.println("Book Title = "+b.getTitle());

     b.setAuthor("Tony Stark");
     System.out.println("Book Author = "+b.getAuthor());

     }

     }
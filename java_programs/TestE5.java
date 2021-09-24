//Read-Only class
///create a readonly class Book  having getter methods

class Book{

	private int id=1234;
	private String title="java";

	public int getId(){

		return id;

	}

		public String getTitle(){

			return title;

	}

}

class TestE5{

	public static void main(String[] arg){

		Book b = new Book();

		System.out.println("book id ="+b.getId());

		System.out.println("book Title ="+b.getTitle());
	}

}


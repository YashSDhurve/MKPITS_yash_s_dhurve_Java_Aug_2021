//write only class

class Book
{
	private int id;
	private String title;


	public void setId(int id) {
		this.id=id;
	}

		public void setTitle(String title) {
		this.title=title;
	}
	public void display() {
		System.out.println("id of the book is " + id);
		System.out.println("title of the book is " + title);
	}

}


class TestE8
{
	public static void main(String[] arg) {
		Book t=new Book();
		t.setId(11);

		t.setTitle("java");

		t.display();

	}

}

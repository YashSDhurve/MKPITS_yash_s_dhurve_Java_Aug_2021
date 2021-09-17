//In this example, we have created the constructor of Student class
//that have two parameters. We can have any number of parameters in the constructor.

 class Student3{
               int id;
               String name;

      Student3(int i,String n){
		  id=i;
		  name=n;
	           }

    void display(){
              System.out.println(id+""+name);
                  }

   public static void main(String[] arg){

                 Student3 s1 = new Student3(123,"yash");
                 Student3 s2 = new Student3(124,"zakir");

                 s1.display();
                 s2.display();
                              }
			}

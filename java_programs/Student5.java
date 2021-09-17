//In this example, we have created the constructor of Student class
//that have two parameters. We can have any number of parameters in the constructor.

 class Student5{
               int id;
               String name;
               int age;

	           Student5(int i,String n,int ag){
		  id=i;
		  name=n;
		  age=ag;
	           }

	           Student5(Student5 s){

				   id=s.id;
				   name=s.name;
				   age=s.age;
			   }

    void display(){
              System.out.println(id+""+name+""+age);
                  }

   public static void main(String[] arg){

	   Student5 s1 = new Student5(262,"Yash",22);
	   s1.display();
	   Student5 s2 = new Student5(s1);
	   s2.display();
                  }


			}

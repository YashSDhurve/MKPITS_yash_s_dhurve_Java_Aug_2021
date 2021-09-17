

 class Student6{
               int id;
               String name;
               int age;

	           Student6(int i,String n,int ag){
		  id=i;
		  name=n;
		  age=ag;
	           }

	           Student6(){        }

    void display(){
              System.out.println(id+""+name+""+age);
                  }

   public static void main(String[] arg){

	   Student6 s1 = new Student6(262,"Yash",22);
	   s1.display();
	   Student6 s2 = new Student6();
	   s2.id=s1.id;
	   s2.name=s1.name;
	   s2.age=s1.age;
	   s2.display();


                  }


			}

//In this example, we have created the constructor of Student class
//that have two parameters. We can have any number of parameters in the constructor.

 class Student4{
               int id;
               String name;
               int age;

      Student4(int i){
		  id=i;
	           }
	           Student4(int i,String n){
			   		  id=i;
			   		  name=n;
	           }Student4(int i,String n,int ag){
		  id=i;
		  name=n;
		  age=ag;
	           }

    void display(){
              System.out.println(id+""+name+""+age);
                  }

   public static void main(String[] arg){

                 Student4 s1 = new Student4(123);
                 Student4 s2 = new Student4(124,"zakir");
                 Student4 s3= new Student4(124,"zakir",25);


                 s1.display();
                 s2.display();
                 s3.display();
                              }
			}

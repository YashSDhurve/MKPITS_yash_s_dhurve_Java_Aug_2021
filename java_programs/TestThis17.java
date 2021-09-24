//Application of this that can be passed as an argument:

//In event handling (or) in a situation where we have to provide reference of a class to another one.
//It is used to reuse one object in many methods.
//5) this: to pass as argument in the constructor call

//We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. Let's see the example:

    class B{
     TestThis17 obj;
      B(TestThis17 obj){
        this.obj=obj;
      }
      void display(){
        System.out.println(obj.data);
      }
    }

    class TestThis17{
      int data=50;
      TestThis17(){
       B b=new B(this);
       b.display();
      }
      public static void main(String args[]){
       TestThis17 a=new TestThis17();
      }
    }


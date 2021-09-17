//In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.

class Bike1{

      Bike1()
      {
      System.out.println("bike is created");
      }
      
      //main method
      
      public static void main(String[] arg)
      {
      Bike1 b = new Bike1();
      }
      
      }
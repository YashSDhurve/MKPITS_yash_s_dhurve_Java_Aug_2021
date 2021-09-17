//1-wap to create a class Car having fields modelno, color, make and methods start,stop .

class Car{

String modal;
String color;

public void start(){

                   System.out.println("car is started");
                   }
public void stop(){

                   System.out.println("car is stopped");
                   }

           }

class UsingCar{

      public static void main(String[] arg)
      {
      Car c = new Car();

      c.modal="verna";
      c.color="white";

      System.out.println("car modal=" + c.modal);
      System.out.println("car color=" + c.color);
      c.start();
     c.stop();
      }

      }
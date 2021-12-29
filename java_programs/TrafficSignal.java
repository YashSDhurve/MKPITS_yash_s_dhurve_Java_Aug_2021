
class red extends Thread {
    public void run() {
        System.out.println(" RED " );
        try {
            Thread.sleep(10000);
             } catch (Exception e) {
            System.out.println(e);
         }
//        r.suspend();
      }
   }

class yellow extends Thread{
    public void run(){
        try {
            join(10_000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" YELLOW ");

    }
}

class green extends Thread{
    public void run(){
        try {
            join(20_000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" GREEN ");
    }
}

public class TrafficSignal {
    public static void main(String[] arg){
        red r=new red();
        yellow y=new yellow();
        green g=new green();
            r.start();
            y.start();
            g.start();
    }


}

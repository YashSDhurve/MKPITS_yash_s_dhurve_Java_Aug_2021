class daeomon extends Thread{
    public void run(){
        for(int i=0;i<=2;i++) {
            System.out.println(" hello from " + getName()+ ""+isDaemon());
        }
    }
}


public class ThreadEx5 {
    public  static void main(String[] arg){
        daeomon dob1=new daeomon();
        daeomon dob2=new daeomon();
        daeomon dob3=new daeomon();
        dob1.start();
        dob2.setDaemon(true);
        dob2.start();
        dob3.start();
    }
}

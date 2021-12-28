class th2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread " + i + " " + getName());
        }
    }
}

class th3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread " + i + " " + getName());
        }
    }
}

class ThreadEx2{
    public static void main(String[] arg) {
        th2 ob1 = new th2();
        th3 ob2 = new th3();
        ob1.start();
        ob2.start();

    }
}
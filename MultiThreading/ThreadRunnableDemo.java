class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am a Thread 1 not a Threat 1");
    }

}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a Thread 2 not a Threat 2");
    }

}

public class ThreadRunnableDemo {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

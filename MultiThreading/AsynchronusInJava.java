package MultiThreading;

class MyThreadClass implements  Runnable{
    @Override
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()  + " Is Running!!!! " + i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Exception = "+e.getMessage());
        }
    }
}

public class AsynchronusInJava {
    public static void main(String[] args){
        System.out.println("Asynchronus example using Multithreading");

        MyThreadClass runnable = new MyThreadClass();

        Thread t1 =new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Exception = "+e.getMessage());
        }


    }
}

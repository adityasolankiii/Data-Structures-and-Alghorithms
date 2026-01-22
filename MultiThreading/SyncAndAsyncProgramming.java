package MultiThreading;

class Counter{
    private int counter = 0;
    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}

public class SyncAndAsyncProgramming {

    //add
    public static void add(int a,int b){
        System.out.println("Addition of two numbers = "+(a+b));
    }

    //sub
    public static void sub(int a,int b){
        System.out.println("Subtraction of two numbers = "+(a-b));
    }

    //mul
    public static void mul(int a,int b){
        System.out.println("Multiplication of two numbers = "+(a*b));
    }

    public static void main(String[] args){

        //creating counter class object
        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

       try {
           t1.join();
           t2.join();
       }catch (InterruptedException e){
           System.out.println("Exception = "+e.getMessage());
       }
        System.out.println("Total Counter = "+counter.getCounter());



//        Synchronus example

        add(1,2);
        sub(3,4);
        mul(5,6);


    }
}

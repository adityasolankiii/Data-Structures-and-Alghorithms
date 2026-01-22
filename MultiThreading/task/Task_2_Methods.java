package MultiThreading.task;

public class Task_2_Methods {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Class1Thread obj1 = new Class1Thread(resource);
        Class2Thread obj2 = new Class2Thread(resource);

        obj1.start();
        obj2.start();

        obj2.join();
        obj1.interrupt();

        System.out.println("Main thread finished.");
    }
}

/**
 * This is a SharedResource class
 */
class SharedResource {
    private int count = 0;

    /**
     * This is an increment Method
     * increment the count
     */
    public synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
        notifyAll();
    }

    /**
     * This is a waitForCount Method
     * Thread wait if count is lesser than the target
     * @param target
     * @throws InterruptedException
     */
    public synchronized void waitForCount(int target) throws InterruptedException {
        while (count < target) {
            wait();
        }
    }
}

/**
 * This is Class1Thread Class
 */
class Class1Thread extends Thread {
    private final SharedResource resource;

    public Class1Thread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            resource.waitForCount(5);
            System.out.println("Class1Thread finished waiting.");
        } catch (InterruptedException e) {
            System.out.println("Class1Thread interrupted");
        }
    }
}

/**
 * This is a Class2Thread class
 */
class Class2Thread extends Thread {
    private final SharedResource resource;

    public Class2Thread(SharedResource resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Class2Thread interrupted");
                return;
            }
            Thread.yield();
        }
    }
}
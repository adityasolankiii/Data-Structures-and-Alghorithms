package MultiThreading.task;

import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Task_2_FileHandling {

    /**
     * Main Method
     *
     * @param args -
     */
    public static void main(String[] args) {
        // Reading and writing from file using multiple thread
        String firstFile = "C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\Tasks\\Session_3_Tasks\\Files\\firstFile.txt";
        String secondFile = "C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\Tasks\\Session_3_Tasks\\Files\\secondFile.txt";
        String resultFile = "C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\Tasks\\Session_3_Tasks\\Files\\resultFile.txt";


        Thread Thread1 = new Thread(new Reader(firstFile, resultFile), "Thread-1");
        Thread Thread2 = new Thread(new Reader(secondFile, resultFile), "Thread-2");
        Thread1.start();
        Thread2.start();

        /* try{
            Thread1.join();
            Thread2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */
    }
}

class Reader implements Runnable {
    private final String filePath;
    private final String resultFile;
    private final Lock lock = new ReentrantLock();

    /**
     * reader method to read files
     *
     * @param filePath -
     */
    public Reader(String filePath, String resultFile) {
        this.filePath = filePath;
        this.resultFile = resultFile;
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile, true));
            String line;
            while ((line = reader.readLine()) != null) {
                lock.lock();
                try {
                    System.out.println(line);
                    // write to result file
                    writer.write(line);
                    writer.newLine();
                    writer.flush();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    lock.unlock();
                }
            }

        } catch (IOException ie) {
            System.out.println("IOException : " + ie.getMessage());
        }
    }
}
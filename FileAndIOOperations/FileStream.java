package FileAndIOOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo\\FileDemo.txt";
        String outputFile = "C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo\\FileDemo2.txt";

        try{
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);

            int content;
            while((content = fis.read()) != -1){
                fos.write(content);
            }

            System.out.println("File Copied Successfully!");

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

package FileAndIOOperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoriesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo");
        try {
            //Create a new directory

            //method - 1
            Files.createDirectories(path);
            System.out.println("Directory created successfully!");

            //method - 2
            String dirName = "C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo2";
            File dir = new File(dirName);
            dir.mkdir();

            //Delete a new directory
            /*Files.delete(path);
            System.out.println("Directory deleted successfully!");*/
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

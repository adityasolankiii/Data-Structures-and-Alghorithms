package FileAndIOOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHanding {
    public static void main(String[] args) {

        try {
            //Create new file
            File myFile = new File("C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo\\FileDemo.txt");
            File myFile2 = new File("C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo\\FileDemo2.txt");

            if(myFile.createNewFile() && myFile2.createNewFile()){
                System.out.println(myFile.getName()+" created!");
                System.out.println(myFile2.getName()+" created!");
            } else {
                System.out.println("Failed to create new file!");
            }

            //Write to a file
            FileWriter writer = new FileWriter("C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo\\FileDemo.txt");
            writer.write("Hello from File writer" +
                    "\n" +
                    "This is file handling demo using JAVA");
            writer.close();

            //Read a file
            Scanner reader = new Scanner(myFile);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            //Delete a File
            /*if(myFile.delete()){
                System.out.println(myFile.getName()+" deleted!");
            } else {
                System.out.println("Failed to delete the file.");
            }*/

        } catch (FileNotFoundException fileEx) {
            System.out.println(fileEx.getMessage());
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
    }
}
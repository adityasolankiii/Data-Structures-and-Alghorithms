package FileAndIOOperations;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\TJAVA09\\IdeaProjects\\KnovosTraining\\src\\KnovosTraining\\FileAndIOOperations\\DirectoriesDemo");

        //List files
        String[] paths;
        try{

            //array of files and directories
            paths = dir.list();
            System.out.println("File List : ");
            for(String path : paths){
                System.out.println(path);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.getStackTrace();
        }

        System.out.println();

        //List files recursively
        System.out.println("Recursively Listed Files : ");
        listFiles(dir);
    }

    //List files recursively
    public static void listFiles(File dir){
        if(dir.isDirectory()){
            File[] files = dir.listFiles();

            if(files != null){
                for(File file : files){
                    if(file.isDirectory()){
                        listFiles(file);
                    } else {
                        System.out.println(file.getName());
                    }
                }
            }
        }
    }
}

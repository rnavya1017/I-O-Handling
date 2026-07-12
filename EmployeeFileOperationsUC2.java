import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class EmployeeFileOperationsUC2{
    public static void main(String[] args) {
        String path="C:\\Users\\R Navya\\Desktop\\Bridgelabz\\I-O-Handling\\payroll.txt";
        String path2="C:\\Users\\R Navya\\Desktop\\Bridgelabz\\I-O-Handling\\Navya";
        File file1=new File(path);
        File file2=new File(path2);
        try{
        System.out.println(file1.exists());
        System.out.println(file1.delete());
        file2.mkdir();
        file2.createNewFile();
        Path path1= Paths.get("C:\\\\Users\\\\R Navya\\\\Desktop\\\\Bridgelabz\\\\I-O-Handling");

        // List all files and directories
        System.out.println("All Entries:");
        try (Stream<Path> stream = Files.list(path1)) {
            stream.forEach(System.out::println);
        }

        // List only directories
        System.out.println("\nDirectories:");
        try (Stream<Path> stream = Files.list(path1)) {
            stream.filter(Files::isDirectory)
                  .forEach(System.out::println);
        }

        // List only Java files
        System.out.println("\nJava Files:");
        try (Stream<Path> stream = Files.list(path1)) {
            stream.filter(file -> file.toString().endsWith(".java"))
                  .forEach(System.out::println);

        }
    }
        catch(Exception e)
        {

        }

        

        
    
}
}

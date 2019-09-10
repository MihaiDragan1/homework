package week8;
import java.io.*;

public class CheckFileReadPermission {

    public static void main(String[] args) {
        // creating a file instance
        File file = new File("C:\\Users\\Mihu\\Desktop\\workspace\\homework\\src\\main\\resources\\input.txt");

        // check if the file exists
        boolean exists = file.exists();
        if (exists == true) {
            // printing the permissions associated with the file
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File not found.");
        }
    }
    }

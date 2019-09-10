package week8;
import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        // Create a File object

    File my_file_dir = new File("C:/Users/Mihu/Desktop");
         if (my_file_dir.exists())
    {
        System.out.println("The directory or file exists.\n");
    }
         else
    {
        System.out.println("The directory or file does not exist.\n");
    }
}

}

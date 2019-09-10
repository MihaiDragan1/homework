package week8;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifFile {

    public static void main(String[] args) {
        File file = new File("C:/Users/Mihu/Desktop/workspace/homework/src/main/resources/input.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Last modified: " + sdf.format(file.lastModified()));
    }
}

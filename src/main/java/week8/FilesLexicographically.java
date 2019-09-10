package week8;
import java.io.File;

public class FilesLexicographically {

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Mihu\\Desktop\\workspace\\homework\\src\\main\\resources\\input.txt");
        File file2 = new File("C:\\Users\\Mihu\\Desktop\\workspace\\homework\\src\\main\\resources\\output.txt");
        if (file1.compareTo(file2) == 0) {
            System.out.println("Both the paths are lexicographically equal");
        } else {
            System.out.println("Both the paths are lexicographically not equal");
        }
    }
}

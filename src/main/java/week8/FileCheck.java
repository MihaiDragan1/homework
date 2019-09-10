package week8;
import java.io.File;

public class FileCheck {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Mihu\\Desktop\\workspace\\homework\\src\\main\\resources");
            file.createNewFile();
            System.out.println("Is directory? " + file.isDirectory());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
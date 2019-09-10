package week8;
import java.io.File;

public class GetListNames {
    public static void main(String[] args)
    {
        File folder = new File("C:/Users/Mihu/Desktop/workspace");

        File[] files = folder.listFiles();

        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}

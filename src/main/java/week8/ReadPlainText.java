package week8;


import java.io.File;
import java.util.Scanner;

public class ReadPlainText {
    public static void main(String[] args) throws Exception
    {

        File file = new File("C:/Users/Mihu/Desktop/workspace/homework/src/main/resources/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}

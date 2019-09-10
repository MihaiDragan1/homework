package week8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileContentLineByLine {
    public static void main(String[] args) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get("C:/Users/Mihu/Desktop/workspace/homework/src/main/resources/input.txt"))) {
            stream.forEach(System.out::println);
        }
    }

}

package week8;
import java.io.File;
import java.io.FilenameFilter;

public class GetSpecificFiles {

    public static void main(String[] args) {
        File folder = new File("C:/Users/Mihu/Desktop");

        //Implementing FilenameFilter to retrieve only txt files

        FilenameFilter txtFileFilter = new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        //Passing txtFileFilter to listFiles() method to retrieve only txt files

        File[] files = folder.listFiles(txtFileFilter);

        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}
package codeAssignment;

import java.io.*;
import java.util.ArrayList;

public class DataInfo {

    static ArrayList<PackInfo> packages = new ArrayList<>();

    public static void main(String[] args) {
        File f = new File("packageInfo.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fileReader);

        String line;
        boolean flag = false;
        try {
            while (!flag) {
                line = inFile.readLine();
                if (line == null) {
                    flag = true;
                } else {
                    String[] tokens = line.trim().split(",");
                    String location = tokens[0].trim();
                    int distance = Integer.parseInt(tokens[1].trim());
                    int value = Integer.parseInt(tokens[2].trim());
                    String date = tokens[3].trim();
                    PackInfo b = new PackInfo(location, distance, value, date);
                    packages.add(b);
                }
            }
            inFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (PackInfo newpackage : packages) {
            System.out.println(newpackage);
        }
    }
}



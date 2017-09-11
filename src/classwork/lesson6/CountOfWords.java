package classwork.lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOfWords {

    public static void counter(File file) throws IOException {
        Scanner scan=new Scanner(file);
        FileReader fr=new FileReader(file);
        int count=0;
        while (scan.hasNextLine()){
        if(scan.hasNext(" ")) {
           count++;
        }
        }
        fr.close();
        System.out.println(count);
    }

    public static void main(String[] args) {
        try {
            counter(new File("C:\\Users\\Ольга\\IdeaProjects\\classwork\\src\\user.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package classwork.lesson6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\Ольга\\IdeaProjects\\classwork\\src\\textclass.txt\\gtx.txt");
        try {
            FileWriter fw=new FileWriter(file, true);
            fw.write("Hello");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("File doesn't exist");;
        }
    }
}

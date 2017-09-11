package classwork.lesson6.userswriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserWriterImpl implements UserWriter {
    @Override
    public void writeUser(List<User> list) throws IOException {

        File file=new File("C:\\Users\\Ольга\\IdeaProjects\\classwork\\src\\user.txt");
        FileWriter fw=new FileWriter(file, true);
        for (int i = 0; i <list.size() ; i++) {
            fw.write("number: "+(i+1)+"\n");
            fw.write("name: "+list.get(i).name+"\n");
            fw.write("age: "+list.get(i).age+"\n");
            fw.write("hobby: "+list.get(i).hobby+"\n");
            fw.write("\n");
        }
        fw.flush();
        fw.close();
    }
}

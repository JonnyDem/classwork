package classwork.lesson6.userswriting;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserPrinterImpl implements UserPrinter {
    @Override
    public void saveUsers(List<User> list)throws IOException {
        FileReader fr=new FileReader("C:\\Users\\Ольга\\IdeaProjects\\classwork\\src\\user.txt");
        Scanner scan=new Scanner(fr);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        fr.close();
        scan.close();

    }
}

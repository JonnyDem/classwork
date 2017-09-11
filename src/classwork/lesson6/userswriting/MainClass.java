package classwork.lesson6.userswriting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<User>listOfUser=new ArrayList<>();
        listOfUser.add(new User("Bob",43,"running"));
        listOfUser.add(new User("Ving",43,"running"));
        listOfUser.add(new User("Iht",43,"running"));

        UserWriter userWriter=new UserWriterImpl();
        UserPrinter userPrinter=new UserPrinterImpl();
        try {
           // userWriter.writeUser(listOfUser);
            userPrinter.saveUsers(listOfUser);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}

package classwork.lesson6.userswriting;

import java.io.IOException;
import java.util.List;

public interface UserWriter {

    void writeUser(List<User>list) throws IOException;
}

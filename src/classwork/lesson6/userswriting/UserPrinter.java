package classwork.lesson6.userswriting;

import java.io.IOException;
import java.util.List;

public interface UserPrinter {

    void saveUsers(List<User>list) throws IOException;
}

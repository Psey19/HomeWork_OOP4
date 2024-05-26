import java.util.List;

interface UserView<T extends User> {

    void  sendOnConsole(List<T> users);
}

import java.util.List;

public class TeacherView<Teacher> {

    void  sendOnConsole(List<Teacher> teachers){
        for(Teacher teacher: teachers){
            System.out.println(teacher);
        }
        System.out.println("_____________________________________");
    }
}

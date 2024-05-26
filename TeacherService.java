import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    public TeacherList listOfTeacher;

    public TeacherService(TeacherList listOfTeacher) {
        this.listOfTeacher = listOfTeacher;
    }

    public List<Teacher> getSortedTeacherGroupFSL() {
        List<Teacher> teacherList = new ArrayList<>(listOfTeacher.getTeacherList());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
}

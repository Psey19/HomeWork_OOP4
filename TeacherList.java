import java.util.List;

public class TeacherList {
    private List<Teacher> teacherList;

    public TeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
}

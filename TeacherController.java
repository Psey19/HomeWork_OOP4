import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController implements UserController<Teacher> {

    TeacherList teachers = new TeacherList(new ArrayList<>());
    TeacherView teacherView = new TeacherView();
    TeacherService service = new TeacherService(teachers);
    Scanner sc = new Scanner(System.in);

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(!teachers.getTeacherList().isEmpty())
            maxId = teachers.getTeacherList().get(teachers.getTeacherList().size() - 1).getTeacherId() + 1;
        System.out.printf("%s%d%s","Введите название предметной области для учителя Id_", maxId, ": \n");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(maxId, subject, firstName, secondName, lastName);
        teachers.addTeacher(teacher);
    }

    public void editTeacherFirstName() {
        while (true) {
            System.out.println("Введите Id учителя, у которого хотите изменить имя: ");
            int index = sc.nextInt();
            if (index >= 0 && index < teachers.getTeacherList().size()) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("%s%d%s%s%s", "Введите новое имя для учителя Id_", index, " (сейчас его имя: ", teachers.getTeacherList().get(index).getFirstName(), "): \n");
                String firstName = sc.nextLine();
                teachers.getTeacherList().get(index).setFirstName(firstName);
                break;
            } else {
                System.out.println("Учителя с таким Id еще нет в списке учителей");
            }
        }
    }

    public void editTeacherSecondName() {
        while (true) {
            System.out.println("Введите Id учителя, у которого хотите изменить отчество: ");
            int index = sc.nextInt();
            if (index >= 0 && index < teachers.getTeacherList().size()) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("%s%d%s%s%s", "Введите новое отчество для учителя Id_", index, " (сейчас его отчество: ", teachers.getTeacherList().get(index).getSecondName(), "): \n");
                String secondName = sc.nextLine();
                teachers.getTeacherList().get(index).setSecondName(secondName);
                break;
            } else {
                System.out.println("Учителя с таким Id еще нет в списке учителей");
            }
        }
    }

    public void editTeacherLastName() {
        while (true) {
            System.out.println("Введите Id учителя, у которого хотите изменить фамилию: ");
            int index = sc.nextInt();
            if (index >= 0 && index < teachers.getTeacherList().size()) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("%s%d%s%s%s", "Введите новую фамилию для учителя Id_", index, " (сейчас его фамилия: ", teachers.getTeacherList().get(index).getLastName(), "): \n");
                String lastName = sc.nextLine();
                teachers.getTeacherList().get(index).setLastName(lastName);
                break;
            } else {
                System.out.println("Учителя с таким Id еще нет в списке учителей");
            }
        }
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = new ArrayList<>(teachers.getTeacherList());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }

    void printTeacherList(){
        teacherView.sendOnConsole(teachers.getTeacherList());
    }

    void printSortedTeacherList(){
        teacherView.sendOnConsole(getSortedTeacherList());
    }
}

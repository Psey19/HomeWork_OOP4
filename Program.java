public class Program {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.create("Юрий", "Григорьевич", "Самохвалов");
        controller.create("Анатолий", "Ефремович", "Новосельцев");
        controller.create("Людмила", "Прокофьевна", "Калугина");

        controller.printTeacherList();
        controller.printSortedTeacherList();
        controller.editTeacherFirstName();
        controller.editTeacherSecondName();
        controller.editTeacherLastName();
        controller.printSortedTeacherList();

    }
}

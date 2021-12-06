package Generics.taskGAME;
// пример использования дженериков. Школьники могут довабавляться только в школьные команды, Работники в команды работников и т.д
// играть школьные команды могут только между собой, как и команды студентов и команды работников.
public class Test {
    public static void main(String[] args) {
        Scholar scholar = new Scholar("Петя", 13);
        Scholar scholar1 = new Scholar("Гоша", 14);
        Scholar scholar2 = new Scholar("Олежа", 13);
        Scholar scholar3 = new Scholar("Леха", 14);

        Student student = new Student("Гоша", 20);
        Student student1 = new Student("Валера", 21);
        Student student2 = new Student("Петя", 21);
        Student student3 = new Student("Вася", 22);

        Employee employee = new Employee("Валера", 28);
        Employee employee1 = new Employee("Валентин", 29);
        Employee employee2 = new Employee("Вася", 28);
        Employee employee3 = new Employee("Леха", 29);

        Team <Scholar> schoolarTeam = new Team("Дельфины");
        Team <Scholar> schoolarTeam2 = new Team("Петухи");
        schoolarTeam.addNewPerticipant(scholar);
        schoolarTeam.addNewPerticipant(scholar1);
        schoolarTeam2.addNewPerticipant(scholar2);
        schoolarTeam2.addNewPerticipant(scholar3);
        Team <Student> studentTeam = new Team("Драконы");
        Team <Student> studentTeam2 = new Team("Тигры");
        studentTeam.addNewPerticipant(student);
        studentTeam.addNewPerticipant(student1);
        studentTeam2.addNewPerticipant(student2);
        studentTeam2.addNewPerticipant(student3);
        Team <Employee> employeeTeam = new Team("Собаки");
        Team <Employee> employeeTeam2 = new Team("Альбатросы");
        employeeTeam.addNewPerticipant(employee);
        employeeTeam.addNewPerticipant(employee1);
        employeeTeam2.addNewPerticipant(employee2);
        employeeTeam2.addNewPerticipant(employee3);

        schoolarTeam.playWith(schoolarTeam2);
        studentTeam.playWith(studentTeam2);
        employeeTeam.playWith(employeeTeam2);

    }
}

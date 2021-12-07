package Collections.ArrayList1;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Student student1 = new Student("Валера", 'm', 20, 2,9.1);
        Student student2 = new Student("Вадик", 'm', 21, 3,7.1);
        Student student3 = new Student("Ира", 'w', 22, 3,9.4);
        Student student4 = new Student("Гена", 'm', 20, 2,6.3);
        Student student5 = new Student("Виктория", 'w', 20, 2,7.1);
        Student student6 = new Student("Роб", 'm', 19, 1,8.2);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        System.out.println(studentList);
        studentList.remove(5);
        System.out.println(studentList);
    }
}
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

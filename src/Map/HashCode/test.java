package Map.HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student student = new Student("Вадим", "Кузьменко", 2);
        Student student1 = new Student("Дима", "Григорьев", 1);
        Student student2 = new Student("Олег", "Демидов", 2);
        Student student3 = new Student("Денис", "Сороко", 3);
        Student student4 = new Student("Павел", "Гришев", 5);
        Student student5 = new Student("Олег", "Демидов", 2);

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student5.hashCode());
        map.put (student, 7.2);
        map.put(student1, 7.3);
        map.put(student2, 7.1);
        map.put (student3, 6.2);
        map.put (student4, 9.2);
        map.put(student5, 7.1);
        System.out.println(map);

    }
}
class Student {
    String name, surname;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
}
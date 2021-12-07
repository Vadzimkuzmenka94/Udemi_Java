package Collections.LinkedList;

import java.util.LinkedList;

public class test1 {
    public static void main(String[] args) {
        student student1 = new student("Вася", 2);
        student student2 = new student("Гриша", 3);
        student student3 = new student("Леха", 4);
        student student4 = new student("Дима", 2);
        LinkedList<student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        System.out.println(studentLinkedList);
        System.out.println(studentLinkedList.get(2));


    }
}
class student {
    String name;
    int course;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public student(String name, int course) {
        this.name = name;
        this.course = course;
    }

}
package comparable_and_comporator.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(5, "Вася", "Петров", 100);
        Employee emp2 = new Employee(2, "Гена", "Иванов", 200);
        Employee emp3 = new Employee(4, "Олег", "Георгиев", 110);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
class Employee implements Comparable <Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o1) {
        if (this.id == o1.id) {
            return 0;
        } else if (this.id < o1.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

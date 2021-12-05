package comparable_and_comporator.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(5, "Вася", "Петров", 100);
        Employee emp2 = new Employee(2, "Гена", "Иванов", 200);
        Employee emp3 = new Employee(4, "Олег", "Георгиев", 110);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        Collections.sort(list, new idComporetor()); // или salaryComp или nameComp
        System.out.println(list);
    }
}
class Employee {
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
    }
    class idComporetor implements Comparator <Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
                if (emp1.id == emp2.id) {
                    return 0;
                } else if (emp1.id < emp2.id) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        class nameCompotaror implements Comparator<Employee> {

            @Override
            public int compare(Employee emp1, Employee emp2) {
                    return emp1.name.compareTo(emp2.name);
                }
            }
class salaryCompotaror implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}




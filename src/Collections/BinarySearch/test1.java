package Collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
      Employee employee = new Employee("Вася", 1, 905);
        Employee employee1 = new Employee("Гриша", 2, 1000);
        Employee employee2 = new Employee("Олег", 3, 3600);
        Employee employee3 = new Employee("Виталя", 4, 2000);
        Employee employee4 = new Employee("Саша", 5, 2200);
        Employee employee5 = new Employee("Григорий", 6, 2345);
        Employee employee6 = new Employee("Дима", 7, 2510);
        List<Employee> emplist = new ArrayList<>();
        emplist.add(employee);
        emplist.add(employee1);
        emplist.add(employee2);
        emplist.add(employee3);
        emplist.add(employee4);
        emplist.add(employee5);
        emplist.add(employee6);
        System.out.println(emplist);
        Collections.sort(emplist);
        int index2 = Collections.binarySearch(emplist, new Employee ("Саша", 5, 2200));
        System.out.println(index2);


    }
}
class Employee implements Comparable<Employee> {
    String name;
    int id, salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
                if (result == 0) {
                    result = this.name.compareTo(o.name);
                }

        return result;
    }
}
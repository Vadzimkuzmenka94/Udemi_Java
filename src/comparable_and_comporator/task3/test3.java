package comparable_and_comporator.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


    public class test3 {
        public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();
           Employee emp1 = new Employee(5, "Вася", "Яверьянов", 100);
          Employee emp2 = new Employee(2, "Вася", "Иванов", 200);
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
            int res = this.name.compareTo(o1.name);
            if (res == 0) {
                res = this.surname.compareTo(o1.surname);
            }
            return res;
        }
    }



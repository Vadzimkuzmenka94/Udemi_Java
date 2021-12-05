package comparable_and_comporator.task1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add ("Дима");
        list.add ("Ваня");
        list.add ("Коля");
        System.out.println("перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("после сортировки");
        System.out.println(list);
    }
}
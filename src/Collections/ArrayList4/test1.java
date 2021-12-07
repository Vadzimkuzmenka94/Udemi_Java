package Collections.ArrayList4;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String > name = new ArrayList<>();
        name.add("Заур");
        name.add("Вася");
        name.add("Олег");
        name.add("Гоша");
        name.add("Георгий");
        System.out.println(name);
        List<String> mylist = name.subList(1,3);
        System.out.println(mylist);
        mylist.add("Сергей");


        ArrayList<String > name1 = new ArrayList<>();
        name1.add("Дима");
        name1.add("Гриша");
        name1.add("Артем");
        name1.add("Заур");

        name.removeAll(name1);
        System.out.println(name);
    }
}

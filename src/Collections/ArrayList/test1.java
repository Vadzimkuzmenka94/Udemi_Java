package Collections.ArrayList;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String > name = new ArrayList<>();
        name.add("Заур");
        name.add("Вася");
        name.add("Олег");
        name.add(1,"Олег");
        name.set(2, "Дмитрий");
        name.remove(1);
        System.out.println(name);
        for (String s:name) {
            System.out.println(name);
        }
        ArrayList<Integer> name1 = new ArrayList<>();
        name1.add(2);
        name1.add(3);
        name1.add(4);
        System.out.println(name.get(2));

    }
}

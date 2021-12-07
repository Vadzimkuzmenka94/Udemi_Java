package Collections.ArrayList2;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String > name = new ArrayList<>();
        name.add("Заур");
        name.add("Вася");
        name.add("Олег");
        System.out.println(name);
        ArrayList<String > name2 = new ArrayList<>();
        name.add("!!!");
        name.add("???");
        name.add("....");
        name.addAll(1,name2);

        // name.clear();
        System.out.println(name.size());
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Заур"));



    }
}

package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList<String > name = new ArrayList<>();
        name.add("Заур");
        name.add("Вася");
        name.add("Олег");
        name.add("Гоша");
        name.add("Георгий");

        Iterator <String>  iterator = name.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(name);
    }
}

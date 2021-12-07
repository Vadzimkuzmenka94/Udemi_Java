package Collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add (-1);
        list.add (11);
        list.add (-19);
        list.add (28);
        list.add (4);
        list.add (3);
        list.add (91);
        list.add (87);
        list.add (-1111);
        list.add (-4);
        list.add (1);
        list.add (-1);
        list.add (615);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("отсортированный ArrayList" + " = " + list);
        int index1 = Collections.binarySearch(list, 28);
        System.out.println(index1);


    }
}

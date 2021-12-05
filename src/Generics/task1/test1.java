package Generics.task1;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List <String>list = new ArrayList<String>();
        list.add("start");
        list.add("da");
        list.add("net");
        for (Object o : list) {
            System.out.println(o + " длина " + ((String)o).length());
        }
    }
}

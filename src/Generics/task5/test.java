package Generics.task5;


import java.util.ArrayList;
import java.util.List;
 // wildcards
public class test {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List <String> list2 = new ArrayList<>();
        list2.add("да");
        list2.add("нет");
        list2.add("конечно");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));
    }
    static void showListInfo (List <?> list) {
        System.out.println("лист содержит следующие элементы - " + list);
    }
    public static double summ(ArrayList<? extends Number> a1) {
        double summ = 0;
        for (Number n : a1) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
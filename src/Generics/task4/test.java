package Generics.task4;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer>al1 = new ArrayList<>();
        al1.add(10);
        al1.add(5);
        al1.add(1);
        al1.add(4);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String>al2 = new ArrayList<>();
        al2.add("п");
        al2.add("с");
        al2.add("1");
        al2.add("4");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }

}
class GenMethod {
    public static <T> T getSecondElement (ArrayList<T> a1) {
        return a1.get(1);
    }
}

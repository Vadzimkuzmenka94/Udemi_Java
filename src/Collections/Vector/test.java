package Collections.Vector;

import java.util.Vector;
// не рекомендован к использованию
public class test {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add ("Олег");
        vector.add ("Дима");
        vector.add ("Сергей");
        vector.add ("Марина");
        vector.add ("Вадим");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        vector.remove(1);
        System.out.println(vector.get(1));



    }
}

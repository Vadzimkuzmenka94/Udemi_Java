package Collections.ArrayList4;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("А");
        StringBuilder sb2 = new StringBuilder("Б");
        StringBuilder sb3 = new StringBuilder("В");
        StringBuilder sb4 = new StringBuilder("Г");
        StringBuilder sb5 = new StringBuilder("Д");
        StringBuilder[]array =  {sb1, sb2, sb3, sb4, sb5};
        List<StringBuilder> list= Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!!????");
        System.out.println(list);
        array[0] = new StringBuilder("ЭЭЭ");
        System.out.println(list);
    }
}

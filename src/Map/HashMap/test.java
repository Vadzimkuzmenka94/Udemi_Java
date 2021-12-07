package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10011, "Гриша Валеронов");
        map1.put(11128, "Леонид Агутин");
        map1.put(12198, "Валерий Карпин");
        map1.put(11214, "Игорь Гамула");
        map1.put(10114, "Жозе Мауриньо");
        map1.put(19813, "Александр Пистолетов");
        map1.put(10011, "Гриша Иванов"); // перезаписывает объект значение ввиду повтора ключа
        map1.put(null, "Леонид Иванов");
        map1.put(10029, null); // null - допустимое значение
        map1.putIfAbsent(11128, "Леонид Агутин"); // добавляет если такого номера ключа нету
        map1.remove(12198); // удаление

        System.out.println(map1);
        System.out.println(map1.keySet()); // выводит множество ключей
        System.out.println(map1.values());
        // System.out.println(map1.entrySet());


    }
}

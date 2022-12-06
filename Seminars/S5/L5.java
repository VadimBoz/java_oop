import java.util.*;

public class L5 {

    static String ayo(){return "aYo!";}
    static String ayo1(String v){return v+"aYo!";}

    public static void main(String[] args) {
        // словари Мар <ключ, значение>
        Map<Integer, String> map = new HashMap<>();

        Set<Integer> keys = map.keySet(); // взвращает множество уже имющихся ключей
        map.put(4, "ouchie");
        map.put(5, "UwU"); // кладёт значение по заданному ключу
        map.get(5); // возвращает вложенное значение по указанному ключу, если не находит то возвращается NULL
        String s = map.get(32);
        if (map.get(32) != null) System.out.println(s);
        map.containsKey(32); // возвращает ИСТИНУ если есть заданный ключ
        map.containsValue("Uwu"); // возвращает ИСТИНУ если есть заданное значение
        Set<Map.Entry<Integer, String>> a =map.entrySet(); // возращает всё содержимое словаря в виде множества пар ключ-значение
        map.getOrDefault(4, "aYo!"); // вытаскивает значение по заданному ключу или возвращает значение по умолчанию
        map.remove(5); // Удаление по ключу
        map.replace(4, "oWo"); // заменяет значение по ключу
        map.size(); // возвращает размер
        map.forEach((k,v) -> System.out.print(k+" - "+ v)); // итерация словаря

        map.compute(4, (k,v) -> v=v+"_/"); // изменение данных по ключу
        map.computeIfAbsent(6, k->ayo()); // изменение данных по ключу, если такого ключа нет
        map.computeIfPresent(4, (k,v)->ayo1(v)); // изменение данных по ключу, если такой ключ есть
        map.putIfAbsent(7,"LMAO"); // кладет значение если такого ключа нет, если есть ключ перезаписывает значение.
        System.out.println();
        map.forEach((k,v) -> System.out.print(k+" - "+ v+"\n"));

        Map<Integer, String> map2 = new LinkedHashMap<>(); // упорядоченный словарь
        map2.put(12, "Ohayo");
        map2.put(5, "Konichiwa");

        Map<Integer, String> map3 = new TreeMap<>(); // дерево

    }
}

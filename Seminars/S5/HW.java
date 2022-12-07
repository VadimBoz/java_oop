import java.util.*;

public class HW {
    public static void main(String[] args) {
        //---------------ex1-----------//
        System.out.println("Создаём словарь...");
        HashMap<Integer, String> colors = new HashMap<>();
        /*--------------ex2--------------*/
        System.out.println("Добавляем значения в словарь...");
        colors.put(15, "black");
        colors.put(11, "orange");
        colors.putIfAbsent(1, "red");
        colors.forEach((k,v)-> System.out.print(k+" - "+v+"\n"));
        /*----------ex3------------------*/
        System.out.println("Изменение значений в словаре: ");
        Set<Integer> keys = colors.keySet();
        keys.forEach(i -> colors.compute(i, (k,v) -> add_excl(v)));
        colors.forEach((k,v)-> System.out.print(k+" - "+v+"\n"));
        System.out.println("Создаём дерево...");
        TreeMap<Integer, String> t_colors = new TreeMap<>();
        colors.forEach((k,v)->t_colors.put(k,v));
        /*-----------ex4-&-5----------------*/
        System.out.println("Увеличиваем таблицы до 1000 элементов...");
        long start = System.currentTimeMillis();
        while (colors.size() < 1000)
            colors.putIfAbsent(new Random().nextInt(10_000),"new_element");
        long end = System.currentTimeMillis();
        long t1 = end-start;
        start = System.currentTimeMillis();
        while (t_colors.size() < 1000)
            t_colors.putIfAbsent(new Random().nextInt(10_000),"new_element");
        end = System.currentTimeMillis();
        long t2 = end-start;

        System.out.printf("Время для Словаря: %dмс\n", t1);
        System.out.printf("Время для Дерева: %dмс\n", t2);
    }
    private static String add_excl (String s) {return s+"!";}
}

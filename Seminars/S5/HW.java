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
        TreeMap<Integer, String> t_colors = (TreeMap<Integer, String>) colors.clone();
        /*-----------ex4----------------*/
        System.out.println("Увеличиваем словари до 1000 элементов...");
        while (colors.size() < 1000)
            colors.putIfAbsent(new Random().nextInt(10_000),"new_element");
        while (t_colors.size() < 1000)
            t_colors.putIfAbsent(new Random().nextInt(10_000),"new_element");

    }
    private static String add_excl (String s) {return s+"!";}
}

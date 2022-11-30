import java.util.*;

public class L3 {
    public static void main(String[] args) {

        int[] a = new int[10];
        // Collections

        List array1 = new ArrayList(); // Самый простой представитель коллекций. Массив ссылок на данные
        array1.add(1);
        array1.add(1.5f); // так тоже можно
        array1.add("Uno"); // и даже так. Это потому что ArrayList хранит Object

        // крайне не рекомендуется делать списки с данными разного типа.
        // Эррей листы нужны для динамических массивов
        // для закрепления типа в них есть специальный инструмент - обощение

        ArrayList<Integer> arr2 = new ArrayList<>();
        /*
        arr2.add(0,1);
        arr2.add(11,9);// добавление со сдвигом
        arr2.set(12,15); // изменение существуещего элемента
        arr2.set(7,55);
        arr2.remove(12); // удаление со сдвигом
        arr2.size(); // возвращает размер списка
        arr2.clear(); // присваивает элементам списка нулевое значение
        */
        // Перебор списков

        for (int i = 0; i < 25; i++) {
            arr2.add(new Random().nextInt(100));
        }

        for ( Object i: arr2){
            System.out.print(i+"   ");
        }
        System.out.println();

        Iterator<Integer> iter = arr2.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            if (i<20) iter.remove();
        }

        arr2.forEach(n -> System.out.print(n+"  "));
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");

        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arr3.add(new Random().nextInt(-10,10));
        }
        arr3.forEach(i -> System.out.print(i+"   "));



    }
}

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        // класс Arrays
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i]=new Random().nextInt(-10,10);

        // Arrays.toString помогает вывести массивы
        System.out.println("Одномерный массив: "+Arrays.toString(arr));

        int[][] arr2D = new int[5][3];
        for (int i = 0; i < arr2D.length; i++) {
            arr2D[i][0] = new Random().nextInt(-10,10);
            arr2D[i][1] = new Random().nextInt(-10,10);
        }

        // Array.deepToString() выводит многомерные масивы
        System.out.println("Двумерный массив: "+Arrays.deepToString(arr2D));

        //Arrays.sort() сортировка
        Arrays.sort(arr);
        System.out.println();

        // разворот
        System.out.println("Сортированный массив: "+Arrays.toString(arr));
        arrReverse(arr);
        System.out.println("Развернутый массив: "+Arrays.toString(arr));
        System.out.println();

        // СТРОКИ снова СТРОКИ
        System.out.println("-----------------STRING-------------------------------");
        System.out.println();

        String s = "Gutten "+"tag"; // Операция переопределена внутри класса
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        // stringBuilder отличается от классического строки тем, что он массив, имеет схожий функционал
        stringBuilder.append(", mien freund");
        // главное преимущество перед строкой, что он изменяемый
        s = stringBuilder.toString();
        //.toString() возвращает обратно строку
        System.out.println(s);

        // Самостоятельное задание (функцией)
        String word = "Pancake";
        System.out.println("Слово: "+word);
        StringBuilder stB = new StringBuilder(word); // а можно и так: new StringBuilder(hi).reverse().toString()
        stB.reverse();
        word=stB.toString();
        System.out.println("Развёрнутое слово: "+word);

    }

    private static void arrReverse (int[] a){
        int last = a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            int tmp=a[i];
            a[i] = a[last-i];
            a[last-i] = tmp;
        }
    }

}

import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        int a = rando();
        System.out.println("Первое задание - " + a);

        long bit = bitRank(a);
//        String s = "111111101";
        System.out.print("Второе задание - " + bit);
        System.out.println();

//        System.out.println("Введите число: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 32750; // это для проверки, чтоб красиво было. а так я выше ввод реализовал
        int[] m1 = evensShort(n);
        System.out.println("Третье задание: ");
        printArr(m1);
        System.out.println();

//        System.out.println("Введите число: ");
//        int m =sc.nextInt();
        int m = -32750;
        int[] m2 = oddShort(m);
        System.out.println("Четвёртое задание:");
        printArr(m2);
    }

    private static int rando() {
        int i =0;
        i = new Random().nextInt(-1000, 1000);
        return i;
    }

    private static int bitRank(int num){
        String binaryNum = Integer.toBinaryString(num);
        int res=0;
        while (binaryNum.length()%8 !=0)
            binaryNum = "0"+binaryNum;

        if (binaryNum.length() % 8 == 1) {
            int i=0;
            while (binaryNum.charAt(i) != '1')
                i++;
            res = 7-i;
            return res;
        }
        else {
            int i=0;
            int length = binaryNum.length() / 8 - 1;
            String lastByte = binaryNum.substring(0, 8);
            while (lastByte.charAt(i) == '0'){
                i++;
            }
            res = length * 8 + 8 - i-1;
            return res;
        }
    }
    private static int[] evensShort(int i){
        int[] m= new int[(Short.MAX_VALUE-i)/2];
        for (int j = 0; j < m.length; j++) {
            i++;
            if (i%2 == 0)
                m[j] = i;
            else j--;
        }
        return m;
    }

    private static int[] oddShort(int i){
        int[] m= new int[Math.abs((Short.MIN_VALUE-i)/2)];
        for (int j = 0; j < m.length; j++) {
            i--;
            if (i%2 != 0)
                m[j] = i;
            else j--;
        }
        return m;
    }

    private static void printArr (int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}

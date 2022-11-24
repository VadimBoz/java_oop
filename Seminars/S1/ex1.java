public class ex1 {

    public static void main(String[] args) {


        // примитивные типы
        int i ='g'; // целый 32, short 16, long 64, byte 8
        char ch = 'l'; // 16 бит беззнаковый
        float f = 4.3215f; // дробный 16бит
        double d = 44.32; // дробный
        boolean b = false; // логический

        boolean[] bArray = new boolean[6]; // одномерный массив обязательно указывать размер

        i = (int) 7.5; // приведение к нужному типу

        // ветвление и циклы

        for (int j = 0; j < 10; j++) {
            i++;
            ch+=12;
        }

        while (b){
            i++;
            i-=3;
            if (i == 20) b = true;
        }

        // строки
        String str = "Yo mama so fat she has her own orbit";
        System.out.println(str); // сниппет sout

    }
}

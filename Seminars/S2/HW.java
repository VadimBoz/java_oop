public class HW {

    public static void main(String[] args) {
        run_ex1();
        System.out.println("---------------------------------------------------------------------------------------");
        run_ex2();
        System.out.println("---------------------------------------------------------------------------------------");
        run_ex3();
        System.out.println("---------------------------------------------------------------------------------------");
        run_ex4();
        System.out.println("---------------------------------------------------------------------------------------");
        run_ex5();
        System.out.println("---------------------------------------------------------------------------------------");
        run_ex6();
        System.out.println("---------------------------------------------------------------------------------------");
        run_ex7();
        System.out.println("---------------------------------------------------------------------------------------");
    }
    private static void run_ex1(){
        String w1 = "cat";
        String w2 = "copycat";
        String w3 = "caution";

        System.out.println("Задание 1");
        System.out.printf("Слова %s, %s и %s", w1, w2, w3);
        System.out.println();
        if (w2.contains(w1))
            System.out.printf("Слово %s содержит слово %s", w2, w1);
        else
            System.out.printf("Слово %s не содержит слово %s", w2, w1);
        System.out.println();
        if (w3.contains(w1))
            System.out.printf("Слово %s содержит слово %s", w3, w1);
        else
            System.out.printf("Слово %s не содержит слово %s", w3, w1);
        System.out.println();
    }

    private static void run_ex2(){
        String w1 = "madam ";
        String w2 = " madam";
        String w3 = "adam";

        System.out.println("Задание 2");
        StringBuilder base = new StringBuilder(w1);
        if (base.reverse().toString() == w2)
            System.out.printf("Строка \"%s\" является разворотом строки \"%s\"", w1, w2);
        else
            System.out.printf("Строка \"%s\"  не является разворотом строки \"%s\"", w1, w2);
        System.out.println();
        if (base.reverse().toString() == w3)
            System.out.printf("Строка \"%s\" является разворотом строки \"%s\"", w1, w3);
        else
            System.out.printf("Строка \"%s\"  не является разворотом строки \"%s\"", w1, w3);
        System.out.println();
    }

    private static void run_ex3(){
        String w = "erneg cisum yna ot roirepus si popK";
        System.out.println("Задание 3");
        System.out.print(rec_reverse(w));
        System.out.println();
    }
    private static String rec_reverse(String arg){
        // Честно говоря нашёл эту функцию в интернете и не понимаю как она работает.... Прошу объяснить
        if ((null == arg) || (arg.length() <= 1))
            return arg;
        return rec_reverse(arg.substring(1))+arg.charAt(0);
    }

    private static void run_ex4(){
        System.out.println("Задание 4");
        int d1=15;
        int d2=13;

        StringBuilder sum = new StringBuilder(Integer.toString(d1));
        sum.append(" + "+Integer.toString(d2)+" = "+Integer.toString(d1+d2));
        System.out.println(sum.toString());

        StringBuilder sub = new StringBuilder(Integer.toString(d1));
        sub.append(" - "+Integer.toString(d2)+" = "+Integer.toString(d1-d2));
        System.out.println(sub.toString());

        StringBuilder mpl = new StringBuilder(Integer.toString(d1));
        mpl.append(" * "+Integer.toString(d2)+" = "+Integer.toString(d1*d2));
        System.out.println(mpl.toString());
    }

    private static void run_ex5(){
        System.out.println("Задание 5");
        String input = "17 + 18 = 35";
        System.out.println("Было: "+input);
        StringBuilder magic = new StringBuilder(input);
        magic = magic.insert(input.indexOf("="), "равно");
        magic=magic.deleteCharAt(input.indexOf("=")+5);
        System.out.println("Стало: "+magic.toString());
    }

    private static void run_ex6(){
        System.out.println("Задание 6");
        String input = "10 + 15 = 25";
        System.out.println("Было: "+input);
        StringBuilder magic = new StringBuilder(input);
        magic = magic.replace(input.indexOf("="),input.indexOf("=")+1, "равно");
        System.out.println("Стало: "+magic.toString());
    }

    private static void run_ex7(){
        System.out.println("Задание 7");

        StringBuilder experiment = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            experiment.append("=");
        }
        String exp = experiment.toString();

        long start = System.currentTimeMillis();
        for (int i = 0; i < experiment.length(); i++) {
            experiment=experiment.replace(i, i+1, "равно");
            i+=5;
        }

        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println("Время замены 10 000 символов на слово при помощи StringBuilder: "+time+"мс");

        start=System.currentTimeMillis();
        exp.replaceAll("=","равно");
        end=System.currentTimeMillis();
        time = end-start;
        System.out.println("Время замены 10 000 символов на слово при помощи String: "+time+"мс");
    }
}

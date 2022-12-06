import java.util.ArrayList;
import java.util.Scanner;

public class L4 {

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> surname = new ArrayList<>();
    static ArrayList<String> v_name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<String> gender = new ArrayList<>();
    static ArrayList<Integer> index = new ArrayList<>();

    public static String readStr (String message){
        String input = null;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        input= sc.nextLine();
        return input;
    }
    public static void print_record(int n, ArrayList a, ArrayList b, ArrayList c, ArrayList d, ArrayList e){
        System.out.printf("%d. %s - %s - %s - %s - %d", n+1, a.get(n), b.get(n), c.get(n), d.get(n), e.get(n));
        System.out.println();
    }
    private static void reader(){
        String nameZ = readStr("ФИО: ");
        String[] sliced_name = nameZ.split(" ");
        surname.add(sliced_name[0]);
        name.add(sliced_name[1]);
        v_name.add(sliced_name[2]);

        String input = readStr("Пол: ");
        if (input.equals("M"))
            gender.add("MALE");
        else if (input.equals("F"))
            gender.add("FEMALE");

        int age_inp = Integer.parseInt(readStr("Возраст: "));
        age.add(age_inp);
    }

    private static void kinda_sort(ArrayList<Integer> a, ArrayList<Integer> ind){
        int min = 0;
        for (int i = 0; i < a.toArray().length; i++) {
            if (a.get(min) > a.get(ind.get(i))){
                int temp = min;
                ind.set(min, ind.get(i));
                ind.set(i, temp);


            }
        }
    }

    public static void main(String[] args) {
        
        int count = Integer.parseInt(readStr("Сколько записей вы хотите сделать? "));
        for (int i = 0; i < count; i++) {
            reader();
            index.add(i);
        }
        index.forEach(i -> print_record(i, surname, name, v_name, gender, age));
        kinda_sort(age, index);
        System.out.println();
        index.forEach(i-> print_record(i, surname, name, v_name, gender, age));

    }

}

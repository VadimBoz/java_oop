import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class L4 {

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> surname = new ArrayList<>();
    static ArrayList<String> v_name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<String> gender = new ArrayList<>();
    static LinkedList<Integer> index = new LinkedList<>();

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

    private static void kinda_sort(ArrayList<Integer> a, LinkedList<Integer> ind){
        int cnt = a.size()-1;
        while(cnt>-1){
            int max = a.get(ind.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if (max < a.get(ind.get(i))) {
                    max = a.get(ind.get(i));
                    index = i;
                }
            }
            int tmp = ind.get(cnt);
            ind.set(cnt, ind.get(index));
            ind.set(index,tmp);
            cnt--;
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
        index.forEach(i->
                System.out.println(surname.get(i)+" - "+name.get(i)+" - "+v_name.get(i)+" - "+gender.get(i)+" - "+age.get(i)));
        System.out.println();

        /*----------HOMEWORK------------*/

        surname = sort4real(index,surname);
        name = sort4real(index, name);
        v_name = sort4real(index, v_name);
        gender = sort4real(index, gender);
        age = sort4real(index, age);
        for (int i = 0; i < name.size(); i++)
            print_record(i, surname, name, v_name, gender, age);
    }

    private static ArrayList sort4real(LinkedList<Integer> order, ArrayList data) {
        ArrayList temp = new ArrayList();
        for (int i = 0; i < data.size(); i++)
            temp.add(data.get(order.get(i)));
        return temp;
    }
}
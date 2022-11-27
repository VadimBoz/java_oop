public class collections {
    public static void main(String[] args) {
        //тип Object - тип-контейнер, в который можно положить любое значение.
        // запаковка/распаковка - вкладывание/вытаскивание типа в Object
        Object o = 1; GetType(o);
        o=1.2; GetType(o);

        //collections. arraylist - удобный массив

        ArraList<Integer> alst = new ArrayList<Integer>();
        alst.add(2809);

        for (Obect o: list){
            System.out.println(o);
        }
    }
    static void GetType (Object obj){
        System.out.println(obj.getClass().getName());
    }
}

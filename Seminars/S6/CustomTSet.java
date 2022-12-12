import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class CustomTSet {
    static TreeMap<Integer, Object> ctset = new TreeMap<>();
    static final Object DEF_VALUE = new Object();

    public static void m_add(int k){ ctset.put(k,DEF_VALUE); }

    public static void m_show(){
        ctset.forEach((k,o)-> System.out.printf("%d  ", k));
        System.out.println();
    }

}

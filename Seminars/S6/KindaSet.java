import java.util.HashMap;

public class KindaSet {

    private HashMap<Integer, Object> mm= new HashMap<>();
    private static final Object DEF_VAL = new Object();
    public void meth_add(int key){ mm.put(key, DEF_VAL); }

    public int meth_Size() { return mm.size(); }

    public String meth_toString() { return mm.keySet().toString(); }

}

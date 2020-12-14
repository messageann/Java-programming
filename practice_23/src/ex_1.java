import java.util.ArrayList;
import java.util.HashMap;

public class ex_1 {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        list.put("F1", "N1");
        list.put("F2", "N2");
        list.put("F3", "N1");

        ArrayList<String> keysToRemove = new ArrayList<>();
        for (var f1 : list.entrySet()) {
            for (var f2 : list.entrySet()) {
                if (f1.getKey().equals(f2.getKey())) continue;
                if (f1.getValue().equals(f2.getValue())) keysToRemove.add(f2.getKey());
            }
        }
        keysToRemove.forEach(list::remove);

        System.out.println(list);
    }
}
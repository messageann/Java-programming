import java.util.ArrayList;
import java.util.HashMap;

class City {
    public String City;
    public String Country;
}

public class ex_2 {
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        add(map, "Spain", "Madrid");
        add(map, "Spain","Toledo");
        add(map, "Russia", "Moscow");
        System.out.println(map);
    }

    static void add(HashMap<String, ArrayList<String>> map, String c, String s){
        if(map.containsKey(c)){
            map.get(c).add(s);
        }
        else{
            var l = new ArrayList<String>();
            l.add(s);
            map.put(c,l);
        }
    }
}


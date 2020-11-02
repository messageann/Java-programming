import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Drunker {
    public static void main (String[] args) {
        ArrayList<Integer> gamer_1 = new ArrayList<>();
        ArrayList<Integer> gamer_2 = new ArrayList<>();
        Scanner st = new Scanner(System.in);
        var first = st.nextLine().split(" ");
        var second = st.nextLine().split(" ");
        for (var c : first) gamer_1.add(Integer.parseInt(c));
        for (var c : second) gamer_2.add(Integer.parseInt(c));

        int counter = 0;
        while (counter <= 106) {
            int f = gamer_1.get(0), s = gamer_2.get(0);
            if (f > s) {
                if (f == 9 && s == 0) gamer_2.addAll(make_l(f, s));
                else gamer_1.addAll(make_l(f, s));
            } else {
                if (f == 0 && s == 9) gamer_1.addAll(make_l(f, s));
                else gamer_2.addAll(make_l(f, s));
            }
            counter++;
            gamer_1.remove(0);
            gamer_2.remove(0);
            if (gamer_1.size() == 0) {
                System.out.println("second " + counter);
                return;
            }
            if (gamer_2.size() == 0) {
                System.out.println("first " + counter);
                return;
            }
        }
        System.out.println("botva");
    }

    public static ArrayList<Integer> make_l (int a, int b) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(a);
        arr.add(b);
        return arr;
    }
}

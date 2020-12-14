import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
    public static void main(String[] args) {
        String s1 = "1.2.3.4a";
        String s2 = "255.255.255.0";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String IP) {
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}"
                + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
        Matcher m = pattern.matcher(IP);
        return m.matches();
    }
}

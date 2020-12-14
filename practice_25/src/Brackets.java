import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brackets {
    public static void main(String[] args) {
        String s1 = "(3*+*5)*–*9*×*4";
        String s2 = "((3*+*5)*–*9*×*";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String inp){
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher m = pattern.matcher(inp);
        while(m.find()){
            inp = m.replaceAll("");
            m = pattern.matcher(inp);
        }
        return !(inp.contains("(") || inp.contains(")"));
    }
}
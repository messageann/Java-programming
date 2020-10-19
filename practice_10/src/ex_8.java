import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.print(IsPalindrom(n.toCharArray(), 0));
    }

    public static String IsPalindrom(char[] word, int offset){
        if(offset*2 == word.length || (offset*2)-1 == word.length) return "YES";
        else if(word[offset]!=word[word.length-1- offset]){
            return "NO";
        }
        else return IsPalindrom(word, offset+1);
    }
}

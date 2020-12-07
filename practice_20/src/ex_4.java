import java.io.File;
import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var dir = sc.nextLine();
        File f = new File(dir);
        File[] files = f.listFiles();
        for (int i = 0; i < 5 && i < files.length; i++) {
            System.out.print(files[i].isFile() ? "File: " : "Folder: ");
            System.out.println(files[i].getName());
        }
    }
}

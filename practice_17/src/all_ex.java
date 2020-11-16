import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class all_ex {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("output.txt");
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        fw.write(inp);
        fw.close();

        FileReader fr = new FileReader("output.txt");
        Scanner s_2 = new Scanner(fr);
        while(s_2.hasNext()) System.out.println(s_2.nextLine());
        fr.close();

        String path = "output.txt";
        File f = new File(path);
        FileWriter fw_2 = new FileWriter(f);
        inp = s.nextLine();
        fw_2.write(inp + "\n");
        inp = s.nextLine();
        fw_2.append(inp);
        fw_2.close();
    }
}
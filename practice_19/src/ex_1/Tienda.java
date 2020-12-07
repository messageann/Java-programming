package ex_1;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        String fio;
        String inn;
        Scanner s = new Scanner(System.in);
        System.out.println("FIO:");
        fio = s.nextLine();
        System.out.println("INN:");
        inn = s.nextLine();
        boolean result = inn.matches("([0-9]+)");
        if (result) {
            if(inn.length()==11 && inn.charAt(0) != '0') System.out.println("Nice, good");
            else  System.out.println("Something wrong");
        }
        else System.out.println("Only numbers");
    }
}

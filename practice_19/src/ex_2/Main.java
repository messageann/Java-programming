package ex_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] st = new Student[]{
                new Student("Meow",1, 3.8),
                new Student("Bark", 5, 2.35),
                new Student("Kto",2, 4.49),
                new Student("Ya",4, 5.0),
                new Student("Da",0, 3.2)
        };

        System.out.println("Вы хотите получить отсортированный список или найти информацию? " +
                "1-для сортировки, 2-для поиска: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case(1):
                System.out.println("Отсортировать по 1-среднему баллу, 2-по ID: ");
                n= s.nextInt();
                switch (n) {
                    case(1):
                        SortingStudents.SortByGPA(st);
                        for (int i =0; i<st.length; i++) System.out.println(st[i].toString());
                        return;
                    case(2):
                        SortingStudents.SortByID(st);
                        for (int i =0; i<st.length; i++) System.out.println(st[i].toString());
                        return;
                    default: break;
                }
                break;
            case(2):
                System.out.println("Как будете искать? 1-ID, 2-средний балл, 3-фамилия: ");
                n = s.nextInt();
                switch (n) {
                    case (1):
                        System.out.println("Введите ID:");
                        n = s.nextInt();
                        if (Searching.IDSearch(st, n) != null)
                            System.out.println(Searching.IDSearch(st, n).toString());
                        else System.out.println("Ничего не найдено");
                        return;
                    case (2):
                        System.out.println("Введите средний балл:");
                        double d = Double.parseDouble(s.next().replace(",","."));
                        if (Searching.GPASearch(st, d) != null)
                            System.out.println(Searching.GPASearch(st, d).toString());
                        else System.out.println("Ничего не найдено");
                        return;
                    case (3):
                        System.out.println("Введите фамилию:");
                        String m = s.next();
                        try {
                            System.out.println(Searching.NameSearch(st, m).toString());
                        } catch (NameSearchException ex) {
                            System.out.println(ex);
                        }
                        return;
                    default:
                        break;
                }
            default: break;
        }
        System.out.println("Вы что-то сломали...");
        return;
    }
}

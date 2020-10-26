package ex_2;

public class Main {
    public static void main(String[] args) {
        Student[] st = new Student[]{
                new Student(1, 3.8),
                new Student(5, 2.35),
                new Student(2, 4.49),
                new Student(4, 5.0),
                new Student(0, 3.2)
        };

        SortingStudentsByGPA.quickSortByGPA(st, 0, st.length-1);

        for (var s: st) {
            System.out.println(s.toString());
        }
    }
}

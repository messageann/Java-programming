package ex_3;

public class Student {
    private int idNumber;
    private double gpa;

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public static Student[] mergeArrays(Student[] a1, Student[] a2) {
        int res = 0, j = 0;
        Student[] arr = new Student[a1.length+a2.length];
        for (int i = 0; i<a1.length; i++, res++) {
            for (; j<a2.length && a2[j].idNumber<a1[i].idNumber; j++, res++) arr[res] = a2[j];
            arr[res] = a1[i];
        }
        for (; j<a2.length; res++, j++) arr[res] = a2[j];
        return arr;
    }
}
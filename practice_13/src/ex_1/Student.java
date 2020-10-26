package ex_1;

import java.util.Comparator;
import java.util.List;

public class Student {
    private int idNumber;
    private double gpa;

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public int getIdNumber() { return idNumber; }

    public static void SortByID(Student[] array, int low, int high){
        if(array.length == 0 || low>=high) return;
        var middle = array[low+(high-low)/2].getIdNumber();
        int i = low, j = high;
        while(i <= j){
            while(array[i].getIdNumber() < middle) i++;
            while(array[j].getIdNumber() > middle) j--;
            if(i<=j){
                var t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
                t = null;
            }
        }
        if (low<j) SortByID(array, low, j);
        if(high>i) SortByID(array, i, high);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                '}';
    }
}
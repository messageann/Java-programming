package ex_2;

import java.util.Comparator;
import java.util.List;

public class Student {
    private int idNumber;
    private double gpa;
    private String name;

    public Student(String name, int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student " + name + "; idNumber = " + idNumber + ", gpa = " + gpa;
    }
}
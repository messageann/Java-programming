package ex_2;

public class Student {
    private int idNumber;
    private double gpa;

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public double getGPA() { return gpa; }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                '}';
    }
}
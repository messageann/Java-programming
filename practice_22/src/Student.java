import java.text.DateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Student {
    private final int idNumber;
    private double gpa;
    private final Date birthDate;

    public Student(int idNumber, double gpa, Date birthDate) {
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                ", birthDate=" + birthDate +
                '}';
    }

    public String toString(DateFormat df){
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                ", birthDate=" + df.format(birthDate) +
                '}';
    }
}

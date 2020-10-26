public class Student {
    private int idNumber;
    private double gpa;

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public int getIdNumber() { return idNumber; }
    public double getGPA() { return gpa; }

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

    public static Student SearchLinear(Student[] array, int idNumberForSearch){
        for(int i = 0;i < array.length; i++){
            if(array[i].getIdNumber() == idNumberForSearch) return array[i];
        }
        return null;
    }

    public static Student BinarySearch(Student[] array, int idNumberForSearch){
        int firstI = 0;
        int lastI = array.length-1;
        int middleI;
        while(firstI<=lastI){
            middleI = (firstI + lastI)/2;
            if(array[middleI].getIdNumber() == idNumberForSearch){
                return array[middleI];
            }
            else if(array[middleI].getIdNumber() < idNumberForSearch) firstI = middleI+1;
            else lastI = middleI-1;
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)) return false;
        var t = (Student)obj;
        return this.getIdNumber() == t.getIdNumber() && this.getGPA() == t.getGPA();
    }
}
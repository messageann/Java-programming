package ex_2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA()) return -1;
        else if (o1.getGPA() == o2.getGPA()) return 0;
        else return 1;
    }

    public static void quickSortByGPA(Student[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;
        var middle = array[low + (high - low) / 2].getGPA();
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getGPA() > middle) i++;
            while (array[j].getGPA() < middle) j--;
            if (i <= j) {
                var t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
                t = null;
            }
        }
        if (low < j) quickSortByGPA(array, low, j);
        if (high > i) quickSortByGPA(array, i, high);
    }

    public static Student[] mergeSortByGPA(Student[] array1) {
        Student[] buffer1 = array1;
        Student[] buffer2 = new Student[array1.length];
        Student[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1].getGPA() > sorted2[index2].getGPA()
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
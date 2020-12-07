package ex_2;

class SortingStudents {
    public static Student[] SortByGPA(Student[] array1) {
        Student[] buffer1 = array1;
        Student[] buffer2 = new Student[array1.length];
        Student[] result = mergesortInner(buffer1, buffer2, 0, array1.length, 0);
        return result;
    }

    public static Student[] SortByID(Student[] array1) {
        Student[] buffer1 = array1;
        Student[] buffer2 = new Student[array1.length];
        Student[] result = mergesortInner(buffer1, buffer2, 0, array1.length, 1);
        return result;
    }

    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2,
                                           int startIndex, int endIndex, int key) {
        if (startIndex >= endIndex - 1) return buffer1;

        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1, sorted2;
        if (key == 0) {
            sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle, 0);
            sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex, 0);
        } else {
            sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle, 1);
            sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex, 1);
        }

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            if (key == 0) {
                result[destIndex++] = sorted1[index1].getGPA() > sorted2[index2].getGPA()
                        ? sorted1[index1++] : sorted2[index2++];
            }
            else {
                result[destIndex++] = sorted1[index1].getIdNumber() > sorted2[index2].getIdNumber()
                        ? sorted1[index1++] : sorted2[index2++];
            }
        }
        while (index1 < middle) result[destIndex++] = sorted1[index1++];
        while (index2 < endIndex) result[destIndex++] = sorted2[index2++];
        return result;
    }
}

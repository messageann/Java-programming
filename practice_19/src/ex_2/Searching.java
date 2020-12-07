package ex_2;

public class Searching  {
    public static Student IDSearch(Student[] array, int idNumberForSearch){
        for(int i = 0;i < array.length; i++){
            if(array[i].getIdNumber() == idNumberForSearch) return array[i];
        }
        return null;
    }

    public static Student GPASearch(Student[] array, double GPAForSearch){
        for(int i = 0;i < array.length; i++){
            if(array[i].getGPA() == GPAForSearch) return array[i];
        }
        return null;
    }

    public static Student NameSearch(Student[] array, String NameForSearch) throws NameSearchException {
        for(int i = 0;i < array.length; i++){
            if(array[i].getName().equals(NameForSearch)) return array[i];
        }
        throw new NameSearchException("Ничего не найдено");
    }
}

class NameSearchException extends Exception {
    public NameSearchException(String message) {
        super(message);
    }
}





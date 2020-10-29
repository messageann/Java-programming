package ex_4;

import java.util.Arrays;

public class Main {
    public static void main (String args[]) {
        Nursery dogs = new Nursery();
        dogs.addDog(new Dog("keks", 3), new Dog("ukrop", 5));
        System.out.println(dogs.getDoggi());
    }
}

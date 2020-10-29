package ex_4;
/*Создание класса тестера под названием ПитомникСобак, реализует массив собак и основной
метод этого класса позволяет добавить в него несколько объектов собаки. */

import java.util.ArrayList;

public class Nursery {
    private ArrayList<Dog> doggi;

    public Nursery(){
        doggi = new ArrayList<>();
    }

    public void addDog(Dog... dogs){
        for (int i = 0; i < dogs.length; i++) {
            doggi.add(dogs[i]);
        }
    }

    public String getDoggi() {
        System.out.print("In nursery:\n");
        String s = doggi.get(0).toString();
        for (int i = 1; i < doggi.size(); i++) s += "\n" + doggi.get(i).toString();
        return s;
    }
}

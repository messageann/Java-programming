package ex_3;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeYear(int yearOfCreation) {
        this.year = yearOfCreation;
    }

    public int getYear() {
        return year;
    }

    public void getInfo() {
        System.out.println("Book " + getName() + " by " + getAuthor() + " was written in " + getYear());
    }
}

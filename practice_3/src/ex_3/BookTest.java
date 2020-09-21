package ex_3;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("A.S. Pushkin", "Demon", 1842);
        b.changeAuthor("M.Y. Lermontov");
        b.getInfo();
    }
}

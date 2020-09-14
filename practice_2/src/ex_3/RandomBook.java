package ex_3;

import java.text.MessageFormat;

public class RandomBook {
    int number, pages;
    String size, author, name;

    public String Pages() {
        pages = 1 + (int)(Math.random() * 1500);
        if (pages <= 50) size = "short";
        else if (pages < 150) size = "not very long";
        else size = "long";
        return size;
    }

    public String Author() {
        number = 1 + (int)(Math.random() * 3);
        switch (number) {
            case 1:
                author = "A. P. Chekhov";
                break;
            case 2:
                author = "M. Y. Lermontov";
                break;
            case 3:
                author = "I. A. Bunin";
                break;
        }
        return author;
    }

    public String Name() {
        if (author.equals("A. P. Chekhov")) {
            if (pages <= 50) name = "The Champagne";
            else if (pages < 150) name = "Kashtanka";
            else name = "Three Sisters";
        }
        if (author.equals("M. Y. Lermontov")) {
            if (pages <= 50) name = "The Demon";
            else if (pages < 150) name = "Masquerade";
            else name = "A Hero of Our Time";
        }
        if (author.equals("I. A. Bunin")) {
            if (pages <= 50) name = "Caucasus";
            else if (pages < 150) name = "The Gentleman from San Francisco";
            else name = "Light Breathing";
        }
        return name;
    }

    public String toString() {
        Pages();
        Author();
        Name();
        return MessageFormat.format("I recommend you to read one {0} book by {1} - {2}", size, author, name);
    }
}

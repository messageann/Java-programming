package ex_2;

public class Test {
    public static void main(String[] args) {
        Human man = new Human();

        man.setInfo(32, "Andrew");
        man.setColour("green");
        man.setSide(1);
        man.setSize(40);

        man.getProperties();
    }
}

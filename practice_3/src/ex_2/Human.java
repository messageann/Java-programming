package ex_2;

public class Human {
    private int age;
    private String name;
    public Hand arm;
    public Head eye;
    public Leg foot;

    public void setInfo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setSide (int n) {
        arm = new Hand(n);
    }

    public void setColour (String c) {
        eye = new Head(c);
    }

    public void setSize (int s) {
        foot = new Leg(s);
    }

    public void getProperties() {
        System.out.println("Name: " + name +"; age: " + age);
        System.out.println("Colour of eyes: " + eye.getColour());
        System.out.println("Size of shoes: " + foot.getSize());
        System.out.println("Writes by " + arm.getSide() + " hand");
    }
}

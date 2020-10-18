package ex_3;

public class Wardrobe extends Furniture {
    public int Boxes;
    public Wardrobe(String Colour, int Quantity, boolean Bought, int Boxes) {
        super(Colour, Quantity, Bought);
        this.Boxes = Boxes;
    }

    public void addBox() {
        Boxes++;
    }

    public void removeBox() {
        Boxes--;
    }

    public int get() {
        return Boxes;
    }

}

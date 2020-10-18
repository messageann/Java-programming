package ex_3;

public class Sofa extends Furniture {
    public boolean IsFolding;
    public Sofa(String Colour, int Quantity, boolean Bought, boolean IsFolding) {
        super(Colour, Quantity, Bought);
        this.IsFolding = IsFolding;
    }
}

package ex_3;

public abstract class Furniture {
    public int Quantity;
    public String Colour;
    public boolean Bought;

    public Furniture(String Colour, int Qiantity, boolean Bought) {
        this.Colour = Colour;
        this.Quantity = Qiantity;
        this.Bought = Bought;
    }

    public String getColour() {
        return Colour;
    }

    public int getQuantity() {
        return Quantity;
    }

    public boolean IsBought() {
        return Bought;
    }
}

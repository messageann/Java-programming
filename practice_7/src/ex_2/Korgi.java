package ex_2;

public class Korgi extends Dog{
    @Override
    public String getColour() {
        return Colour;
    }

    @Override
    public void CallByName() {
        if (!IsNear) IsNear = true;
    }
}

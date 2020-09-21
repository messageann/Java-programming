package ex_2;

public class Hand extends Human {
    private String write;
    public Hand(int side) {
        if (side == 1) write = "right";
        else write = "left";
    }

    public String getSide() {
        return write;
    }
}

package ex_1;

public class Glass extends Dish {
    @Override
    public void Wash() {
        if(!Clean) Clean = true;
    }

    @Override
    public void Eat() {
        if(IsFull) IsFull = false;
    }
}
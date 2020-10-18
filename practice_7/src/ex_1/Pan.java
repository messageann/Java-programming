package ex_1;

public class Pan extends Dish {
    @Override
    public void Eat() {
        if(IsFull) IsFull = false;
    }

    @Override
    public void Wash() {
        if(!Clean) Clean = true;
    }
}

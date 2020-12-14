public class Drink extends MenuItem implements Alcoholable {

    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {

        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }
}
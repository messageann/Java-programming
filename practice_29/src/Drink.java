public final class Drink implements Item {
    private int cost;
    private String name;
    private Dish description;

    public Drink(int cost, String name, Dish description) {
        try {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
        catch (IllegalArgumentException ex){
            if (cost < 0 || name == null || description == null)
                System.out.println(ex);
        }
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Dish getDescription() {
        return description;
    }
}
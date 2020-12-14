public class Main {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder();
        Drink pos1 = new Drink(50,"Water","Taste",0, DrinkTypeEnum.WATER);
        Drink pos2 = new Drink(500,"Rum","Taste",0, DrinkTypeEnum.RUM);
        Dish pos3 = new Dish(250,"Rice","Taste");

        order.add(pos1);
        order.add(pos2);
        order.add(pos3);
        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(order);

        MenuItem menuItem1 = new MenuItem(pos1.getCost(), pos1.getName(), pos1.getDescription());
        MenuItem menuItem2 = new MenuItem(pos2.getCost(), pos2.getName(), pos2.getDescription());
        MenuItem[] menu = new MenuItem[] {menuItem1, menuItem2};
        for (var t : menu) System.out.println(t.toString());
        System.out.println("Total for order: " + ordersManager.ordersCostSummary());
    }
}
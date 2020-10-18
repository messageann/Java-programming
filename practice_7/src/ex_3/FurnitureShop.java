package ex_3;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> Sales;

    public FurnitureShop() {
        Sales = new ArrayList<Furniture>();
    }

    public void AddSale(Furniture x){
        Sales.add(x);
    }

    public ArrayList<Furniture> getSales() {
        return Sales;
    }

    public void SellFurniture(Furniture f){
        Sales.remove(f);
    }
}

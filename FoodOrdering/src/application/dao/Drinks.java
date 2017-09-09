package application.dao;

import java.util.LinkedHashMap;

/**
 * Created by fmkam on 07.09.2017.
 */
public class Drinks {

    private String name;
    private int price;
    private LinkedHashMap<Integer, Drinks> drinksList = new LinkedHashMap<>();

    public Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Drinks(){
        Drinks cola = new Drinks("cola", 4);
        drinksList.put(1,cola);
        Drinks mineralWater = new Drinks("mineral water", 3);
        drinksList.put(2,mineralWater);
        Drinks beer = new Drinks("beer", 5);
        drinksList.put(3, beer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedHashMap<Integer, Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(LinkedHashMap<Integer, Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

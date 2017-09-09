package application.dao;

import java.util.LinkedHashMap;

/**
 * Created by fmkam on 07.09.2017.
 */
public class Italian {
    private String name;
    private int price;
    private LinkedHashMap<Integer, Italian> italcours = new LinkedHashMap();
    private LinkedHashMap<Integer, Italian> itadess = new LinkedHashMap();



    public Italian(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Italian(){
        Italian spaghetti = new Italian("spaghetti", 16);
        italcours.put(1, spaghetti);
        Italian pizza = new Italian ("pizza", 22);
        italcours.put(2, pizza);

        Italian tiramisu = new Italian("tiramisu", 9);
        itadess.put(1, tiramisu);
        Italian masscarpone = new Italian("masscarpone", 11);
        itadess.put(2, masscarpone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LinkedHashMap<Integer, Italian> getItalcours() {
        return italcours;
    }

    public void setItalcours(LinkedHashMap<Integer, Italian> italcours) {
        this.italcours = italcours;
    }

    public LinkedHashMap<Integer, Italian> getItadess() {
        return itadess;
    }

    public void setItadess(LinkedHashMap<Integer, Italian> itadess) {
        this.itadess = itadess;
    }

    @Override
    public String toString() {
        return "Italian{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", italcours=" + italcours +
                ", itadess=" + itadess +
                '}';
    }
}

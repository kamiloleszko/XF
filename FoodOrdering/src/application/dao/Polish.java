package application.dao;

import java.util.LinkedHashMap;

/**
 * Created by fmkam on 07.09.2017.
 */
public class Polish {
    private String name;
    private int price;
    private LinkedHashMap<Integer,Polish> polcours = new LinkedHashMap<>();
    private  LinkedHashMap<Integer, Polish> poldess = new LinkedHashMap<>();

    public Polish (String name, int price){
        this.name = name;
        this.price = price;
    }

    public Polish(){
        Polish pierogi = new Polish("pierogi", 20);
        polcours.put(1,pierogi);
        Polish golabki = new Polish("golabki", 15);
        polcours.put(2,golabki);

        Polish sernik = new Polish("sernik", 6);
        poldess.put(1,sernik);
        Polish beza = new Polish("beza", 7);
        poldess.put(2,beza);
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

    public LinkedHashMap<Integer, Polish> getPolcours() {
        return polcours;
    }

    public void setPolcours(LinkedHashMap<Integer, Polish> polcours) {
        this.polcours = polcours;
    }

    public LinkedHashMap<Integer, Polish> getPoldess() {
        return poldess;
    }

    public void setPoldess(LinkedHashMap<Integer, Polish> poldess) {
        this.poldess = poldess;
    }

    @Override
    public String toString() {
        return "Polish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

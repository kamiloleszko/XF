package application.dao;

import java.util.LinkedHashMap;

/**
 * Created by fmkam on 07.09.2017.
 */
public class Mexican {
    private String name;
    private int price;
    private LinkedHashMap<Integer, Mexican> mexcour = new LinkedHashMap();
    private LinkedHashMap<Integer,Mexican> mexdess = new LinkedHashMap();

    public Mexican(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Mexican(){
        Mexican buritto = new Mexican("buritto", 17);
        mexcour.put(1,buritto);
        Mexican tapas = new Mexican ("tapas", 10);
        mexcour.put(2,tapas);

        Mexican nachos = new Mexican("nachos", 9);
        mexdess.put(1,nachos);
        Mexican chiliConCarne = new Mexican("chiliConCarne", 11);
        mexdess.put(2,chiliConCarne);

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

    public LinkedHashMap<Integer,Mexican> getMexcour() {
        return mexcour;
    }

    public void setMexcour(LinkedHashMap<Integer, Mexican> mexcour) {
        this.mexcour = mexcour;
    }

    public LinkedHashMap<Integer, Mexican> getMexdess() {
        return mexdess;
    }

    public void setMexdess(LinkedHashMap<Integer, Mexican> mexdess) {
        this.mexdess = mexdess;
    }

    @Override
    public String toString() {
        return "Mexican{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

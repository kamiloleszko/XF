package application.main;

import application.dao.Drinks;
import application.dao.Italian;
import application.dao.Mexican;
import application.dao.Polish;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by fmkam on 07.09.2017.
 */
public class Main {

    private static LinkedList<String> order = new LinkedList<>();

    private static String options = "1. Food\n2. Drink\n3. Check Order\n4. Cancel Order and exit\n5. Confirm order and exit";
    private static String welcome = "Welcome in our restauratn. What would you like to order?";
    private static Polish pl = new Polish();
    private static Mexican mx = new Mexican();
    private static Italian it = new Italian();
    private static Drinks dr = new Drinks();
    private static LinkedHashMap<Integer,Polish> plc = pl.getPolcours();
    private static LinkedHashMap<Integer,Polish> pld = pl.getPoldess();
    private static LinkedHashMap<Integer,Mexican> mxc = mx.getMexcour();
    private static LinkedHashMap<Integer,Mexican> mxd = mx.getMexdess();
    private static LinkedHashMap<Integer,Italian> itc = it.getItalcours();
    private static LinkedHashMap<Integer,Italian> itd = it.getItadess();
    private static LinkedHashMap<Integer, Drinks> drinks = dr.getDrinksList();
    private static int insideCheck = 0;
    private static int insideCheckTwo = 0;
    private static int caseOne = 0;
    private static int caseTwo = 0;
    private static int sum = 0;

    public static void choseFromPoland(String mainCourseOrDesser){
        insideCheck = 0;
        Scanner fY = new Scanner(System.in);
        if (mainCourseOrDesser.equals("1")) {
            insideCheckTwo=0;
            do {
                polishRegionMain();
                String chose = fY.nextLine();
                switch (chose) {
                    case "1":
                        sum += plc.get(1).getPrice();
                        order.add(plc.get(1).getName());
                        System.out.println("Pierogi are added to your order");
                        insideCheckTwo=1;
                        break;
                    case "2":
                        sum += plc.get(2).getPrice();
                        order.add(plc.get(2).getName());
                        System.out.println("Golabki are added to your order");
                        insideCheckTwo=1;
                        break;
                    case "3":
                        insideCheckTwo=1;
                        break;
                    default:
                        System.out.println("Please chose correct option");
                }
            }while (insideCheckTwo ==0);
            insideCheck=1;
        } else if (mainCourseOrDesser.equals("2")) {
            insideCheckTwo=0;
            do {
                polishRegionDesser();
                String chose = fY.nextLine();
                switch (chose) {
                    case "1":
                        sum += pld.get(1).getPrice();
                        order.add(pld.get(1).getName());
                        System.out.println("dodano do zamowina sernik");
                        insideCheckTwo = 1;
                        break;
                    case "2":
                        sum += pld.get(2).getPrice();
                        order.add(pld.get(2).getName());
                        System.out.println("dodano do zamowina beza");
                        insideCheckTwo = 1;
                        break;
                    case "3":
                        insideCheckTwo = 1;
                        break;
                    default:
                        System.out.println("Please chose correct option");
                }
            }while (insideCheckTwo==0);
            insideCheck=1;
        } else if (mainCourseOrDesser.equals("3")){
            insideCheck = 1;
        } else {
            System.out.println("Plese chose correct option");
        }
    }

    public static void polishRegionMain(){
        System.out.println("Please select main dish");
        for (int a = 0; a<plc.size(); a++ ){
            System.out.println(a+1 +". " + plc.get(a+1).getName() + ", price: " + plc.get(a+1).getPrice());
            }
        System.out.println("3. Back");
        }

    public static void polishRegionDesser(){
        System.out.println("Please select desser");
        for (int a = 0; a<pld.size(); a++ ){
            System.out.println(a+1 +". " + pld.get(a+1).getName() + ", price: " + pld.get(a+1).getPrice());
        }
        System.out.println("3. Back");
    }

    public static void choseFromMexico(String mainCourseOrDesser){
        insideCheck = 0;
        Scanner fY = new Scanner(System.in);
        if (mainCourseOrDesser.equals("1")) {
            insideCheckTwo=0;
            do {
                mexicoRegionMain();
                String chose = fY.nextLine();
                switch (chose) {
                    case "1":
                        sum += mxc.get(1).getPrice();
                        order.add(mxc.get(1).getName());
                        System.out.println("Buritto is added to your order");
                        insideCheckTwo = 1;
                        break;
                    case "2":
                        sum += mxc.get(2).getPrice();
                        order.add(mxc.get(2).getName());
                        System.out.println("Tapas is added to your");
                        insideCheckTwo = 1;
                        break;
                    case "3":
                        insideCheckTwo = 1;
                        break;
                    default:
                        System.out.println("Please chose correct option");
                }
            }while (insideCheckTwo==0);
            insideCheck=1;
        } else if (mainCourseOrDesser.equals("2")) {
            insideCheckTwo=0;
            do {
                mexicoRegionDesser();
                String chose = fY.nextLine();
                switch (chose) {
                    case "1":
                        sum += mxd.get(1).getPrice();
                        order.add(mxd.get(1).getName());
                        System.out.println("dodano do zamowina nachos");
                        insideCheckTwo = 1;
                        break;
                    case "2":
                        sum += mxd.get(2).getPrice();
                        order.add(mxd.get(2).getName());
                        System.out.println("dodano do zamowina chiliConCarne");
                        insideCheckTwo = 1;
                        break;
                    case "3":
                        insideCheckTwo = 1;
                        break;
                    default:
                        System.out.println("Please chose correct option abc");
                }
            }while (insideCheckTwo==0);
            insideCheck=1;
        } else if (mainCourseOrDesser.equals("3")){
            insideCheck = 1;
        } else {
            System.out.println("Plese chose correct option");
        }
    }

    public static void mexicoRegionMain(){
        System.out.println("Please select main dish");
        for (int a = 0; a<mxc.size(); a++ ){
            System.out.println(a+1 +". " + mxc.get(a+1).getName() + ", price: " + mxc.get(a+1).getPrice());
        }
        System.out.println("3. Back");
    }

    public static void mexicoRegionDesser(){
        System.out.println("Please select desser");
        for (int a = 0; a<mxd.size(); a++ ){
            System.out.println(a+1 +". " + mxd.get(a+1).getName() + ", price: " + mxd.get(a+1).getPrice());
        }
        System.out.println("3. Back");
    }

    public static void choseFromItaly(String mainCourseOrDesser){
        insideCheck = 0;
        Scanner fY = new Scanner(System.in);
        if (mainCourseOrDesser.equals("1")) {
            insideCheckTwo=0;
            do {
                italianRegionMain();
                String chose = fY.nextLine();
                switch (chose) {
                    case "1":
                        sum += itc.get(1).getPrice();
                        order.add(itc.get(1).getName());
                        System.out.println("Spaghetti is added to your order");
                        insideCheckTwo = 1;
                        break;
                    case "2":
                        sum += itc.get(2).getPrice();
                        order.add(itc.get(2).getName());
                        System.out.println("Pizza is added to your order");
                        insideCheckTwo = 1;
                        break;
                    case "3":
                        insideCheckTwo = 1;
                        break;
                    default:
                        System.out.println("Please chose correct option");
                }
            }while (insideCheckTwo==0);
            insideCheck=1;
        } else if (mainCourseOrDesser.equals("2")) {
            insideCheckTwo=0;
            do {
                italianRegionDesser();
                String chose = fY.nextLine();
                switch (chose) {
                    case "1":
                        sum += itd.get(1).getPrice();
                        order.add(itd.get(1).getName());
                        System.out.println("dodano do zamowina tiramisu");
                        insideCheckTwo = 1;
                        break;
                    case "2":
                        sum += itd.get(2).getPrice();
                        order.add(itd.get(2).getName());
                        System.out.println("dodano do zamowina masscarpone");
                        insideCheckTwo = 1;
                        break;
                    case "3":
                        insideCheckTwo = 1;
                        break;
                    default:
                        System.out.println("Please chose correct option");
                }
            }while (insideCheckTwo==0);
            insideCheck=1;
        } else if (mainCourseOrDesser.equals("3")){
            insideCheck = 1;
        } else {
            System.out.println("Plese chose correct option");
        }
    }

    public static void italianRegionMain(){
        System.out.println("Please select main dish");
        for (int a = 0; a<itc.size(); a++ ){
            System.out.println(a+1 +". " + itc.get(a+1).getName() + ", price: " + itc.get(a+1).getPrice());
        }
        System.out.println("3. Back");
    }

    public static void italianRegionDesser(){
        System.out.println("Please select desser");
        for (int a = 0; a<itd.size(); a++ ){
            System.out.println(a+1 +". " + itd.get(a+1).getName() + ", price: " + itd.get(a+1).getPrice());
        }
        System.out.println("3. Back");
    }

    public static void showDrink(){
        System.out.println("Please select drink");
        for (int a = 0; a<drinks.size(); a++ ){
            System.out.println(a+1 +". " + drinks.get(a+1).getName() + ", price: " + drinks.get(a+1).getPrice());
        }
        System.out.println("4. Back");
    }

    public static void selectDrink() {
        insideCheck = 0;
        Scanner fY = new Scanner(System.in);
        String chose = fY.nextLine();
        String iceCubes;
        String lemon;
        switch (chose) {
            case "1":
                sum += drinks.get(1).getPrice();
                order.add(drinks.get(1).getName());
                System.out.println("Cola is added to your order");
                System.out.println("would you like to add ice cubes?\n1. Yes\n2. No");
                iceCubes = fY.nextLine();
                addIceCubes(iceCubes);
                System.out.println("would you like to add lemon?\n1. Yes\n2. No");
                lemon = fY.nextLine();
                addLemon(lemon);
                caseTwo = 1;
                break;
            case "2":
                sum += drinks.get(2).getPrice();
                order.add(drinks.get(2).getName());
                System.out.println("Mineral water is added to your order");
                System.out.println("would you like to add ice cubes?\n1. Yes\n2. No");
                iceCubes = fY.nextLine();
                addIceCubes(iceCubes);
                System.out.println("would you like to add lemon?\n1. Yes\n2. No");
                lemon = fY.nextLine();
                caseTwo = 1;
                break;
            case "3":
                sum += drinks.get(3).getPrice();
                order.add(drinks.get(3).getName());
                System.out.println("Beer is added to your order");
                caseTwo = 1;
                break;
            case "4":
                caseTwo = 1;
                break;
            default:
                System.out.println("Please chose correct option");

        }
    }

    public static void addIceCubes(String iceCubes){
        int a = 0;
        do{
            switch (iceCubes){
                case "1":
                    String lastOrder = order.getLast();
                    order.remove(lastOrder);
                    order.add(lastOrder + " + ice cubes");
                    System.out.println(order.getLast() + " is added to your order");
                    a=1;
                    break;
                case "2":
                    a=1;
                    break;
                default:
                    System.out.println("Please chose correct option");
            }

        }while (a==0);

    }

    public static void addLemon(String lemon){
        int a=0;
        do{
            switch (lemon){
                case "1":
                    String lastOrder = order.getLast();
                    order.remove(lastOrder);
                    order.add(lastOrder + " + lemon");
                    System.out.println(order.getLast() + " is added to your order");
                    a=1;
                    break;
                case "2":
                    a=1;
                    break;
                default:
                    System.out.println("Please chose correct option");
            }

        }while (a==0);

    }

    public static void checkOrder(){
        System.out.println("Your current order:");
        for (int z = 0; z <order.size(); z++){
            System.out.println(z+1 + ". " + order.get(z));
        }
        System.out.println("Total price is: " + sum);
    }

    public static void cancelOrder(){
        System.out.println("Your order has been canceled");
        order.clear();
        sum = 0;
    }



    public static void main(String[] args) {

        Scanner fromUser = new Scanner(System.in);
        int i = 0;

            do {
                System.out.println(welcome);
                System.out.println(options);
                String choseFoodorDrink = fromUser.nextLine();

                switch (choseFoodorDrink) {
                    case "1":
                        do {
                            System.out.println("Which region you prefer?\n1. Poland\n2. Mexico\n3. Italy\n4. Back");
                            String region = fromUser.nextLine();
                            switch (region) {
                                case "1":
                                    do {
                                        System.out.println("1. Main Course\n2. Desser\n3. Back");
                                        String mainCourseOrDesserPL = fromUser.nextLine();
                                        choseFromPoland(mainCourseOrDesserPL);
                                    } while (insideCheck == 0);
                                    caseOne =1;
                                    break;

                                case "2":
                                    do {
                                        System.out.println("1. Main Course\n2. Desser\n3. Back");
                                        String mainCourseOrDesserMX = fromUser.nextLine();
                                        choseFromMexico(mainCourseOrDesserMX);
                                    } while (insideCheck == 0);
                                    caseOne =1;
                                    break;

                                case "3":
                                    do {
                                        System.out.println("1. Main Course\n2. Desser\n3. Back");
                                        String mainCourseOrDesserIT = fromUser.nextLine();
                                        choseFromItaly(mainCourseOrDesserIT);
                                    } while (insideCheck == 0);
                                    caseOne =1;
                                    break;

                                case "4":
                                    caseOne =1;
                                    break;
                                default:
                                    System.out.println("Please chose correct option");
                            }
                        } while (caseOne == 0);
                            break;

                    case "2":
                        do {
                            showDrink();
                            selectDrink();
                        } while (caseTwo == 0);
                        break;

                    case "3":
                        checkOrder();
                        break;

                    case "4":
                        cancelOrder();
                        System.out.println("Thank you and goodbye");
                        i =1;
                        break;

                    case "5":
                        checkOrder();
                        System.out.println("Thank you and goodbye");
                        i =1;
                        break;

                    default:
                        System.out.println("please chose correct option");
                }
            } while (i == 0);
    }
}

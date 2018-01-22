package nl.kadaster.builder.jasper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final public class PizzaDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Pizza> order = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            processOrder();
        }
    }

    public static void processOrder() {
        System.out.print("Welke pizza wilt u? ");
        String input = scanner.next();

        switch (input) {
            case "Hawai":
                order.add(new Pizza("Hawai","Italiaans", "mild", "ananas"));
                break;
            case "Pepperoni":
                order.add(new Pizza("Pepperoni","Amerikaans", "heet", "pepperoni"));
                break;
            case "klaar":
                printOrder();
            default:
                System.out.println("Hebben we niet");
        }
    }

    public static void printOrder() {
        System.out.println("\nUw bestelling:");

        for (Pizza pizza : order) {
            System.out.printf("Pizza %s, %s, saus: %s met %s%n", pizza.getName(), pizza.getDough(), pizza.getSauce(), pizza.getTopping());
        }
        System.out.println("\nBedankt voor uw bestelling");
        System.exit(0);
    }
}

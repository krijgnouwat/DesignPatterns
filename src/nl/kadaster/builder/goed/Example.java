package nl.kadaster.builder.goed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final public class Example {

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
                order.add(new Pizza.PizzaBuilder("Hawai", "Italiaans", "mild").topping("ananas").topping("ham")
                                                                              .topping("ananas").build());
                break;
            case "Pepperoni":
                order.add(
                  new Pizza.PizzaBuilder("Pepperoni", "Amerikaans", "heet").topping("pepperoni").topping("salami")
                                                                           .topping("jalapeno peper").build());
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
            System.out.printf("Pizza %s, %s, saus: %s", pizza.getName(), pizza.getDough(), pizza.getSauce());

            for (String topping : pizza.getToppings()) {
                System.out.printf(" met %s", topping);
            }

            System.out.println();
        }
        System.out.println("\nBedankt voor uw bestelling");
        System.exit(0);
    }
}

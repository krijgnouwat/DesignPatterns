package nl.kadaster.builder.factoryVraagteken;

import java.util.Scanner;

/* A customer ordering a pizza. */
public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welke pizza wilt u? ");
        String input = scanner.next();

        switch (input) {
            case "Hawai":
                waiter.setPizzaBuilder(hawaiianPizzabuilder);
                break;
            case "Pepperoni":
                waiter.setPizzaBuilder(spicyPizzaBuilder);
            default:
                System.out.println("Hebben we niet");
                System.exit(0);
        }

        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(
          "U heeft een " + input + " pizza besteld " + pizza.getDough() + ", " + pizza.getSauce() + " met " +
          pizza.getTopping());
    }
}

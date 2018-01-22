package nl.kadaster.builder.goed;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String name; // required
    private final String dough; // required
    private final String sauce; // required
    private final List<String> toppings; // optional

    private Pizza(PizzaBuilder builder) {
        this.name = builder.name;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }


    public static class PizzaBuilder {
        private final String name;
        private final String dough;
        private final String sauce;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder(String name, String dough, String sauce) {
            this.name = name;
            this.dough = dough;
            this.sauce = sauce;
        }


        public PizzaBuilder topping(String topping) {
            this.toppings.add(topping);
            return this;
        }


        //        public Pizza build() {
        //
        //            return new Pizza(this);
        //        }

        public Pizza build() {
            Pizza pizza = new Pizza(this);
            for (String topping : pizza.toppings) {
                if (topping.length() > 50) {
                    throw new IllegalStateException("Topping niet mogelijk"); // thread-safe
                }
            }
            return pizza;
        }
    }
}

package nl.kadaster.builder.jasper;

public class Pizza {

    private String name;
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String name, String dough, String sauce, String topping) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public String getName() {return name;    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}

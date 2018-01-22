package nl.kadaster.builder.factoryVraagteken;

/* "Product" */
public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    // getters door mij toegevoegd
    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
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

package Mentoring.BuilderPrototype.builder;

import Mentoring.BuilderPrototype.model.Pasta;
import Mentoring.BuilderPrototype.model.Pizza;

public class MenuItemBuilder {
    private String flavour;
    private Integer price;
    private String veggie;

    public MenuItemBuilder setFlavour(String flavour) {
        this.flavour = flavour;
        return this;
    }

    public MenuItemBuilder setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public MenuItemBuilder setVeggie(String veggie) {
        this.veggie = veggie;
        return this;
    }

    public Pasta buildPasta() {
        return new Pasta(flavour, price, veggie);
    }

    public Pizza buildPizza() {
        return new Pizza(flavour, price, veggie);
    }
}
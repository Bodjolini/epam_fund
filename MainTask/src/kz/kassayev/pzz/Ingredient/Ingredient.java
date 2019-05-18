package kz.kassayev.pzz.Ingredient;

public enum Ingredient {
    TOMATO_PASTE(1f),
    CHEESE(1f),
    SALAMI(1.5f),
    BACON(1.2f),
    GARLIC(0.3f),
    CORN(0.7f),
    PEPPERONI(0.6f),
    OLIVES(0.5f);

    private float price;

    Ingredient(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }


}

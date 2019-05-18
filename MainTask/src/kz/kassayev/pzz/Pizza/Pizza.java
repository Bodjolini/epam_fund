package kz.kassayev.pzz.Pizza;

import kz.kassayev.pzz.Client.Client;
import kz.kassayev.pzz.Ingredient.Ingredient;
import kz.kassayev.pzz.Order.Order;

import java.util.Arrays;

import static java.lang.System.exit;

public class Pizza {
    private static final int MIN_LENGTH_NAME = 4;
    private static final int MAX_LENGTH_NAME = 20;
    private static final int MAX_INGREDIENTS = 7;
    private static final int MAX_PIZZA_COUNT = 10;
    private String name;
    private boolean Calzone;
    private int count;
    private Client client;
    private Order order;
    private Ingredient[] ingredients = new Ingredient[MAX_INGREDIENTS];

    public Pizza(String name, boolean Calzone, int count, Client client, Order order) {
        if (name.length() >= MIN_LENGTH_NAME && name.length() <= MAX_LENGTH_NAME) {
            this.name = name;
        } else {
            this.name = client.getName() + "_" + order.getOrderId();
        }
        this.Calzone = Calzone;
        if (count <= MAX_PIZZA_COUNT) {
            this.count = count;
        } else {
            System.out.println("Max count 10, set count again");
            exit(0);
        }
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public Client getClient() {
        return client;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public double getBase() {
        if (this.Calzone) {
            return 1.5;
        } else {
            return 1;
        }
    }

    public double countPrice() {
        double pizzaPrice = 1;
        if (this.Calzone) {
            pizzaPrice += 0.5;
        }
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                pizzaPrice += ingredient.getPrice();
            }
        }
        pizzaPrice *= count;
        return pizzaPrice;
    }

    public void addNewIngredient(Ingredient ingredient) {
        if (Arrays.asList(ingredients).contains(ingredient)) {
            System.out.println("This ingredient has already been added.");
        } else {
            for (int i = 0; i < ingredients.length; i++) {
                if (ingredients[i] == null) {
                    ingredients[i] = ingredient;
                    break;
                }
            }
        }
    }
}
package kz.kassayev.pzz.Order;

import kz.kassayev.pzz.Ingredient.Ingredient;
import kz.kassayev.pzz.Pizza.Pizza;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.ZoneId;

public class Order {
    private static final int MAX_PIZZA_COUNT = 10;
    private int orderId;
    private int clientId;
    private Pizza[] pizzes = new Pizza[MAX_PIZZA_COUNT];
    private LocalTime created;
    private DecimalFormat df = new DecimalFormat("#.###");


    public Order(int orderId, int clientId) {
        this.orderId = orderId;
        this.clientId = clientId;
        created = LocalTime.now(ZoneId.systemDefault());
    }

    public Pizza[] getPizzesArray() {
        return pizzes;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addPizza(Pizza pzs) {
        for (int i = 0; i < pizzes.length; i++) {
            if (pizzes[i] == null) {
                pizzes[i] = pzs;
                break;
            }
        }
    }

    public void infoAboutOrders(int i) {
        System.out.println("[" + orderId + ":" + clientId + ":" + pizzes[i].getName() + ":" + pizzes[i].getCount() + "]");
    }

    public void deleteOldPizza(int n) {
        for (int i = 0; i < pizzes.length; i++) {
            if (i == n) {
                pizzes[i] = null;
                break;
            }
        }
    }

    public void printCheck() {
        double result = 0;
        System.out.println("*********************************************");
        System.out.println("Order : " + orderId);
        System.out.println("Client : " + clientId);
        System.out.println("Time : " + created);
        System.out.println("---------------------------------------------");
        for (Pizza pizza : pizzes) {
            if (pizza != null) {
                System.out.println("Pizza name : " + pizza.getName());
                System.out.println("---------------------------------------------");
                if (pizza.getBase() == 1.5) {
                    System.out.println("Pizza base (Calzone) : " + pizza.getBase() + "€");
                } else {
                    System.out.println("Pizza base : " + pizza.getBase() + "€");
                }
                for (Ingredient ingredient : pizza.getIngredients()) {
                    if (ingredient != null) {
                        System.out.println(ingredient + " : " + ingredient.getPrice() + "€");
                    }
                }
                System.out.println("---------------------------------------------");
                System.out.println("Count : " + pizza.getCount());
                result += pizza.countPrice();
                System.out.println("Total price of " + pizza.getName() + " : " + df.format(pizza.countPrice()) + "€");
                System.out.println("---------------------------------------------");
            }
        }
        System.out.println("Total amount : " + df.format(result) + "€");
        System.out.println("*********************************************");
    }
}

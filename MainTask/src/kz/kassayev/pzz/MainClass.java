package kz.kassayev.pzz;

import kz.kassayev.pzz.Client.Client;
import kz.kassayev.pzz.Ingredient.Ingredient;
import kz.kassayev.pzz.Order.Order;
import kz.kassayev.pzz.Pizza.Pizza;

public class MainClass {
    public static void main(String[] args) {
        Client client = new Client(1, "Serzhan");
        Order order = new Order(2134, client.getId());
        Pizza california = new Pizza("Californiashgsfhsfdhhdjkf", true, 5, client, order);
        Pizza prosciutto = new Pizza("Prosciutto", false, 3, client, order);
        Pizza primavera = new Pizza("Primavera",true,2,client,order);

        california.addNewIngredient(Ingredient.BACON);
        california.addNewIngredient(Ingredient.TOMATO_PASTE);
        california.addNewIngredient(Ingredient.GARLIC);
        california.addNewIngredient(Ingredient.OLIVES);
        california.addNewIngredient(Ingredient.CORN);

        prosciutto.addNewIngredient(Ingredient.GARLIC);
        prosciutto.addNewIngredient(Ingredient.CHEESE);
        prosciutto.addNewIngredient(Ingredient.OLIVES);
        prosciutto.addNewIngredient(Ingredient.SALAMI);
        prosciutto.addNewIngredient(Ingredient.PEPPERONI);

        primavera.addNewIngredient(Ingredient.CHEESE);
        primavera.addNewIngredient(Ingredient.OLIVES);
        primavera.addNewIngredient(Ingredient.SALAMI);
        primavera.addNewIngredient(Ingredient.TOMATO_PASTE);

        order.addPizza(california);
        order.addPizza(prosciutto);
        order.addPizza(primavera);
        order.infoAboutOrders(0);
        order.infoAboutOrders(1);
        order.infoAboutOrders(2);
        order.printCheck();
    }
}

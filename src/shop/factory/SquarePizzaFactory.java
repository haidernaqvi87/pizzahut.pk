package shop.factory;

import shop.items.pizza.Pizza;
import shop.items.pizza.square.SquareFajita;
import shop.items.pizza.square.SquareTikka;

public class SquarePizzaFactory implements AbstractFactory {

    @Override
    public Pizza getPizza(String pizzaName) {
        switch (pizzaName){
            case "Fajita":
                return new SquareFajita();
            case "Tikka":
                return new SquareTikka();
            default:
                throw new IllegalStateException(
                        "We dont have that Square "+pizzaName);
        }
    }

}
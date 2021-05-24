package shop.factory;

import shop.items.pizza.Pizza;
import shop.items.pizza.triangle.TriangleFajita;

public class TrianglePizzaFactory implements AbstractFactory {

    @Override
    public Pizza getPizza(String pizzaName) {
        switch (pizzaName){
            case "Fajita":
                return new TriangleFajita();
            default:
                throw new IllegalStateException(
                        "We dont have that Triangle "+pizzaName);
        }
    }

}
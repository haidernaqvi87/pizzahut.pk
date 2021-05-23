package shop.factory;

import shop.Pizza;
import shop.pizzas.triangle.TriangleFajita;

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
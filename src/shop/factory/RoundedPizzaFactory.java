package shop.factory;

import shop.Pizza;
import shop.pizzas.rounded.RoundedFajita;
import shop.pizzas.rounded.RoundedTikka;

public class RoundedPizzaFactory implements AbstractFactory {

    @Override
    public Pizza getPizza(String pizzaName) {
        switch (pizzaName){
            case "Fajita":
                return new RoundedFajita();
            case "Tikka":
                return new RoundedTikka();
            default:
                throw new IllegalStateException(
                        "We dont have that Rounded "+pizzaName);
        }
    }
}

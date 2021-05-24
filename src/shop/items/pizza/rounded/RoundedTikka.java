package shop.items.pizza.rounded;
import shop.items.pizza.Pizza;

public class RoundedTikka extends Pizza {

    public RoundedTikka() {
        this.name = "Rounded Tikka";
        this.price = 700.0;
    }

    @Override
    public void makePizza() {
        System.out.print("Making a Tikka");
    }

}
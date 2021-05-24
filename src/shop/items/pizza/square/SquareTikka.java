package shop.items.pizza.square;
import shop.items.pizza.Pizza;

public class SquareTikka extends Pizza {

    public SquareTikka() {
        this.name = "Square Tikka";
        this.price = 700.0;
    }

    @Override
    public void makePizza() {
        System.out.print("Making a Tikka");
    }

}
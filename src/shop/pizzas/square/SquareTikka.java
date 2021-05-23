package shop.pizzas.square;
import shop.Pizza;

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
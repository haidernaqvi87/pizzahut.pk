package shop.pizzas.square;
import shop.Pizza;

public class SquareFajita extends Pizza {

     public SquareFajita() {
        this.name = "Square Fajita";
        this.price = 550.0;
    }

    @Override
    public void makePizza() {
        System.out.print("Making a Fajita");
    }

}

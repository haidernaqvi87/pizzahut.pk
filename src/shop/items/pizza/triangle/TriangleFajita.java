package shop.items.pizza.triangle;
import shop.items.pizza.Pizza;

public class TriangleFajita extends Pizza {

     public TriangleFajita() {
        this.name = "Triangle Fajita";
        this.price = 550.0;
    }

    @Override
    public void makePizza() {
        System.out.print("Making a Fajita");
    }
}

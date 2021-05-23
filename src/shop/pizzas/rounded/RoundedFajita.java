package shop.pizzas.rounded;
import shop.Pizza;

public class RoundedFajita extends Pizza {

     public RoundedFajita() {
        this.name = "Rounded Fajita";
        this.price = 550.0;
    }

    @Override
    public void makePizza() {
        System.out.print("Making a Fajita");
    }

}

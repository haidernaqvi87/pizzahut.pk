package shop.factory;

public class PizzaFactoryProducer {

    public static AbstractFactory getFactory(String shapeType) {
        switch (shapeType) {
            case "Rounded":
                return new RoundedPizzaFactory();
            case "Square":
                return new SquarePizzaFactory();
            case "Triangle":
                return new TrianglePizzaFactory();
            default:
                throw new IllegalStateException("We dont have that shape");
        }
    }
}

package shop.factory;

import shop.items.pizza.Pizza;

public interface AbstractFactory {
    public Pizza getPizza(String shapeType) ;
}
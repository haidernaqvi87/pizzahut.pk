package shop.factory;

import shop.Pizza;

public interface AbstractFactory {
    public Pizza getPizza(String shapeType) ;
}
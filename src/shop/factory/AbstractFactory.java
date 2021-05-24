package shop.factory;

import shop.items.pizza.Pizza;

public interface AbstractFactory {
     Pizza getPizza(String shapeType) ;
}
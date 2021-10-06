package com.company;

public class PizzaDecorator implements Pizza{

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String addTopping() {
        return this.pizza.addTopping();
    }
}

package com.company;

public class ChickenSpicyPizza extends PizzaDecorator{


    public ChickenSpicyPizza(Pizza pizza) {
        super(pizza);
    }

    public String addChicken(){
        return "Adding chicken + 1.50$ \n";
    }

    @Override
    public String addTopping() {
        return super.addTopping() + addChicken();
    }
}

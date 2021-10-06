package com.company;

public class ChickenCheeseSpicyPizza extends PizzaDecorator{


    public ChickenCheeseSpicyPizza(Pizza pizza) {
        super(pizza);
    }

    public String addCheese(){
        return "Adding extra cheese + 0.50$";
    }

    @Override
    public String addTopping() {
        return super.addTopping() + addCheese();
    }
}

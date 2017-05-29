package decoratorDesignPattern.coffeeMakingScenario;

import compositeDesignPattern.AnotherExample.Section;

/**
 * Created by vipuljain on 28/05/17.
 */
public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";

    public CoffeeDecorator(Coffee decoratedCoffee)
    {
        this.decoratedCoffee = decoratedCoffee ;

    }

    /*public double getCost()
    {

        return decoratedCoffee.getCost();
    }

    public String getIngredients()
    {
        return decoratedCoffee.getIngredients();
    }*/
}

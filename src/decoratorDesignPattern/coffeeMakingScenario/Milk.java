package decoratorDesignPattern.coffeeMakingScenario;

/**
 * Created by vipuljain on 28/05/17.
 */
public class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost()
    {
        return decoratedCoffee.getCost() + 0.5;
    }

    public String getIngredients()
    {

        return decoratedCoffee.getIngredients() + ingredientSeparator + " Milk";
    }

}

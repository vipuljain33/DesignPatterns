package decoratorDesignPattern.coffeeMakingScenario;

/**
 * Created by vipuljain on 28/05/17.
 */
public class Sprinkles extends CoffeeDecorator {
    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost()
    {

        return decoratedCoffee.getCost() + 0.2;
    }

    public String getIngredients()
    {

        return decoratedCoffee.getIngredients() + ingredientSeparator + " Sprinkles";

    }
}

package decoratorDesignPattern.coffeeMakingScenario;

/**
 * Created by vipuljain on 28/05/17.
 */
public class Whip extends CoffeeDecorator {
    public Whip(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost()
    {

        return decoratedCoffee.getCost() + 0.7;
    }

    public String getIngredients()
    {

        return decoratedCoffee.getIngredients() + ingredientSeparator + " Whip";
    }
}

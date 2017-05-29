package decoratorDesignPattern.coffeeMakingScenario;

/**
 * Created by vipuljain on 28/05/17.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}

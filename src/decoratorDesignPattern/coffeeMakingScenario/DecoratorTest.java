package decoratorDesignPattern.coffeeMakingScenario;

/**
 * Created by vipuljain on 28/05/17.
 */
public class DecoratorTest {

    public static void main(String[] args)
    {

        Coffee c = new SimpleCoffee();
        System.out.println("Cost: " + c.getCost() + " Ingredients: " + c.getIngredients());

        c = new Milk(c);
        System.out.println("Cost: " + c.getCost() + " Ingredients: " + c.getIngredients());

        c= new Whip(c);
        System.out.println("Cost: " + c.getCost() + " Ingredients: " + c.getIngredients());

        c=new Sprinkles(c);
        System.out.println("Cost: " + c.getCost() + " Ingredients: " + c.getIngredients());

    }
}

package decoratorDesignPattern;

/**
 * Created by vipuljain on 28/05/17.
 */
public class TestDecorator
{

    public static void main(String[] args)
    {

        House house = new LightsDecorator(new ColorDecorator(new SimpleHouse()));

        System.out.println(house.makeHouse());



    }
}

package decoratorDesignPattern;

/**
 * Created by vipuljain on 28/05/17.
 */
public class LightsDecorator extends HouseDecorator {
    public LightsDecorator(House house) {
        super(house);
    }

    private String addLights()
    {

        return " + Lights ";
    }

    public String makeHouse()
    {


        return house.makeHouse() + addLights();
    }
}

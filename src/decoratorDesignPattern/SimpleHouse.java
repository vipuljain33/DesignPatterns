package decoratorDesignPattern;

/**
 * Created by vipuljain on 28/05/17.
 */
public class SimpleHouse implements House {
    @Override
    public String makeHouse() {
        return "Base House";
    }
}

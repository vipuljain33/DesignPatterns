package flyweightDesignPattern;

/**
 * Created by vipuljain on 29/05/17.
 */
public class FlyweightMultiplier implements Flyweight {

    String operation;

    public FlyweightMultiplier() {
        operation = "multiplying";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
    }
}

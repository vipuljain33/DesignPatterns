package flyweightDesignPattern;

/**
 * Created by vipuljain on 29/05/17.
 */
public class FlyweightAdder implements Flyweight {

    String operation;

    public FlyweightAdder() {
        operation = "adding";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
    }
}

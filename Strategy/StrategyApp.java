import item.Fruit;
import strategy.BakePieStrategy;
import strategy.MakeJuiceStrategy;

public class StrategyApp {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Apple");

        Context context = new Context();


        context.setStrategy(new MakeJuiceStrategy());
        context.executeStrategy(fruit);

        context.setStrategy(new BakePieStrategy());
        context.executeStrategy(fruit);
    }
}
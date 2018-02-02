import item.Fruit;
import strategy.Strategy;

public class Context {
    Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void executeStrategy(Fruit fruit) {
        if(strategy == null) {
            throw new IllegalArgumentException("Please initialize strategy");
        }
        strategy.execute(fruit);
    }
}
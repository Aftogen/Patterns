package strategy;

import item.Fruit;

public class BakePieStrategy implements Strategy {
    public void execute(Fruit target) {
        System.out.println("Baking Pie from " + target);
    }
}
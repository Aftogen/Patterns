package strategy;

import item.Fruit;

public class MakeJuiceStrategy implements Strategy {
    public void execute(Fruit target) {
        System.out.println("Making juice from " + target);
    }
}
package item;

public class Fruit {
    private String type;

    public Fruit(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return type;
    }
}

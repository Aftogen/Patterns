package furniture;

public class Table extends Furniture {
    public Table(StyleType styleType) {
        super(styleType);
    }

    @Override
    public void testMethod() {
        System.out.println("I cant sit on this Table");
    }
}

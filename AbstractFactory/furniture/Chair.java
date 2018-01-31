package furniture;

public class Chair extends Furniture {

    public Chair(StyleType styleType) {
        super(styleType);
    }

    @Override
    public void testMethod() {
        System.out.println("I can on this chair");
    }
}

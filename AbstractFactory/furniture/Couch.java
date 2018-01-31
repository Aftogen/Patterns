package furniture;

public class Couch extends Furniture {

    public Couch(StyleType styleType) {
        super(styleType);
    }

    @Override
    public void testMethod() {
        System.out.println("I can on this couch");
    }
}

package furniture;

public abstract class Furniture {
    private StyleType styleType;

    public Furniture(StyleType styleType) {
        this.styleType = styleType;
    }

    public void getDescription() {
        System.out.println("This is " + styleType.name().toLowerCase() + " " + getClass().getSimpleName().toLowerCase());
    }

    public void testMethod(){
        System.out.println("Furniture class");
    }

}

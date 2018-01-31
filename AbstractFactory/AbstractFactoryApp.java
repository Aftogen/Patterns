import furniture.*;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        Furniture furniture0 = ImbaFactory.createFurniture(FurnitureType.COUCH, StyleType.MODERN);
        furniture0.getDescription();
        furniture0.testMethod();

        Furniture furniture1 = ImbaFactory.createFurniture(FurnitureType.CHAIR, StyleType.MODERN);
        furniture1.getDescription();
        furniture1.testMethod();

        Furniture furniture2 = ImbaFactory.createFurniture(FurnitureType.TABLE, StyleType.MODERN);
        furniture2.getDescription();
        furniture2.testMethod();

        Furniture furniture3 = ImbaFactory.createFurniture(FurnitureType.COUCH, StyleType.ART);
        furniture3.getDescription();
        furniture3.testMethod();

        Furniture furniture4 = ImbaFactory.createFurniture(FurnitureType.CHAIR, StyleType.ART);
        furniture4.getDescription();
        furniture4.testMethod();

        Furniture furniture5 = ImbaFactory.createFurniture(FurnitureType.TABLE, StyleType.ART);
        furniture5.getDescription();
        furniture5.testMethod();

        Furniture furniture6 = ImbaFactory.createFurniture(FurnitureType.COUCH, StyleType.CLASSIC);
        furniture6.getDescription();
        furniture6.testMethod();

        Furniture furniture7 = ImbaFactory.createFurniture(FurnitureType.CHAIR, StyleType.CLASSIC);
        furniture7.getDescription();
        furniture7.testMethod();

        Furniture furniture8 = ImbaFactory.createFurniture(FurnitureType.TABLE, StyleType.CLASSIC);
        furniture8.getDescription();
        furniture8.testMethod();

        /*
        sout:

        This is modern couch
        This is modern chair
        This is modern table
        This is art couch
        This is art chair
        This is art table
        This is classic couch
        This is classic chair
        This is classic table
        */

        System.out.println("-----------------------------------------");

        System.out.println("Classic collection:");
        FurnitureCollection collection = new FurnitureCollection(StyleType.CLASSIC);
        collection.printCollection();
        collection.clearCollection();

        System.out.println("Art collection:");
        FurnitureCollection collection2 = new FurnitureCollection(StyleType.ART);
        collection2.printCollection();
        collection2.clearCollection();

        System.out.println("Classic collection:");
        FurnitureCollection collection3 = new FurnitureCollection(StyleType.MODERN);
        collection3.printCollection();
        collection3.clearCollection();
        /*
        sout:

        Classic collection:
        This is classic chair
        This is classic couch
        This is classic table
        Art collection:
        This is art chair
        This is art couch
        This is art table
        Classic collection:
        This is modern chair
        This is modern couch
        This is modern table
        */

    }
}


import furniture.*;

public class Solution {

    public static void main(String[] args) {
        Furniture furniture0 = ImbaFactory.createFurniture(FurnitureType.COUCH, StyleType.MODERN);
        furniture0.getDescription();

        Furniture furniture1 = ImbaFactory.createFurniture(FurnitureType.CHAIR, StyleType.MODERN);
        furniture1.getDescription();

        Furniture furniture2 = ImbaFactory.createFurniture(FurnitureType.TABLE, StyleType.MODERN);
        furniture2.getDescription();

        Furniture furniture3 = ImbaFactory.createFurniture(FurnitureType.COUCH, StyleType.ART);
        furniture3.getDescription();

        Furniture furniture4 = ImbaFactory.createFurniture(FurnitureType.CHAIR, StyleType.ART);
        furniture4.getDescription();

        Furniture furniture5 = ImbaFactory.createFurniture(FurnitureType.TABLE, StyleType.ART);
        furniture5.getDescription();

        Furniture furniture6 = ImbaFactory.createFurniture(FurnitureType.COUCH, StyleType.CLASSIC);
        furniture6.getDescription();

        Furniture furniture7 = ImbaFactory.createFurniture(FurnitureType.CHAIR, StyleType.CLASSIC);
        furniture7.getDescription();

        Furniture furniture8 = ImbaFactory.createFurniture(FurnitureType.TABLE, StyleType.CLASSIC);
        furniture8.getDescription();

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
    }
}
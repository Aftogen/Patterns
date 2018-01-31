import furniture.*;

import java.util.HashSet;

public class FurnitureCollection {
    private HashSet<Furniture> collection;

    /**
     * Creates all types of Furniture with selected StyleType
     *
     * @param styleType set Collection StyleType.
     */
    public FurnitureCollection(StyleType styleType) {
        collection = new HashSet<>();
        for (FurnitureType type : FurnitureType.values()) {
            collection.add(ImbaFactory.createFurniture(type, styleType));
        }
    }

    public void printCollection() {
        for (Furniture furniture : collection) {
            furniture.getDescription();
        }
    }

    public void clearCollection() {
        collection.clear();
    }

}

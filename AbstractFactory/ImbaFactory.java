
import furniture.*;

public class ImbaFactory {
    public static Furniture createFurniture(FurnitureType furnitureType, StyleType styleType) {

        //Null check
        if (furnitureType == null || styleType == null)
            throw new IllegalArgumentException("FurnitureType or StyleType cant be null");

        switch (furnitureType) {
            case CHAIR:
                return new Chair(styleType);
            case COUCH:
                return new Couch(styleType);
            case TABLE:
                return new Table(styleType);
            default:
                throw new IllegalArgumentException("Wrong ");
        }
    }
}

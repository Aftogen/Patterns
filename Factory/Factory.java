
public class Factory {

    public static Throwable getThrowable(Enum en) {

        //null check
        if (en == null)
            return new IllegalArgumentException("Enum argument cant be null!");

        //Create message:
        String message = en.name().toLowerCase().replaceAll("_", " ");
        message = Character.toString(message.charAt(0)).toUpperCase() + message.substring(1); //first letter uppercase

        //factory:
        String className = en.getDeclaringClass().getSimpleName();
        switch (className) {
            case "ExceptionApplicationMessage":
                return new Exception(message);
            case "ExceptionDBMessage":
                return new RuntimeException(message);
            case "ExceptionUserMessage":
                return new Error(message);
            default:
                return new IllegalArgumentException("Wrong type of enum argument");
        }

    }

}

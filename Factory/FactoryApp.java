public class FactoryApp {
    public static void main(String[] args) throws Throwable {

        Throwable throwable = Factory.getThrowable(null);
        // throw throwable;
        // sout:
        // Exception in thread "main" java.lang.IllegalArgumentException: Enum argument cant be null!

        Throwable throwable2 = Factory.getThrowable(ExceptionApplicationMessage.SOCKET_IS_CLOSED);
        Throwable throwable3 = Factory.getThrowable(ExceptionApplicationMessage.UNHANDLED_EXCEPTION);
        // throw throwable2;
        // sout:
        // Exception in thread "main" java.lang.Exception: Socket is closed

        // throw throwable3;
        // sout:
        // Exception in thread "main" java.lang.Exception: Unhandled exception

        Throwable throwable4 = Factory.getThrowable(ExceptionDBMessage.NOT_ENOUGH_CONNECTIONS);
        Throwable throwable5 = Factory.getThrowable(ExceptionDBMessage.RESULT_HAS_NOT_GOTTEN_BECAUSE_OF_TIMEOUT);
        // throw throwable4;
        // sout:
        // Exception in thread "main" java.lang.Exception: Socket is closed

        // throw throwable5;
        // sout:
        // Exception in thread "main" java.lang.RuntimeException: Result has not gotten because of timeout

        Throwable throwable6 = Factory.getThrowable(ExceptionUserMessage.USER_DOES_NOT_EXIST);
        Throwable throwable7 = Factory.getThrowable(ExceptionUserMessage.USER_DOES_NOT_HAVE_PERMISSIONS);
        // throw throwable6;
        // sout:
        // Exception in thread "main" java.lang.Error: User does not exist

        // throw throwable7;
        // sout:
        // Exception in thread "main" java.lang.Error: User does not have permissions



    }
}

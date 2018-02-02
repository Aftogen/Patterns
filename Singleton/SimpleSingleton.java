public class SimpleSingleton {

    private static SimpleSingleton _instance = null;

    private SimpleSingleton() {}

    public static synchronized SimpleSingleton getInstance() {
        if (_instance == null)
            _instance = new SimpleSingleton();
        return _instance;
    }
}

package patterns.singleton;

/**
 * Thread safe, lazy instantiation implementation of singleton pattern
 */
public class Singleton {
    public final static Singleton INSTANCE = new Singleton();

    private Singleton() {
        // Exists only to defeat instantiation.
    }
}

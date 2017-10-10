package patterns.singleton;

import java.util.logging.Logger;

public class ClassicSingleton {
    private static ClassicSingleton singleton = null;
    private static Logger logger = Logger.getAnonymousLogger();
    private static boolean firstThread = true;

    protected ClassicSingleton() {
        // Exists only to defeat instantiation.
    }

    public static synchronized ClassicSingleton getInstance() {
        if (singleton == null) {
            simulateRandomActivity();
            singleton = new ClassicSingleton();
        }
        logger.info("created singleton: " + singleton);
        return singleton;
    }

    private static void simulateRandomActivity() {
        try {
            if (firstThread) {
                firstThread = false;
                logger.info("sleeping...");
                // This nap should give the second thread enough time
                // to get by the first thread.
                Thread.currentThread().sleep(50);
            }
        } catch (InterruptedException ex) {
            logger.warning("Sleep interrupted");
        }
    }
}
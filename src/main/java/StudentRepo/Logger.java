package StudentRepo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Logger {
    private java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AppLog");
    private FileHandler fh;

    public Logger() {
        try {
            try {
                fh = new FileHandler("./AppLog.txt");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("My first log");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        logger.info("Hello");
    }
}

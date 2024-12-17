package loggingframework;

public class LoggingFrameworkDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.debug("Hello, I am Yash");
        logger.info("I work at Walmart");
        logger.error("I am a good boy");
    }
}

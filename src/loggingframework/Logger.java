package loggingframework;

import loggingframework.appender.ConsoleAppender;

public class Logger {
    public static Logger instance;
    private LogConfig logConfig;
    private Logger() {
        logConfig = new LogConfig(LogLevel.ERROR, new ConsoleAppender());
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public void log(LogLevel logLevel , String message) {
        if(logLevel.getValue()  >= logConfig.getLogLevel().getValue()) {
            logConfig.getLogAppender().append(new LogMessage(message));
        }
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }
}

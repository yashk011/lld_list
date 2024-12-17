package loggingframework;

import loggingframework.appender.LogAppender;

public class LogConfig {
    LogLevel logLevel;
    LogAppender logAppender;

    public LogConfig(LogLevel logLevel, LogAppender logAppender) {
        this.logLevel = logLevel;
        this.logAppender = logAppender;
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public  LogAppender getLogAppender() {
        return this.logAppender;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogAppender(LogAppender logAppender) {
        this.logAppender = logAppender;
    }

}

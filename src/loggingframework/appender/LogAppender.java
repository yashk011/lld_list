package loggingframework.appender;

import loggingframework.LogMessage;

public interface LogAppender {
    public void append(LogMessage message);
}

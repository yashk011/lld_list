package loggingframework.appender;

import loggingframework.LogMessage;

public class FileAppender implements LogAppender {
    @Override
    public void append(LogMessage message) {
        System.out.println("Adding to File -  " + message);

    }
}

package com.example.logger;

import com.example.logger.Appender.ILogAppender;

public class LoggerConfig {
    private LogLevel logLevel;
    private ILogAppender logAppender;

    public LoggerConfig(LogLevel logLevel, ILogAppender logAppender) {
        this.logLevel = logLevel;
        this.logAppender = logAppender;
    }

    public void setLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogAppender(ILogAppender logAppender) {
        this.logAppender = logAppender;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public ILogAppender getLogAppender() {
        return logAppender;
    }
}

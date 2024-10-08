package com.example.logger;

import com.example.logger.Appender.ConsoleAppender;

public class Logger {
    private static final Logger instance = new Logger();
    private LoggerConfig config;

    public Logger() {
        this.config = new LoggerConfig(LogLevel.DEBUG, new ConsoleAppender());
    }

    public static Logger getInstance() {
        return instance;
    }

    public void setConfig(LoggerConfig config) {
        this.config = config;
    }

    private void log(LogLevel logLevel, String message) {
        if (logLevel.ordinal() >= config.getLogLevel().ordinal()) {
            LogMessage logMessage = new LogMessage(logLevel, message);
            config.getLogAppender().append(logMessage);
        }
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warning(String message) {
        log(LogLevel.WARNING, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void fatal(String message) {
        log(LogLevel.FATAL, message);
    }
}

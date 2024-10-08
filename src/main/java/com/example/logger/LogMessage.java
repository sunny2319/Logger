package com.example.logger;

public class LogMessage {
    private final LogLevel level;
    private final String message;
    private final long timestamp;

    public long getTimestamp() {
        return timestamp;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public LogMessage(LogLevel level, String message) {
        this.level = level;
        this.message = message;
        timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "[" + level + "] " + timestamp + " - " + message;
    }
}

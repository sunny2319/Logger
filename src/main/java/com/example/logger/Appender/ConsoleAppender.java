package com.example.logger.Appender;


import com.example.logger.LogMessage;

public class ConsoleAppender implements ILogAppender {
    @Override
    public void append(LogMessage logMessage) {
        System.out.println(logMessage);
    }
}

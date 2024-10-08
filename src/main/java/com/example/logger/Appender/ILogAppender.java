package com.example.logger.Appender;

import com.example.logger.LogMessage;

public interface ILogAppender {
    void append(LogMessage logMessage);

}

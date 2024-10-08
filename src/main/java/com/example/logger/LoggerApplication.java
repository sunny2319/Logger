package com.example.logger;

import com.example.logger.Appender.ConsoleAppender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LoggerApplication.class, args);
        Logger logger = Logger.getInstance();
        logger.setConfig(new LoggerConfig(LogLevel.DEBUG, new ConsoleAppender()));
        logger.debug("testing debug");
    }

}

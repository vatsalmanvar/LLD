package LLDProblems.LoggingFramework;

public interface Logger {
    void debug(String message);
    void info(String message);
    void error(String message);
    void warn(String message);
}

/*
Problem Statement
Design and implement a flexible and extensible logging framework that can be used by applications to log messages at
different levels (INFO, DEBUG, ERROR, etc.), support multiple output destinations (console, file, etc.),
and allow for custom formatting of log messages.

Requirements
Log Levels: Support for multiple log levels (INFO, DEBUG, ERROR, etc.).
Multiple Appenders: Ability to log to different destinations (console, file, etc.).
Custom Formatting: Support for custom log message formatting.
Configuration: Ability to configure loggers and appenders.
Thread Safety: Should be thread-safe for concurrent logging.
Extensibility: Easy to add new log levels, appenders, or formatters.

Entities:
1) Log Level
2) Appender (observer)
3) Formate



 */
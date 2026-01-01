package LLDProblems.LoggingFramework.strategy.appender;

import LLDProblems.LoggingFramework.entities.LogMessage;

public interface LogAppender {
    void append(LogMessage logMessage);
}

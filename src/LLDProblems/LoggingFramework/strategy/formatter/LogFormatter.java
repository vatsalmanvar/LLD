package LLDProblems.LoggingFramework.strategy.formatter;

import LLDProblems.LoggingFramework.entities.LogMessage;

public interface LogFormatter {
    String format(LogMessage logMessage);
}

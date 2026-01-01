package LLDProblems.LoggingFramework;

import LLDProblems.LoggingFramework.entities.LogLevel;
import LLDProblems.LoggingFramework.strategy.appender.LogAppender;
import LLDProblems.LoggingFramework.strategy.formatter.LogFormatter;

import java.util.List;

public class LoggerConfig {
    private List<LogAppender> appender;
    private LogLevel level;

    public LoggerConfig(LogLevel level, List<LogAppender> appenders){
        this.appender = appenders;
        this.level = level;
    }

    public List<LogAppender> getAppender(){
        return appender;
    }

    public LogLevel getLevel(){
        return level;
    }

}

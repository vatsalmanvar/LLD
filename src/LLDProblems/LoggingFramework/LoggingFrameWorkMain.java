package LLDProblems.LoggingFramework;

import LLDProblems.LoggingFramework.entities.LogLevel;
import LLDProblems.LoggingFramework.entities.LoggerConfig;
import LLDProblems.LoggingFramework.strategy.appender.ConsoleAppender;
import LLDProblems.LoggingFramework.strategy.appender.LogAppender;
import LLDProblems.LoggingFramework.strategy.formatter.LogFormatter;
import LLDProblems.LoggingFramework.strategy.formatter.SimpleFormatter;

import java.util.List;


public class LoggingFrameWorkMain {
    public static void main(String args[]){
        LogFormatter formatter = new SimpleFormatter();
        LogAppender appender = new ConsoleAppender(formatter);
        //LogAppender appender2 = new ConsoleAppender(formatter);

        List<LogAppender> appenders = List.of(appender);

        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG, appenders);

        Logger logger = new DefaultLogger("demo logger", config);

        logger.debug("This is log 1");
        logger.error("This is log 2");
        logger.info("This is log 3");
        logger.warn("This is log 4");
    }
}

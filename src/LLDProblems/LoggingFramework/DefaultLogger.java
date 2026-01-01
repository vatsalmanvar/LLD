package LLDProblems.LoggingFramework;

import LLDProblems.LoggingFramework.entities.LogLevel;
import LLDProblems.LoggingFramework.entities.LogMessage;
import LLDProblems.LoggingFramework.entities.LoggerConfig;
import LLDProblems.LoggingFramework.strategy.appender.LogAppender;

public class DefaultLogger implements Logger{
    private final String name;
    private LoggerConfig config;

    public DefaultLogger(String name, LoggerConfig config){
        this.name = name;
        this.config = config;
    }

    @Override
    public void debug(String message){
        log(LogLevel.DEBUG, message);
    }
    @Override
    public void info(String message){
        log(LogLevel.INFO, message);
    }
    @Override
    public void error(String message){
        log(LogLevel.ERROR, message);
    }
    @Override
    public void warn(String message){
        log(LogLevel.WARN, message);
    }

    public void log(LogLevel level, String msg){

        if (!level.isEnabled(config.getLevel())) {
            return;
        }

        LogMessage message = new LogMessage(name, level, msg, Thread.currentThread().getName());

        for(LogAppender appender : config.getAppender()){
            appender.append(message);
        }
    }

}

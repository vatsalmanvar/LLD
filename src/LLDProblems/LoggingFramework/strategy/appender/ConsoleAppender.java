package LLDProblems.LoggingFramework.strategy.appender;

import LLDProblems.LoggingFramework.entities.LogMessage;
import LLDProblems.LoggingFramework.strategy.formatter.LogFormatter;

public class ConsoleAppender implements LogAppender{

    private LogFormatter formatter;

    public ConsoleAppender(LogFormatter formatter){
        this.formatter = formatter;
    }

    @Override
    public synchronized void append(LogMessage message){
        String msg = formatter.format(message);
        System.out.println(msg+" - appended");
    }
}

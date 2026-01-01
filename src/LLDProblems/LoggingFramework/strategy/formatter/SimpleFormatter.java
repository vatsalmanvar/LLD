package LLDProblems.LoggingFramework.strategy.formatter;

import LLDProblems.LoggingFramework.entities.LogMessage;

public class SimpleFormatter implements LogFormatter{

    @Override
    public String format(LogMessage message){
        System.out.println("Simple formated the log message");
        return "Simply formated msg : "+message.getMessageString();
    }
}

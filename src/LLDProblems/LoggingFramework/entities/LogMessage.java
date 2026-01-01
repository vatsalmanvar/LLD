package LLDProblems.LoggingFramework.entities;

public class LogMessage {

    private final String loggerName;
    private final LogLevel logLevel;
    private final String message;
    private final long timeStamp;
    private final String threadName;

    public LogMessage(String loggerName,
                      LogLevel logLevel,
                      String message,
                      String threadName){
        this.loggerName = loggerName;
        this.logLevel = logLevel;
        this.message = message;
        timeStamp = 2323;
        this.threadName = threadName;
    }

    public String getMessageString(){return this.message;}
}

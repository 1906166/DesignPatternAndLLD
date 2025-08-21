package ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "This is an error log");
        logObject.log(LogProcessor.DEBUG, "This is a debug log");
        logObject.log(LogProcessor.INFO, "This is a info log");
    }
}

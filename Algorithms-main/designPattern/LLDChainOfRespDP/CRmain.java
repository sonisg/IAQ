package LLDChainOfRespDP;

public class CRmain {

    public static void main(String args[]){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, " exception");
        logProcessor.log(LogProcessor.DEBUG, " debug happens");
        logProcessor.log(LogProcessor.INFO, " INFO");

    }
}

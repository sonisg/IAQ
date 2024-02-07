package LLDChainOfRespDP;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int loglevel, String message){
            if(loglevel==DEBUG){
            System.out.println("Debug" + message);
        } else{
            super.log(loglevel,message);
        }
    }
}
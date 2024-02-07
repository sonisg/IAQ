package LLDChainOfRespDP;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int loglevel, String message){
        if(loglevel==INFO){
            System.out.println("Info" + message);
        } else{
            super.log(loglevel,message);
        }
    }
}

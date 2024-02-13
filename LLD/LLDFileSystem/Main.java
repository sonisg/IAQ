package LLDObserverDP;

public class Main {

    public static void  main (String args[]){

        YouTubeChannel channel = new YouTubeChannel();
        Subscriber aman = new Subscriber("aman");
        Subscriber raman = new Subscriber("raman");
        channel.subscribe(aman);
        channel.subscribe(raman);
        channel.notifyChanges();
    }
}

package LLDObserverDP;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);

    }

    @Override
    public void notifyChanges() {
        for(Observer o: this.subscribers){
            o.notified();
        }
    }
}

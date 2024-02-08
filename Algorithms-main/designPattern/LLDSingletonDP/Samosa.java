package LLDSingletonDP;

import java.io.Serializable;

public class Samosa implements Serializable {

    //Lazy way of creating singleton object
    private static Samosa samosa;

    //Constructor
    private Samosa() {
//        if(samosa!=null){
//            throw new RuntimeException("Trying to break singleton");
//        }
        System.out.println("Samosa");
    }

    public static Samosa getSamosa(){
        if (samosa == null) {
            synchronized (Samosa.class){
                if(samosa==null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    };

    public Object readResolve(){
        return samosa;
    }
}

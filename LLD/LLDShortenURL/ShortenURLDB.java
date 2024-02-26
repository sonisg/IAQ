package LLDShortenURL;

import java.util.HashMap;

public class ShortenURLDB {

    public HashMap<String, String> shortToLongMap;

    public HashMap<String, String> longToShortMap;

    public ShortenURLDB() {
        shortToLongMap = new  HashMap<>();
        longToShortMap = new  HashMap<>();
    }

    public HashMap<String, String> getShortToLongMap() {
        return shortToLongMap;
    }

    public void setShortToLongMap(HashMap<String, String> shortToLongMap) {
        this.shortToLongMap = shortToLongMap;
    }

    public HashMap<String, String> getLongToShortMap() {
        return longToShortMap;
    }

    public void setLongToShortMap(HashMap<String, String> longToShortMap) {
        this.longToShortMap = longToShortMap;
    }
}

package LLDCacheDesign;

public interface EvictionPolicy <K>{

    void onPut(K key);
    void onGet(K key);
    void onEvict(K key);
    boolean isValid(K key);
}

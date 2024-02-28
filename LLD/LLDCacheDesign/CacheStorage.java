package LLDCacheDesign;

public interface CacheStorage<K,V> {
    void put(K key, V val);

    V get( K key);

    void remove(K key);


}

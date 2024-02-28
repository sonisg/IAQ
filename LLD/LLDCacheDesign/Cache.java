package LLDCacheDesign;

import java.util.HashMap;
import java.util.Map;

public class Cache<K,V> implements CacheStorage<K,V>{

    private Map<K,V> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }

    @Override
    public void put(K key, V val) {
        cache.put(key,val);
    }

    @Override
    public V get(K key) {
        return cache.get(key);
    }

    @Override
    public void remove(K key) {
        cache.remove(key);
    }
}

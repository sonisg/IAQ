package LLDCacheDesign;

public class CacheManager<K,V> {
    private CacheStorage<K, V> cacheStorage;
    private EvictionPolicy<K> evictionPolicy;

    public CacheManager(CacheStorage<K, V> cacheStorage, EvictionPolicy<K> evictionPolicy) {
        this.cacheStorage = cacheStorage;
        this.evictionPolicy = evictionPolicy;
    }

    public void put(K key, V value) {
        cacheStorage.put(key, value);
        evictionPolicy.onPut(key);
    }

    public V get(K key) {
        V value = cacheStorage.get(key);
        if (value != null && evictionPolicy.isValid(key)) {
            evictionPolicy.onGet(key);
            return value;
        }
        return null;
    }

    public void evict(K key) {
        cacheStorage.remove(key);
        evictionPolicy.onEvict(key);
    }
}

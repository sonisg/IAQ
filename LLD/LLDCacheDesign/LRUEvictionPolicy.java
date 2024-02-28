package LLDCacheDesign;

import java.util.LinkedHashMap;

public class LRUEvictionPolicy <K> implements EvictionPolicy<K>{

    private LinkedHashMap<K, Long> accessOrderMap;
    private final int maxSize;

    public LRUEvictionPolicy(int maxSize) {
        this.maxSize = maxSize;
        this.accessOrderMap = new LinkedHashMap<>(maxSize, 0.75f, true);
    }

    @Override
    public void onPut(K key) {
        if (!accessOrderMap.containsKey(key)) {
            refreshAccessOrder(key);
            evictIfNecessary();
        } else {
            refreshAccessOrder(key);
        }
    }

    private void refreshAccessOrder(K key) {
        accessOrderMap.put(key, System.nanoTime());
    }
    private void evictIfNecessary() {
        if (accessOrderMap.size() > maxSize) {
            K leastRecentlyUsedKey = accessOrderMap.entrySet().iterator().next().getKey();
            accessOrderMap.remove(leastRecentlyUsedKey);
        }
    }

    @Override
    public void onGet(K key) {
        refreshAccessOrder(key);
    }

    @Override
    public void onEvict(K key) {

    }

    public boolean isValid(K key) {
        return accessOrderMap.containsKey(key);
    }
}

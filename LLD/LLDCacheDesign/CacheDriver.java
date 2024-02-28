package LLDCacheDesign;

public class CacheDriver {
    public static void main(String[] args) {
        // Create a cache with a maximum size of 3 and LRU eviction policy
        Cache<String, Integer> cache = new Cache<>();
        EvictionPolicy<String> evictionPolicy = new LRUEvictionPolicy<>(3);
        CacheManager<String, Integer> cacheManager = new CacheManager<>(cache, evictionPolicy);

        // Put some values into the cache
        cacheManager.put("a", 1);
        cacheManager.put("b", 2);
        cacheManager.put("c", 3);

        // Get values from the cache
        System.out.println("Value for key 'a': " + cacheManager.get("a")); // Should print 1
        System.out.println("Value for key 'b': " + cacheManager.get("b")); // Should print 2
        System.out.println("Value for key 'c': " + cacheManager.get("c")); // Should print 3

        // Access 'a' and 'b' again to update their access order
        cacheManager.get("a");
        cacheManager.get("b");

        cacheManager.put("d", 4);
        cacheManager.get("d");
        System.out.println("Value for key 'd': " + cacheManager.get("d"));
        // Try to get 'c' from the cache (should return null)
        System.out.println("Value for key 'c' after eviction: " + cacheManager.get("c")); // Should print null
    }
}
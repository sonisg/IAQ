class RandomizedSet {

   private ArrayList<Integer> values;
    private HashMap<Integer, Integer> valToIndex;
    private Random rand;

    public RandomizedSet() {
        values = new ArrayList<>();
        valToIndex = new HashMap<>();
         rand = new Random();    
    }
    
    public boolean insert(int val) {
        if(valToIndex.containsKey(val)){
            return false;
        }
        valToIndex.put(val, values.size());
        values.add(val);
        return true;      
    }
    
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false; 
        }

        int indexToRemove = valToIndex.get(val);
        int lastValue = values.get(values.size() - 1);

        values.set(indexToRemove, lastValue);
        valToIndex.put(lastValue, indexToRemove);

        values.remove(values.size() - 1);
        valToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(values.size());
        return values.get(randomIndex);
    }
}

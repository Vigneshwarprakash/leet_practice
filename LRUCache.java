import java.util.SequencedMap;
class LRUCache{
    int capacity;
    SequencedMap<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map = new LinkedHashMap<>();
    }    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        int val=map.get(key);
        update(key,val);
        return val;
    }
    public void put(int key, int value) {
        map.putFirst(key,value);
        if(map.size()>this.capacity)
            map.pollLastEntry();        
    }
    public void update(int key,int val){
        map.remove(key);
        map.putFirst(key,val);
    }
}


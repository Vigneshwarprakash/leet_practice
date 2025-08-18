public class RandomizedSet {
    private HashMap<Integer,Integer> map;
    private List<Integer> array;
    private Random rand;

    public RandomizedSet() {
        map=new HashMap<>();
        array=new ArrayList<>();
        rand=new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,array.size());
        array.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int last=array.get(array.size()-1);
        int index=map.get(val);
        array.set(index,last);
        map.put(last,index);
        array.remove(array.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return array.get(rand.nextInt(array.size()));
    }
}
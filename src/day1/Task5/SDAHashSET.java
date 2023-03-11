package day1.Task5;

import java.util.HashMap;

public class SDAHashSET {

    private HashMap<String , Integer > sdaMap;
    public SDAHashSET(){
        this.sdaMap = new HashMap<>();
    }
    public void add (String key, Integer value) {
        sdaMap.put(key, value);
    }
    public void remove (String key) {
        sdaMap.remove(key);
    }
    public int size() {
        return sdaMap.size();
    }
    public boolean contains(String key) {
        return sdaMap.containsKey(key);
    }
    public void clear() {
        sdaMap.clear();
    }

}


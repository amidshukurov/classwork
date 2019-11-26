package classroom._23_11_2019;


public class Entry<K,V> {
    private final K key;
    private final V val;

    public Entry(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return val;
    }
}

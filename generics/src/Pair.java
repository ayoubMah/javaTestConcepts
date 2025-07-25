public class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K k, V v){
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value){
        this.value = value;
    }


}

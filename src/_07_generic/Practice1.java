package _07_generic;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Practice1 {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("One", 1);
        Pair<Integer, String> p2 = new Pair<>(2, "Two");

        System.out.println("Key: " + p1.getKey() + ", " + "Value: " + p1.getValue());
        System.out.println("Key: " + p2.getKey() + ", " + "Value: " + p2.getValue());
    }

}

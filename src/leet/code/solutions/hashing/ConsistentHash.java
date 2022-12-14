package leet.code.solutions.hashing;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/*
https://tom-e-white.com/2007/11/consistent-hashing.html

public class ConsistentHash<T> {

    private final HashFunction hashFunction;//can be MD5 - better not using in build hashcode
    private final int numberOfReplicas;
    private final SortedMap<Integer, T> circle = new TreeMap<Integer, T>();

    public ConsistentHash(HashFunction hashFunction, int numberOfReplicas, Collection<T> nodes) {

        this.hashFunction = hashFunction;
        this.numberOfReplicas = numberOfReplicas;

        for (T node : nodes) {
            add(node);
        }
    }

    public void add(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            circle.put(hashFunction.hash(node.toString() + i), node);
        }
    }

    public void remove(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            circle.remove(hashFunction.hash(node.toString() + i));
        }
    }

    public T get(Object key) {
        if (circle.isEmpty()) {
            return null;
        }

        int hash = hashFunction.hash(key);

        if (!circle.containsKey(hash)) {

            //Returns: a view of the portion of this map whose keys are greater than or equal to fromKey(hash)
            SortedMap<Integer, T> tailMap = circle.tailMap(hash);

            hash = tailMap.isEmpty() ? circle.firstKey() : tailMap.firstKey();//Returns the first (lowest) key currently in this map.

        }

        return circle.get(hash);
    }

}
 */
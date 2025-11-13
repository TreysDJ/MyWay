package bro.maks.brawl;

interface Map<V> {
    V get(String key);

    V put(String key, V value);

    V remove(String key);

    int size();

    boolean isEmpty();

    boolean containsKey(String key);

    boolean containsValue(V value);

}
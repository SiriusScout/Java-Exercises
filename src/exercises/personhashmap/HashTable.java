package exercises.personhashmap;

public interface HashTable<K,V> {
	
	public V get(K key);
	public void put(K key, V value);
	public void remove(K key);
	public Boolean containsKey(K key);
	public Integer size();

}

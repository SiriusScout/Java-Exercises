package exercises.genericmap;

public interface GenericMap<K,V> {
	
	//Setters
	public void addKey(K key);
	public void addValue(V value);
	
	//Getters
	public K getKey();
	public V getValue();
	
	public String toString();
}

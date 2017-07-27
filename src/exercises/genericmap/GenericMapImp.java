package exercises.genericmap;

//this class behaves like a basic element of a map
public class GenericMapImp<K,V> implements GenericMap<K,V>{
	private K key;
	private V value;
	
	GenericMapImp() {
		
	}
	
	GenericMapImp(K key, V value){
		this.key = key;
		this.value = value;
	}

	@Override
	public void addKey(K key) {
		this.key = key;	
	}

	@Override
	public void addValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return key.toString() + " " + value.toString();
	}
}

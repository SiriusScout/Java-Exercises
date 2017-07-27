package exercises.personhashmap;

import java.util.ArrayList;
import java.util.List;

//personal implementation of a hash map
public class PersonalHashTable<K,V> implements HashTable<K,V>{
	private List<K> tableKey;
	private List<V> tableValues;
	private Integer size;
	
	PersonalHashTable(){
		tableKey = new ArrayList<K>();
		tableValues = new ArrayList<V>();
		size = 0;
	}

	//gets the value based on the key given
	@Override
	public V get(K key) {
		Integer index = 0;
		V value = null;
		
		for(K keyElem : tableKey) {
			if(keyElem.equals(key)) {
				value = tableValues.get(index);
				break;
			}
			index++;
		}
		
		return value;
	}

	//puts the value for the key
	@Override
	public void put(K key, V value) {
		Integer index = 0;
		
		if(size != 0) {
			for(K keyElem : tableKey) {
				if(keyElem.equals(key)) {
					break;
				}
				index++;
			}
		}
		
		if(size == index) {
			tableValues.add(value);
			tableKey.add(key);
		}
		else {
			tableValues.add(index, value);
		}
		size++;
	}

	//removes the key and value associated with that key
	@Override
	public void remove(K key) {
		Integer index = 0;
		
		if(tableKey.contains(key)) {
			for(K keyElem : tableKey) {
				if(keyElem.equals(key)) {
					break;
				}
				index++;
			}
			tableKey.remove(key);
			tableValues.remove(index);
			size--;
		}
	}

	//checks to see if that key exists
	@Override
	public Boolean containsKey(K key) {
		if(tableKey.contains(key))
			return true;
		else
			return false;
	}

	//returns the size of the hash table
	@Override
	public Integer size() {
		
		return size;
	}

	
}

package tk.dataStructures;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ13ÈÕ
  */
public class ArrayMap<K,V> {
	private K[] keys;
	private V[] values;
	private int size;
	
	public class MapHelper{
		@SuppressWarnings("hiding")
		public <K,V> V get(ArrayMap<K,V> map, K key) {
			if (map.containsKey(key)) return map.getValue(key);
			return null;
		}
		
		@SuppressWarnings("hiding")
		public <K extends Comparable<K>,V> K maxKey(ArrayMap<K,V> map, K key) {
			AList<K> keys=map.keys();
			K largest=keys.get(0);
			for(int i=0;i<keys.getSize();i++) {
				if(keys.get(i).compareTo(largest)>0) largest=keys.get(i);
			}
			return largest;
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayMap() {
		keys=(K[]) new Object[100];
		values=(V[]) new Object[100];
		size=0;
	}
	
	private int keyIndex(K key) {
		for(int i=0;i<size;i++) {
			if(keys[i].equals(key)) return i;
		}
		return -1;
	}
	
	public boolean containsKey(K key) {
		int index=keyIndex(key);
		return index>-1;
	}
	
	public void put(K key,V value) {
		int index=keyIndex(key);
		if(index==-1) {
			keys[size]=key;
			values[size]=value;
			size++;
		}
		else values[index]=value;
	}
	
	public V getValue(K key) {
		int index=keyIndex(key);
		if(index!=-1) return values[index];
		return null;
	}
	
	public int getSize() {
		return size;
	}
	
	public AList<K> keys(){
		AList<K> keylist =new AList<K>();
		for(int i=0;i<keys.length;i++) keylist.addLast(keys[i]);
		return keylist;
	}
	
	public static void main(String[] args) {
		ArrayMap<String,Integer> animals=new ArrayMap<String, Integer>();
		animals.put("Dogs", 1);
		animals.put("Cats", 2);
		StdOut.println(animals.keyIndex("Cats"));
		StdOut.println(animals.getSize());
		StdOut.println(animals.getValue("Dogs"));
		StdOut.println(animals.keys().get(0));
	}
}

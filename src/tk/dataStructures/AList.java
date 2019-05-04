package tk.dataStructures;
/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ5ÈÕ
  */
public class AList<Item> {
	private Item[] item;
	private int size;
	
	@SuppressWarnings("unchecked")
	public AList() {
		item=(Item[])new Object[100]; 
		size=0;
	}
	
	public void lengthen() {
		@SuppressWarnings("unchecked")
		Item[] al=(Item[]) new Object[size*2];
		System.arraycopy(item, 0, al, 0, size);
		item=al;
	}
	
	public void shorten() {
		@SuppressWarnings("unchecked")
		Item[] al=(Item[]) new Object[item.length];
		System.arraycopy(item, 0, al, 0, size);
		item=al;
	}
	
	public void addLast(Item a) {
		if(item.length==size) {
			lengthen();
		}
		item[size]=a;
		size+=1;
	}
	
	public Item getLast() {
		return item[size-1];
	}
	
	public Item get(int a) {
		return item[a];
	}
	
	public int getSize() {
		return size;
	}
	
	public void removeLast() {
		item[size-1]=null;
		size-=1;
		if(size*4<item.length) {
			shorten();
		}
	}
	
	public static void main(String[] args) {
		AList<Integer> arr=new AList<Integer>();
		for(int i=0;i<100;i++) {
			arr.addLast(i);
		}
		arr.removeLast();
		System.out.println(arr.getLast());
		System.out.println(arr.getSize());
	}
	
}

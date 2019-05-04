package tk.dataStructures;

/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ6ÈÕ
  */
public class SLList<Loch> {
	private IntN first;
    private int size;
    
	private class IntN {
		public Loch item;
		public IntN next;

		public IntN(Loch a, IntN b) {
			item = a;
			next = b;
		}
	}

	public SLList() {
		first = null;
		size = 0;
	}
	
	public SLList(Loch x) {
		first=new IntN(x,first);
		size=1;
	}

	public void add(Loch x) {
		first = new IntN(x, first);
		size += 1;
	}

	public Loch show_first() {
		return first.item;
	}
	
	public void addlast(Loch x) {
		IntN p = first;
		if (p == null) {
			p = new IntN(x, null);
		} 
		else {
			while (p.next != null) p = p.next;
			p.next = new IntN(x, null);
			}
		size += 1;
	}
	
/*	private static int size(IntN p) {
		if (p.next==null) {
			return 1;
		}
		return 1+size(p.next);
	} 

	public int size() {
		return size(first);
	}
*/
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		SLList<String> L = new SLList<>("yes");
//		L.add(1000);
//		L.add(10000);
		L.addlast("ok");
		System.out.println(L.size());
	}
}

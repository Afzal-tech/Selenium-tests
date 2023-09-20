package dataStructures;

public class Arrays {
	private int [] items;
	  private int count;

	public Arrays(int length) {
		items = new int[length];
	}


	public void print() {
		for (int i=0; i<count;i ++) {
			System.out.println(items[i]);
		}
	}
	public void insert(int item) {
		if (items.length==count) {
		int[] newitems = new int[count*2];
			for (int i=0; i<count;i ++) {
				newitems[i]= items[i];
				
			}
			items= newitems;
		}
		items[count++]= item;

	}
	
	public void removeAt(int index) {
		//System.out.println("remove at" +index);
	    if (index<0 || index>=count) {
	    throw new IllegalArgumentException();}
		
		for (int i=index; i<count-1; i++) {
			 items[i]= items[i+1];		
		}
		count--;	
	}

	public  int IndexOf(int item) {
		for (int i=0; i<count;i ++) {
			if (items[i]== item)
				return i;
		}
		return -1;
	}

	public boolean is_empty() {
		return count==0;
	}

	public static void main(String[] args) {

		Arrays number = new Arrays(4);
		number .insert(2);
		number .insert(3);
		number .insert(8);
		number .insert(4);
	number.removeAt(2);
		number.print();
		
		System.out.println("its" +number.IndexOf(4));
		System.out.println(number.is_empty());
		
		


	}

}

package dataStructures;

public class Arrays_del {
	
	private int count;
	private int [] array;
	
	public Arrays_del(int n) {
		array = new int [n];	
		
		
	}
	
	
	public void print() {
		for (int i=0; i<count; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	
	public void insert (int value) {
		if (array.length== count) {
			int [] array_new =new int[count*2];
			for (int i =0; i<count;i ++) {
				array_new[i]= array[i];
			}
			array = array_new;
		}	
		array[count]= value;
		count++;
		
	}
	
	public int indexOf(int value) {
		
		for (int i =0; i<count;i++) {
			if (array[i]==value)  return i;	
		}
		return -1;
	}
	
	public void removeAt(int index) {
		if (index<0 || index>=count) {
			throw new IllegalArgumentException();}
	
		for (int i =index; i<count-1;i++) {
			array[i]= array[i+1];
		
	}
		count--;
	
	}
	
	
	
	public static void main(String[] afzal) {
		Arrays_del number=  new Arrays_del (4);
		number.insert(10);
		number.insert(20);
		number.insert(30);
		number.insert(40);
		number.insert(50);
		number.insert(60);
		
		number.removeAt(1);
		number.print();
		System.out.println(number.indexOf(90));
		
	}

}

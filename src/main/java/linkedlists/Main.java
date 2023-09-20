package linkedlists;



public class Main {

	public static void main(String[] args) {
		Linked_List list = new Linked_List();
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addfirst(10);
		list.addfirst(60);
		//list.deleteFirst();
		list.deleteLast();
		System.out.println(list.indexOf(40));
		
		list.print();
	
		//
		

	}

}

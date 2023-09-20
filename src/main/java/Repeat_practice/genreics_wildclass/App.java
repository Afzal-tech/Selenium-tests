package Repeat_practice.genreics_wildclass;

import java.util.ArrayList;

class Machine{
	@Override
	public String toString() {
		return "I am Machine";
	}
	
	public void start() {
		System.out.println("Machine started");
	}
	

	
}
class Camera extends Machine{

	@Override
	public String toString() {
		return "I am Camera";
	}
	public void snap() {
		System.out.println("photo taken");
	}
	
	
}




public class App {
	
	
public static void main(String[] afzal) {
	ArrayList<Machine> list1  = new ArrayList<Machine>();
	list1.add(new Machine());
	list1.add(new Machine());
	
	ArrayList<Camera> list2  = new ArrayList<Camera>();
	list2.add(new Camera());
	list2.add(new Camera());
	
	
	 showlist(list2);
	 
	 
	 
	

	
}
public  static void showlist(ArrayList<? extends Machine > lists) {
	for (Machine value:lists) {
		System.out.println(value);
		value.start();
		
		
		
	}
	
	
}

}

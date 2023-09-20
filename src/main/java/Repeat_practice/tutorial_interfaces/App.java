package Repeat_practice.tutorial_interfaces;

public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.batch_id();
		mach1.Delhi_unit();
		
	
//		mach1.stop();
		
//		Car car1 = new Car();
//		car1.start();
//		car1.show_info();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1= new Machine();
		info1.show_info();
		
		Info info2= person1;
		info2.show_info();
		
		
		outinfo(mach1);
		outinfo(person1);
		
		

	}
	public static void outinfo(Info info) {
		info.show_info();
		
	}

}

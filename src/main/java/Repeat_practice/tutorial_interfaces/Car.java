package Repeat_practice.tutorial_interfaces;

public class Car extends Machine{
	
	@Override
	public void start() {
		//System.out.println("car Started");
		super.start();
		
	}
	
	public void wipe_windshiled() {
		System.out.println("wiping windsheild");
		
		
	}
	public void stop() {
		System.out.println("car Stopped");
	}
	public void show_info() {
		System.out.println("car name is "+ name);
	}
	

}

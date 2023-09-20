package Repeat_practice.tutorial_interfaces;

public abstract class Factoy {
	
	public void Delhi_unit() {
		System.out.println("Delhi Unit");
		
	}
	public abstract void batch_id();
	
	
	// can contain both abstract and non abstract methods
	// class extending abstact class need to provide implementation of all aabstract methods (methods having abstract as keyword) only
	// instance variable are by default static and final
	// we can not create object of abstract method
	// it has a default constrctor but is callaed only when subclass in instantaited

}

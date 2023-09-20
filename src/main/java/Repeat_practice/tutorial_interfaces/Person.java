package Repeat_practice.tutorial_interfaces;

public class Person implements Info{
	private String name ;

	public Person(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Hello there");
	}

	@Override
	public void show_info() {
		// TODO Auto-generated method stub
		System.out.println("person is "+ name);
		
	}
}


package Repeat_practice.tutorial_interfaces;

public class Machine extends Factoy  implements Info {
	private int id=7;
	protected String name= "machine 1";
	
	public void start() {
		System.out.println("Machine Started");
	}
	public void stop() {
		System.out.println("Machine Stopped");
	}
	@Override
	public void show_info() {
		// TODO Autgenerated method stub
		System.out.println("machine id is "+ id);
		
	}
	@Override
	public void batch_id() {
		System.out.println("printed the id");
		// TODO Auto-generated method stub
		
	}

}

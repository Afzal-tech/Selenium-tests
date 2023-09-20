package Repeat_practice;



class Robot{
	// parametrizing the methods in this class
	void speak(String text) {
		System.out.println(text);
		
	}
	
	 void jump(int number) {
		 System.out.println(number);
			
	 }
}

/////// new classs

class Frog{
	// using getters and setters for abtraction
	 private int age;
	private String name;
	
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}
	//setters
	
	public void setName(String name) {
		this.name= name;
		
	}
	public void setAge(int  age) {
		this.age= age;
		
	}
	
	public void setInfo(String name, int age) {
		
		setName(name);
		setAge(age);
	}
		
	
}
class Machine{
	// learmimg construvtorrs
	
	private String name;
	private int code;
	 public Machine(){
		System.out.println("Constructor 1 running");
	}
	 public Machine(String name) {
		 System.out.println("Constructor 2 running");
		 
	 }
     public Machine(String name, int code) {
    	 this.name= name;
    	 this.code= code;
    	 
    	 System.out.println("Constructor 3 running");
		 
	 }	 
	 
}


public class App2 {
// calling class for all
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Robot  sam= new Robot();
//		sam.speak("Hi I am Sam");
//		sam.jump(5);
//		
//		String  string= "hello , how are you";
//		sam.speak(string);

		
		
//		Frog frog=new Frog();
//		//frog.name ="burrow";  // after setting instance variable as private this will not work
//		frog.setName("bertie");
//		frog.setInfo("brows", 2);
//		
//		System.out.println(frog.getName());
//		System.out.println(frog.getAge());
		
		Machine machine = new Machine();
	}

}

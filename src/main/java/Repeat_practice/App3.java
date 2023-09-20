package Repeat_practice;

class Test{
	
	String name;
	int id;
	
	public Test(String name , int id) {
		this.name= name;
		this.id = id;
		
	}
	public Test() {
		
	}
	
}


public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test= new Test();
		
		String text = " ";
		text+= "Hi";
		text+= " how are you?";
		
		System.out.println(text);
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" what are u doing");
		System.out.println(sb.toString());
		
		///fromatting
		System.out.printf(" cost %4d: quantity is %d\n", 7,9);
		
	}

}

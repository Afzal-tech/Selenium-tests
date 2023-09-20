package Repeat_practice;

 class Person {
	String name;
	int age;
	
	// creating subroutines
	void speak() {
		System.out.println("hello, My name is "+name +" and I am "+age+" years old");
	}
	
	int  years_of_retirement() {
		int yearsleft= 65-age;
	return yearsleft;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	

 }




public class App {

	public static void main(String[] args) {
		Person person1 =new Person();
		person1.name = "afzal";
		person1.age= 29;
		person1.speak();
		int years= person1.years_of_retirement();
		
		String name= person1.getName();
		int age= person1.getAge();
		System.out.println(name+ " is the name  and age is "+ age);
		
		System.out.println(years);
		
		Person person2 =new Person();
		person2.name = "bob";
		person2.age= 31;
		person2.speak();
		

	}

}

package questions;

public class Star_Printing {
	
	 public  static void left_star() {
		 
		 for (int x=0; x<5; x++) {
			 for(int j=0; j<=x; j++) {
				 System.out.print(" ");
			 }
			 for (int y=5; y>x; y--) {
				 System.out.print("* ");
			 }
			 System.out.println("");
		 }
			 
	 }
	 
public  static void right_star() {
		 
		 for (int x=0; x<5;x++) {
			 for(int j=5-x;j>0;j--) {
				 System.out.print(" ");
				 
			 }
			 for(int y=0; y<=x; y++) {
				 
				 
				 System.out.print("* ");// add space becomes pyramid and remove it becomes right starr
			 }
			 System.out.println("");
		 }
			 
	 }
public  static void mirror_pyramid() {
	 
	 for (int x=0; x<5;x++) {
		 for(int j=5-x; j>0;j--) {
			 System.out.print(" ");	 
		  }
		 for(int y=0;y<=x;y++) {
			 System.out.print("* ");// add space becomes pyramid and remove it becomes right starr
			 
		  }
		 		 
		 System.out.println("");
	 }
	 for (int x=0; x<5;x++) {
		 for(int j=0; j<=x+1;j++) {
			 System.out.print(" ");	 
		  }
		 for(int y=4;y>x;y--) {
			 System.out.print("* ");// add space becomes pyramid and remove it becomes right starr
			 
		  }
		 		 
		 System.out.println("");
	 }
}

	

	public static void main(String[] args) {
		left_star();
		//right_star();
	//	mirror_pyramid();
		 


	}

}

package examen_ruiz;

public class examen {

	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}
	
	public static void printOne() {
		System.out.print("Helo world");
	}
	
	public static void printTwo() {
		printOne();
		printOne();
	}

}

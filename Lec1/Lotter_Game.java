package Lec1;

public class Lotter_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 768;
		if (n >= 50 && n <= 129) {
			System.out.println("Won Bike");
		} 
		else if (n >= 450 && n <= 569) {
			System.out.println("Won Mac");
		} 
		else if (n >= 259 && n <= 380) {
			System.out.println("Won Cycle");
		} 
		else if (n >= 650 && n <= 785) {
			System.out.println("Won Kurkure");
		} 
		else {
			System.out.println("Happy BirthDay!");
		}

	}

}
